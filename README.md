# 💫 ASCII Mirror (Java)

A console-based ASCII art manipulation program that reads animal drawings from text files and mirrors them horizontally — creating a "reflection" effect as if placed before a mirror.  

Developed as part of my **[JetBrains Academy](https://www.jetbrains.com/academy/)** learning path, this project demonstrates practical use of **file I/O**, **collections**, and **string processing** in Java.

---

## 🚀 Project Overview

The project progresses through multiple stages, each adding new functionality:

- **File Reading** – Reads ASCII art files safely using `Scanner` and handles invalid paths.
- **Dynamic Formatting** – Adjusts all lines to equal length by padding with whitespaces.
- **List Storage** – Stores all lines in a list for processing and easy transformation.
- **Mirroring Logic** – Creates a horizontally mirrored version of each ASCII drawing, replacing characters such as:
  - `< → >`,  
  - `/ → \`,  
  - `(` → `)`, and vice versa.
- **Final Output** – Prints both the original and mirrored image side by side with a `|` divider.

---

## 🎯 What I Learned

- 📁 **File Handling:** Reading and validating external files in Java using `File` and `Scanner`.
- 🧩 **String Manipulation:** Padding, reversing, and replacing characters dynamically.
- 🔄 **Collections:** Managing and processing lists of lines efficiently.
- ⚙️ **Error Handling:** Detecting missing files or invalid paths gracefully.
- 🪞 **Algorithmic Thinking:** Designing a reversible mirror transformation for text output.

---

## 🔧 Features

- ✅ Reads ASCII art from text files.
- ✅ Prints each line mirrored horizontally.
- ✅ Handles invalid file paths with proper user feedback.
- ✅ Uses lists to store and process line data.
- ✅ Dynamically aligns all lines for clean, symmetrical output.

---

## 🛠️ Technologies Used
[![Java](https://skillicons.dev/icons?i=java&theme=light)](https://www.java.com/en/)

---

## 🤔 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/trayanaboykova/ASCII-Mirror.git
2. Open the project in your Java IDE (e.g., IntelliJ IDEA).
3. Compile and run Main.java.
4. When prompted, enter the path to an ASCII file, for example:
    ```bash
    C:\ASCII_Animals\MooFolder\Cow.txt

## 📈 Learning Outcomes
By completing this project, I:

Strengthened my understanding of file operations and collections in Java.

Learned how to transform and visualize text data dynamically.

Gained experience in structuring a clean console application from start to finish.

## 🌟 Acknowledgments

Thanks to JetBrains Academy / Hyperskill for designing this project and helping me grow my Java problem-solving and text-processing skills.
