
# FaceDetectionApp

**FaceDetectionApp** is a JavaFX-based desktop application that performs real-time face detection using OpenCV’s Haar Cascade classifier. The application provides an intuitive graphical interface for capturing video or images and automatically detecting human faces.

## Key Features
- Real-time face detection from webcam or video input  
- JavaFX-based GUI for easy interaction (`UI.fxml` and `UIController.java`)  
- Modular code structure with `FaceDetector`, `Main`, and `UIController` classes  
- Customizable interface styling with `styles.css`  
- Extensible for advanced face recognition or tracking projects  

## Technology Stack
- **Programming Language:** Java  
- **GUI Framework:** JavaFX  
- **Computer Vision Library:** OpenCV (Haar Cascade)  
- **IDE:** Eclipse (project structure included)  

## Installation & Setup
1. Clone the repository:
```bash
git clone https://github.com/your-username/FaceDetectionApp.git
```

2. Open the project in **Eclipse IDE**.

3. Add **OpenCV library** to the project build path:
   - Download OpenCV (https://opencv.org/releases/)
   - Configure the native library location in Eclipse

4. Run the project:
   - Run `Main.java` as a Java Application
   - The GUI window will open allowing real-time face detection

## Usage
1. Launch the application from Eclipse.
2. Use the GUI to start webcam capture.
3. Faces detected in the video stream will be highlighted in real-time.

## Contributing
Contributions are welcome! Please fork the repository and create a pull request for any enhancements or bug fixes.

## License
This project is open-source and free to use under the [MIT License](LICENSE).

## Screenshots
*(Optional: Add images of your application running, e.g., webcam detection UI)*
