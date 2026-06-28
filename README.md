# ☕ Head First Java — Practice Code Repository

> My personal Java learning journey through *Head First Java, 3rd Edition* by Kathy Sierra, Bert Bates & Trisha Gee.

---

## 📖 About the Book

**Head First Java (3rd Edition)** is one of the most beginner-friendly Java books ever written. It uses a visual, brain-friendly format — full of puzzles, stories, and exercises — to teach core Java concepts in a way that actually sticks.

Topics covered in the book include:
- Object-Oriented Programming fundamentals
- Java Collections and Generics
- Lambdas and Streams (modern Java)
- GUI development with Swing
- File I/O and Serialization
- Networking and Sockets
- Multithreading and Concurrency

---

## 🧭 My Learning Journey

I worked through this book chapter by chapter, typing out, running, and experimenting with every exercise and code example. Along the way I also built a personal practice set where I revisited concepts on my own, and solved Array-based DSA problems to bridge theory with problem-solving.

This repository is a snapshot of **everything I wrote myself** while learning Java from scratch. It is not a perfect codebase — it is an honest one, showing real progress from "Hello, World" to networking and concurrency.

---

## 📁 Repository Structure

```
head-first-java-practice/
│
├── chapter_01/          # Diving In — variables, loops, if/else, basic I/O
├── chapter_02/          # Classes & Objects — fields, methods, object state
├── chapter_03/          # Primitives & References — stack vs heap, memory model
├── chapter_04/          # Object Behaviour — method overloading, constructors
├── chapter_05/          # Extra-Strength Methods — game logic, unit thinking
├── chapter_06/          # Using the Java Library — ArrayList, API usage
├── chapter_07/          # Inheritance & Polymorphism — IS-A, HAS-A
├── chapter_08/          # Interfaces & Abstract Classes — contracts in Java
├── chapter_09/          # Constructors & GC — super(), garbage collection
├── chapter_10/          # Static & Final — static variables, Math class
├── chapter_11/          # Collections & Generics — sort, Comparable, Comparator, Lambda
├── chapter_12/          # Lambdas & Streams — filter, map, collect, terminal ops
├── chapter_13/          # Exception Handling — try/catch/finally, checked exceptions
├── chapter_14_GUI/      # GUI with Swing — JFrame, JButton, inner classes, animation
├── chapter_15_GUI/      # Swing Widgets — layouts, JList, JCheckBox, JTextArea
├── chapter_16/          # Serialization & File I/O — object persistence, file read/write
├── chapter_17/          # Networking & Sockets — client-server, chat application
├── chapter_18/          # Concurrency — threads, race conditions, synchronization
│
├── dsa_practice/        # Array DSA problems practiced alongside the book
│   └── Arrays/          # Sum, min/max, rotate, two-sum, frequency, etc.
│
└── personal_practice/   # Extended personal practice — all topics, free exploration
```

---

## 🗂️ Chapter-by-Chapter Highlights

| Chapter | Topic | Key Files |
|---------|-------|-----------|
| 01 | Java Basics | `PhraseOMatic.java`, `BottleSong.java` |
| 02 | Classes & Objects | `PoolPuzzle.java`, `CodeMagnets.java` |
| 03 | Memory Model | `Triangle.java`, `HeapQuiz.java` |
| 05 | Method Logic | `SimpleStartup.java`, `SimpleStartupTest.java` |
| 06 | Java Library | `StartupBust.java`, `GameHelper.java` |
| 11 | Collections | `Jukebox1–5.java`, `SortMountains.java` |
| 12 | Streams | `JukeboxStream_filter.java`, `TerminalOperations.java` |
| 13 | Exceptions | `MiniMusicCmdLine.java`, `TestExceptions.java` |
| 14 | Swing GUI | `SimpleGui3.java`, `SimpleAnimation.java` |
| 16 | File I/O | `QuizCardBuilder.java`, `QuizCardPlayer.java` |
| 17 | Networking | `SimpleChatClient.java`, `SimpleChatServer.java` |
| 18 | Concurrency | `RyanAndMonicaTest.java`, `TwoThreadsWriting.java` |

---

## 🔧 How to Run

**Requirements:** Java 17+ (Java 21 recommended)

```bash
# Clone the repository
git clone https://github.com/YOUR_USERNAME/head-first-java-practice.git
cd head-first-java-practice

# Compile a specific chapter file (from repo root)
javac chapter_01/PhraseOMatic.java

# Run it
java chapter_01.PhraseOMatic

# Compile all files in a chapter
javac chapter_11/*.java

# Run a chapter file
java chapter_11.Jukebox4_Lambda
```

> **Note:** Most files use package declarations matching their folder names, so always compile and run from the repo root.

---

## 📊 Stats

| Section | Files |
|---------|-------|
| Chapter exercises (ch01–ch18) | ~110 `.java` files |
| Personal practice set | ~220 `.java` files |
| DSA — Arrays | 16 `.java` files |
| **Total** | **~337 `.java` files** |

---

## ⚠️ Disclaimer

This repository contains **only my own handwritten practice code** written while studying the book.

- ❌ No copyrighted book text, images, or scanned pages are included.
- ❌ No solutions copied verbatim from any answer key or external source.
- ✅ All code was written by me, inspired by the exercises, puzzles, and examples in the book.
- ✅ This repository is shared for personal portfolio and learning purposes only.

*Head First Java* is a trademark of O'Reilly Media. I have no affiliation with the authors or publisher.

---

## 📜 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

You are free to use, reference, or learn from any code in this repository.

---

## 🙋 About Me

I'm learning Java through structured study and hands-on practice. This repository is part of my journey toward becoming a proficient Java developer.

Feel free to ⭐ star this repo if you find it useful, or open an issue if you spot something interesting!
