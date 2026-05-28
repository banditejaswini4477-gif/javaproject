# Digital Diary / Notes Manager

## Project Overview

Digital Diary is a Java GUI application used to create, save, load, edit, and delete personal notes.
The project uses Java Swing for GUI, file handling for storing notes, and password protection for security.

---

# Features

* Create Notes
* Edit Notes
* Delete Notes
* Save Notes to Files
* Load Saved Notes
* Password Protection
* Simple GUI Interface

---

# Technologies Used

* Java
* Java Swing
* File Handling
* Exception Handling
* OOP Concepts

---

# Project Structure

```plaintext
DigitalDiary/
│
├── src/
│   ├── Main.java
│   ├── LoginFrame.java
│   ├── DiaryFrame.java
│   ├── Note.java
│   ├── FileManager.java
│   └── NoteManager.java
│
├── notes/
│
└── README.md
```

---

# File Description

| File Name        | Description             |
| ---------------- | ----------------------- |
| Main.java        | Starts the application  |
| LoginFrame.java  | Handles password login  |
| DiaryFrame.java  | Main diary GUI window   |
| Note.java        | Stores note data        |
| FileManager.java | Handles file operations |
| NoteManager.java | Manages note creation   |

---

# Concepts Used

## GUI

Java Swing is used to create windows, buttons, labels, and text areas.

## File Handling

Notes are stored as `.txt` files inside the `notes` folder.

## Exception Handling

Try-catch blocks are used to prevent program crashes.

## OOP Concepts

Classes and objects are used for modular programming.

---

# How the Project Works

1. Application starts from `Main.java`
2. Login window opens
3. User enters password
4. Main diary window opens
5. User can:

   * Write notes
   * Save notes
   * Load notes
   * Delete notes

---

# Default Password

```plaintext
1234
```

---

# Output Flow

```plaintext
Main.java
    ↓
LoginFrame.java
    ↓
DiaryFrame.java
    ↓
FileManager.java
    ↓
notes folder
```

---

# How to Run

## Using IntelliJ IDEA or Eclipse

1. Open the project
2. Compile all Java files
3. Run `Main.java`

---

# Example

## Saved File

```plaintext
notes/Java.txt
```

## File Content

```plaintext
Java is an object oriented programming language.
```

---

# Future Enhancements

* Database connectivity
* User registration
* Multiple users
* Dark mode UI
* Cloud storage support

---

# Author
Tejaswini
