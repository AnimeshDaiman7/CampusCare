CampusCare - Lost-and-Found Item Manager
A Java command-line application for registering, searching, tracking, and exporting campus lost-and-found records.
Features
- Register lost and found items
- Search by title, category, or location
- View all records and item status
- Mark returned items as resolved
- Export records to campuscare_report.txt
- Validate invalid menu and numeric input
Java Concepts
- Encapsulation
- Abstraction
- Inheritance
- Polymorphism
- ArrayList and List
- File I/O
- Exception handling
Requirements
- JDK 17 or later
- PowerShell, Command Prompt, or VS Code terminal
- No external dependencies, database, Maven, or Gradle required
Check Java installation:
java -version
javac -version
Project Structure
CampusCare/
├── CampusCare.java
├── Item.java
├── LostItem.java
├── FoundItem.java
├── ItemManager.java
├── README.md
├── statement.md
└── .gitignore
Run the Project
Clone the repository:
git clone https://github.com/AnimeshDaiman/CampusCare.git
cd CampusCare
Compile all Java files:
javac *.java
Run the application:
java CampusCare
Menu Options
1. Register a lost item
2. Register a found item
3. View all items
4. Search items
5. Mark an item as resolved
6. Export report
0. Exit
Generated Report
Choose menu option 6 to generate:
campuscare_report.txt
The report is saved in the same folder where the application is executed.
Troubleshooting
javac is not recognized
Install a JDK, reopen the terminal, and run javac -version.
Could not find or load main class
Make sure you are inside the project folder, then run:
javac *.java
java CampusCare
Missing class errors
Ensure all five .java files are in the same project folder.
Future Enhancements
- Save data between application runs
- Add edit and delete options
- Add filters for resolved and open items
- Add database support
- Build a GUI or web version
Submission Notes
- Keep this README at the repository root.
- Keep the GitHub repository public.
- Verify the project runs in a terminal before submission.
- Submit only: https://github.com/AnimeshDaiman7/CampusCare.git
