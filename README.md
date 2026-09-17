# CampusCare - Lost and Found Item Manager

CampusCare is a Java command-line application for recording and managing lost and found items on a college campus.

The application allows users to register lost or found items, view all records, search for items, mark returned items as resolved, and export records to a text report. The project runs completely through a terminal and does not require a GUI, database, Maven, Gradle, or third-party libraries.

## Problem Statement

Lost belongings are often recorded through informal messages or paper registers. This makes it difficult to search existing records, locate found items, and know whether an item has been returned.

CampusCare provides a simple and structured way to manage these records using a Java command-line application.

## Features

- Register lost items with title, category, location, date, and identifying details.
- Register found items with title, category, location, date, and holding information.
- View all item records.
- Search items by title, category, or location.
- Mark items as resolved after they are returned.
- Export item records to `campuscare_report.txt`.
- Handle invalid numeric input without crashing.
- Validate empty text input.

## Java Concepts Used

| Concept | Usage in CampusCare |
| --- | --- |
| Classes and Objects | Separate classes represent the application and item records. |
| Encapsulation | Item data is stored in private fields with controlled access methods. |
| Abstraction | `Item` is an abstract class containing common item details. |
| Inheritance | `LostItem` and `FoundItem` extend `Item`. |
| Polymorphism | Different item types are stored through `List<Item>`. |
| Collections Framework | `ArrayList` stores a dynamic number of records. |
| File I/O | `FileWriter` and `PrintWriter` generate the text report. |
| Exception Handling | `try-catch` handles invalid input and report-writing errors. |

## Requirements

Before running the project, install:

- Java Development Kit (JDK) 17 or later
- PowerShell, Command Prompt, Terminal, or VS Code terminal
- Git, only if cloning the repository from GitHub

No external dependency is required.

## Verify Java Installation

Open a terminal and run:

    java -version
    javac -version

Both commands should display a Java version.

If `javac` is not recognized, install a JDK, reopen the terminal, and try again.

## Project Structure

    CampusCare/
    ├── CampusCare.java       # Main application and CLI menu
    ├── Item.java             # Abstract parent class
    ├── LostItem.java         # Lost item class
    ├── FoundItem.java        # Found item class
    ├── ItemManager.java      # Item storage, search, and report logic
    ├── README.md             # Project documentation
    ├── statement.md          # Problem statement and project scope
    └── .gitignore            # Ignores generated files

## Installation

### Clone from GitHub

Open a terminal and run:

    git clone https://github.com/AnimeshDaiman/CampusCare.git
    cd CampusCare

### Manual Download

1. Download all Java source files.
2. Create a folder named `CampusCare`.
3. Place all five Java files in the same folder.
4. Open a terminal in that folder.

The required Java files are:

    CampusCare.java
    Item.java
    LostItem.java
    FoundItem.java
    ItemManager.java

## Compile the Project

From the project folder, run:

    javac *.java

Successful compilation creates `.class` files in the same folder. Usually, no message appears when compilation is successful.

## Run the Project

After compilation, run:

    java CampusCare

The application will display the following menu:

    1. Register a lost item
    2. Register a found item
    3. View all items
    4. Search items
    5. Mark an item as resolved
    6. Export report
    0. Exit

## How to Use the Application

### Register a Lost Item

1. Select option `1`.
2. Enter the item title.
3. Enter the category.
4. Enter the location where the item was lost.
5. Enter the reporting date.
6. Enter an identifying detail, such as colour, brand, sticker, or serial number.

### Register a Found Item

1. Select option `2`.
2. Enter the title, category, location, and reporting date.
3. Enter where the item is currently held, such as the security desk or library counter.

### View All Records

Select option `3` to display all stored records.

Each record includes:

- Item ID
- Item type
- Title
- Category
- Location
- Status
- Type-specific information

### Search Records

Select option `4` and enter a keyword.

The program searches using the item title, category, and location.

Examples:

    Library
    Electronics
    Bottle

### Resolve an Item

Select option `5` and enter an item ID.

The item status changes from:

    OPEN

to:

    RESOLVED

### Export the Report

Select option `6`.

The application creates:

    campuscare_report.txt

The report is saved in the same folder where the application was executed.

## Example Output

    Welcome to CampusCare: Lost-and-Found Item Manager

    Choose an option: 3

    #1 | LOST | Blue water bottle | Personal item | Library | OPEN
      Identifying detail: Silver sticker on the lid

    #2 | FOUND | USB drive | Electronics | Computer Lab 2 | OPEN
      Currently held by: Security desk

## Input Validation

The application handles common input errors:

- Empty text values are rejected.
- Invalid menu numbers are rejected.
- Text entered instead of a number is handled safely.
- Missing item IDs cannot be resolved.
- Already resolved items cannot be resolved again.

## Generated Report

The generated `campuscare_report.txt` file contains:

- Total number of records
- Item ID
- Item type
- Item title and category
- Location and reporting date
- Item-specific details
- Current resolution status

The report file is ignored by Git because it is generated output and can be recreated at any time.

## Troubleshooting

### `javac` Is Not Recognized

Install a JDK, reopen the terminal, and run:

    javac -version

### Could Not Find or Load Main Class

Ensure that the terminal is open in the project folder, then run:

    javac *.java
    java CampusCare

### Missing Class Errors

Confirm that all five `.java` files are stored in the same project folder.

### Report File Is Not Visible

Use menu option `6`, then check the same folder from which you executed:

    java CampusCare

## Current Limitations

The current version stores data only while the application is running.

It does not currently support:

- Database storage
- Login or authentication
- Loading records after restart
- Image upload
- Notifications
- GUI or web interface

## Future Enhancements

- Save and load records between application runs.
- Add edit and delete options.
- Add filters for open and resolved items.
- Add date validation.
- Add image support.
- Add a database.
- Create a GUI or web version.

## Submission Notes

- Keep this `README.md` file at the repository root.
- Keep the GitHub repository public.
- Test the project through a terminal before submission.
- Upload this README file on the course portal.
- Upload the project report separately.
- Submit only the repository root link:

    https://github.com/AnimeshDaiman/CampusCare

Do not submit a GitHub link containing `/tree/main`, `/blob`, or a specific file path.
