# FaceDetectionApp 🎯

![Repo Size](https://img.shields.io/github/repo-size/aadityaguptaaa/FaceDetectionApp?color=blue)
![Contributors](https://img.shields.io/github/contributors/aadityaguptaaa/FaceDetectionApp?color=green)
![Stars](https://img.shields.io/github/stars/aadityaguptaaa/FaceDetectionApp?style=social)
![Forks](https://img.shields.io/github/forks/aadityaguptaaa/FaceDetectionApp?style=social)
![Issues](https://img.shields.io/github/issues/aadityaguptaaa/FaceDetectionApp)
![License](https://img.shields.io/github/license/aadityaguptaaa/FaceDetectionApp)

**FaceDetectionApp** is a **JavaFX desktop application** that performs **real-time face detection** using **OpenCV’s Haar Cascade classifier**. It provides a **user-friendly GUI** for capturing video or images and detecting human faces instantly. Ideal for learning, prototyping, or building advanced face recognition systems.  

---

## 🚀 Key Features
- **Real-Time Detection:** Detect faces from webcam or video input instantly.  
- **Intuitive GUI:** Built with JavaFX (`UI.fxml` & `UIController.java`) for smooth interaction.  
- **Modular Architecture:** Clean code structure with `FaceDetector`, `Main`, and `UIController`.  
- **Customizable Design:** Interface styled via `styles.css`.  
- **Extensible:** Expandable for face recognition, tracking, or AI applications.  

---

## 🛠️ Technology Stack
| Component | Technology |
|-----------|------------|
| Programming Language | Java |
| GUI Framework | JavaFX |
| Computer Vision Library | OpenCV (Haar Cascade) |
| IDE | Eclipse |
| Styling | CSS (`styles.css`) |

---

## ⚙️ Installation & Setup
1. **Clone the repository:**  
```bash
git clone https://github.com/aadityaguptaaa/FaceDetectionApp.git
```

2. **Open the project in Eclipse IDE.**

3. **Add OpenCV library** to the build path:  
   - Download OpenCV: [https://opencv.org/releases/](https://opencv.org/releases/)  
   - Configure **native library location** in Eclipse  

4. **Run the project:**  
   - Execute `Main.java` as a Java Application  
   - GUI window opens to start real-time face detection  

---

## 🎮 Usage Guide
1. Launch the application from Eclipse.  
2. Click **Start Webcam** to begin video capture.  
3. Detected faces will be **highlighted in real-time**.  

> Tip: Adjust Haar Cascade parameters in `FaceDetector.java` for better accuracy.  

---

## 🤝 Contributing
We welcome contributions!  
1. Fork the repository  
2. Create a branch (`git checkout -b feature-name`)  
3. Commit changes (`git commit -m "Add feature"`)  
4. Push branch (`git push origin feature-name`)  
5. Open a **Pull Request**  

---

## 📄 License
This project is **open-source** under the [MIT License](LICENSE). Use, modify, and distribute freely.  

---

## ✨ Future Enhancements
- Face recognition using deep learning models  
- Export detected faces as images  
- Multi-face tracking  
- Standalone executable for distribution  

---

### ⚡ Optional GitHub Actions Badges (for advanced users)
Once you add GitHub Actions for builds/tests, you can include badges like:  
```markdown
![Java CI](https://github.com/aadityaguptaaae/FaceDetectionApp/actions/workflows/build.yml/badge.svg)
![Coverage](https://img.shields.io/codecov/c/github/aadityaguptaaa/FaceDetectionApp)
```
These **automatically update** to show repo health, build status, and code coverage.

