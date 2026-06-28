# 📝 Suggested Git Commit Messages

Use these commit messages when pushing your code to GitHub.
They follow the **Conventional Commits** style for clarity and professionalism.

---

## 🚀 Initial Setup

```
chore: initialize repository with README, .gitignore, and LICENSE
```

---

## 📦 Chapter-by-Chapter Commits

Use one commit per chapter for a clean, readable Git history:

```
feat(ch01): add chapter 01 — Java basics, variables, loops, and I/O exercises

feat(ch02): add chapter 02 — classes, objects, methods, and instance variables

feat(ch03): add chapter 03 — primitives, references, and heap/stack memory model

feat(ch04): add chapter 04 — object behaviour, method overloading, constructors

feat(ch05): add chapter 05 — extra-strength methods and SimpleStartup game logic

feat(ch06): add chapter 06 — Java library usage, ArrayList, and StartupBust game

feat(ch07): add chapter 07 — inheritance, polymorphism, and IS-A/HAS-A relationships

feat(ch08): add chapter 08 — interfaces, abstract classes, and Java type contracts

feat(ch09): add chapter 09 — constructors, super(), and garbage collection

feat(ch10): add chapter 10 — static variables, static methods, and the Math class

feat(ch11): add chapter 11 — collections, generics, Comparable, Comparator, and Lambdas

feat(ch12): add chapter 12 — Lambdas and Streams (filter, map, collect)

feat(ch13): add chapter 13 — exception handling, try/catch/finally, checked exceptions

feat(ch14): add chapter 14 — GUI basics with Swing (JFrame, JButton, animation)

feat(ch15): add chapter 15 — Swing widgets (layouts, JList, JCheckBox, JTextArea)

feat(ch16): add chapter 16 — serialization and file I/O (QuizCard builder/player)

feat(ch17): add chapter 17 — networking with sockets (chat client and server)

feat(ch18): add chapter 18 — concurrency, threads, race conditions, synchronization
```

---

## 🧩 DSA and Personal Practice

```
feat(dsa): add array DSA problems (sum, min/max, rotate, two-sum, frequency)

feat(practice): add personal practice set covering all chapters — extended exercises
```

---

## 🔧 Maintenance Commits (use as needed)

```
docs: update README with project structure and run instructions

chore: remove compiled .class and .ser files from repository

fix(ch11): correct package declaration in Jukebox sorting examples

refactor(practice): reorganise personal practice files by topic

docs: add disclaimer and license information to README
```

---

## 💡 Tips for a Clean Git History

- **One logical change per commit** — don't mix chapters in a single commit.
- **Use present tense** — "add chapter 05" not "added chapter 05".
- **Keep subject lines under 72 characters.**
- **Use the body** (optional) for longer explanations when needed:

```bash
git commit -m "feat(ch17): add networking chapter — client/server socket examples

Includes SimpleChatClient, SimpleChatServer, DailyAdviceClient,
and DailyAdviceServer. Server uses ExecutorService thread pool
to handle multiple concurrent clients."
```
