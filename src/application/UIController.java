package application;

import java.io.File;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;
import org.opencv.imgproc.Imgproc;

import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class UIController {
    @FXML private ImageView imageView;
    private CascadeClassifier faceDetector;

    static { System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }

    public UIController() {
        faceDetector = new CascadeClassifier("resources/haarcascade_frontalface_alt.xml");
    }

    @FXML
    private void loadImage() {
        File file = new File("test.jpg"); // 👈 put test image in project folder
        if (!file.exists()) {
            showAlert("No test.jpg file found in project root!");
            return;
        }

        Mat image = Imgcodecs.imread(file.getAbsolutePath());
        detectAndShow(image);
    }

    @FXML
    private void startWebcam() {
        VideoCapture capture = new VideoCapture(0);
        if (!capture.isOpened()) {
            showAlert("Cannot access webcam!");
            return;
        }
        Mat frame = new Mat();
        if (capture.read(frame)) {
            detectAndShow(frame);
        }
        capture.release();
    }

    private void detectAndShow(Mat image) {
        MatOfRect faces = new MatOfRect();
        faceDetector.detectMultiScale(image, faces);

        for (Rect rect : faces.toArray()) {
            Imgproc.rectangle(image, new Point(rect.x, rect.y),
                    new Point(rect.x + rect.width, rect.y + rect.height),
                    new Scalar(0, 255, 0), 2);
        }

        Image fxImage = mat2Image(image);
        imageView.setImage(fxImage);
    }

    private Image mat2Image(Mat frame) {
        try {
            BufferedImage bufferedImage = new BufferedImage(frame.width(), frame.height(), BufferedImage.TYPE_3BYTE_BGR);
            byte[] data = new byte[frame.rows() * frame.cols() * (int)(frame.elemSize())];
            frame.get(0, 0, data);
            bufferedImage.getRaster().setDataElements(0, 0, frame.cols(), frame.rows(), data);
            return SwingFXUtils.toFXImage(bufferedImage, null);
        } catch (Exception e) {
            return null;
        }
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText(msg);
        alert.show();
    }
}
