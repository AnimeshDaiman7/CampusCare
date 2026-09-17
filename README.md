# CampusCare - Lost-and-Found Item Manager

CampusCare is a menu-driven Java command-line application for registering and tracking lost and found items on a college campus. It helps a campus help desk maintain item records, search for possible matches, resolve returned items, and export a plain-text report.

## Features

- Register lost and found items with an item title, category, location, and date.
- Store different item types using inheritance and an abstract parent class.
- View all records and search by title, category, or location.
- Mark an item as resolved after it is returned.
- Export all records to `campuscare_report.txt`.
- Validate menu and numerical input without crashing.

## Java concepts demonstrated

- Classes and objects
- Encapsulation through private fields and public methods
- Abstraction with the abstract `Item` class
- Inheritance with `LostItem` and `FoundItem`
- Polymorphism through a collection of `Item` objects
- `ArrayList` and `List` from the Collections Framework
- File I/O using `FileWriter` and `PrintWriter`
- Exception handling using `try-catch`

## Requirements

- Java Development Kit (JDK) 17 or later. JDK 11 also works because the program uses only standard Java features.
- A terminal such as PowerShell, Command Prompt, or a VS Code terminal.

## Setup and execution

1. Clone your public repository and open its folder in a terminal.

   ```bash
   git clone https://github.com/YOUR-USERNAME/CampusCare.git
   cd CampusCare
   ```

2. Compile all Java files.

   ```bash
   javac *.java
   ```

3. Run the application.

   ```bash
   java CampusCare
   ```

4. Use menu option `6` to create `campuscare_report.txt`. This generated file is intentionally ignored by Git.

## Example menu

```text
1. Register a lost item
2. Register a found item
3. View all items
4. Search items
5. Mark an item as resolved
6. Export report
0. Exit
```

## Project structure

```text
CampusCare/
├── CampusCare.java       # Main CLI program
├── Item.java             # Abstract parent class
├── LostItem.java         # Lost-item subtype
├── FoundItem.java        # Found-item subtype
├── ItemManager.java      # Collection and report logic
├── README.md             # Setup and usage instructions
├── statement.md          # Problem statement and scope
└── .gitignore
```
