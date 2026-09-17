# CampusCare - Lost-and-Found Item Manager

CampusCare is a Java command-line application for recording and managing lost and found items on a college campus. It allows users to register items, search records, mark returned items as resolved, and export a text report.

The project runs entirely in a terminal. It does not require a GUI, database, internet connection, Maven, Gradle, or external Java libraries.

## Problem Statement

Lost belongings are often reported through informal messages or paper registers. This makes it difficult to search for a record, identify where a found item is held, or know whether an item has already been returned.

CampusCare provides a structured solution by storing lost and found item information in a single application.

## Features

- Register a lost item.
- Register a found item.
- Store title, category, location, date, and item-specific details.
- View all registered records.
- Search items by title, category, or location.
- Mark a returned item as `RESOLVED`.
- Export all records to `campuscare_report.txt`.
- Handle invalid menu input without crashing.

## Java Concepts Used

| Java Concept | Usage in Project |
| --- | --- |
| Classes and Objects | Separate classes represent the application and item records. |
| Encapsulation | Item data is stored in private fields with controlled access methods. |
| Abstraction | `Item` is an abstract parent class. |
| Inheritance | `LostItem` and `FoundItem` extend `Item`. |
| Polymorphism | Both item types are stored as `Item` objects. |
| Collections Framework | `ArrayList` stores a dynamic list of records. |
| File I/O | `FileWriter` and `PrintWriter` export the item report. |
| Exception Handling | `try-catch` handles invalid numeric input and file errors. |

## Requirements

Install the following before running the project:

- Java Development Kit (JDK) 17 or later
- PowerShell, Command Prompt, or VS Code terminal
- Git, only if cloning from GitHub

No other dependency is required.

## Verify Java Installation

Open a terminal and run:

```bash
java -version
javac -version
Both commands should display a Java version.
If javac is not recognized, install a JDK and reopen the terminal.
Project Structure
CampusCare/
├── CampusCare.java       # Main class and menu
├── Item.java             # Abstract parent class
├── LostItem.java         # Lost-item class
├── FoundItem.java        # Found-item class
├── ItemManager.java      # Item storage, search, and report logic
├── README.md             # Project documentation
├── statement.md          # Project statement and scope
└── .gitignore
Installation
Option 1: Clone from GitHub
git clone https://github.com/AnimeshDaiman/CampusCare.git
cd CampusCare
Option 2: Download Manually
1. Download all .java files.
2. Keep all Java files in one folder named CampusCare.
3. Open a terminal in that folder.
Compile the Project
From the project folder, run:
javac *.java
Successful compilation normally produces no message. It creates .class files in the same folder.
Run the Project
java CampusCare
The application will display this menu:
1. Register a lost item
2. Register a found item
3. View all items
4. Search items
5. Mark an item as resolved
6. Export report
0. Exit
How to Use the Application
1. Select 1 to register a lost item.
2. Select 2 to register a found item.
3. Select 3 to view all available records.
4. Select 4 to search using an item title, category, or location.
5. Select 5 to mark an item as resolved using its ID.
6. Select 6 to export a text report.
7. Select 0 to exit.
Generated Report
When menu option 6 is selected, the application creates:
campuscare_report.txt
The report is saved in the same folder where the program is run. It contains the item records and their current status.
Example Output
Welcome to CampusCare: Lost-and-Found Item Manager

Choose an option: 3
#1 | LOST | Blue water bottle | Personal item | Library | OPEN
  Identifying detail: Silver sticker on the lid

#2 | FOUND | USB drive | Electronics | Computer Lab 2 | OPEN
  Currently held by: Security desk
Troubleshooting
javac is not recognized
Install a JDK, ensure it is added to the system PATH, reopen the terminal, and run:
javac -version
Could not find or load main class CampusCare
Make sure you are inside the folder containing CampusCare.java. Compile the project first:
javac *.java
java CampusCare
Missing class errors
Check that all five Java files are in the same folder:
CampusCare.java
Item.java
LostItem.java
FoundItem.java
ItemManager.java
Report file is not visible
Run menu option 6, then check the same folder from which you executed:
java CampusCare
Future Enhancements
- Save and reload records between application runs.
- Add filters for open and resolved items.
- Add edit and delete functions.
- Add a database.
- Create a web or GUI version.
- Add image attachments for found items.
Submission Notes
- Keep this README.md at the repository root.
- Ensure the GitHub repository is public.
- Test javac *.java and java CampusCare before submission.
- Submit only the repository root link: https://github.com/AnimeshDaiman7/CampusCare.git
