package application;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

public class FaceDetector {
    private CascadeClassifier faceDetector;

    // Load OpenCV native library once
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public FaceDetector() {
        try {
            // Load cascade file from resources
        	InputStream is = getClass().getResourceAsStream("/haarcascade_frontalface_alt.xml");

            if (is == null) {
                throw new RuntimeException("❌ Haarcascade XML not found in resources folder!");
            }

            // Copy to a temp file (OpenCV needs a real file path)
            Path tempFile = Files.createTempFile("haarcascade", ".xml");
            Files.copy(is, tempFile, StandardCopyOption.REPLACE_EXISTING);

            faceDetector = new CascadeClassifier(tempFile.toAbsolutePath().toString());

            if (faceDetector.empty()) {
                throw new RuntimeException("❌ Failed to load Haar Cascade classifier!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to detect faces in an image (Mat)
    public Mat detectFaces(Mat image) {
        MatOfRect faces = new MatOfRect();
        faceDetector.detectMultiScale(image, faces);

        for (Rect rect : faces.toArray()) {
            Imgproc.rectangle(image,
                    new Point(rect.x, rect.y),
                    new Point(rect.x + rect.width, rect.y + rect.height),
                    new Scalar(0, 255, 0), 2);
        }
        return image;
    }
}
