import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/** Menu-driven entry point for the CampusCare application. */
public class CampusCare {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final ItemManager MANAGER = new ItemManager();

    public static void main(String[] args) {
        seedExampleRecords();
        System.out.println("Welcome to CampusCare: Lost-and-Found Item Manager");

        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("Choose an option: ");
            switch (choice) {
                case 1 -> registerLostItem();
                case 2 -> registerFoundItem();
                case 3 -> displayItems(MANAGER.getAllItems());
                case 4 -> searchItems();
                case 5 -> resolveItem();
                case 6 -> exportReport();
                case 0 -> running = false;
                default -> System.out.println("Please enter a number from 0 to 6.");
            }
        }
        System.out.println("Thank you for using CampusCare.");
    }

    private static void printMenu() {
        System.out.println("\n1. Register a lost item");
        System.out.println("2. Register a found item");
        System.out.println("3. View all items");
        System.out.println("4. Search items");
        System.out.println("5. Mark an item as resolved");
        System.out.println("6. Export report");
        System.out.println("0. Exit");
    }

    private static void registerLostItem() {
        String[] common = readCommonFields();
        String detail = readText("Enter an identifying detail: ");
        Item item = MANAGER.addLostItem(common[0], common[1], common[2], common[3], detail);
        System.out.println("Lost-item record created with ID " + item.getId() + ".");
    }

    private static void registerFoundItem() {
        String[] common = readCommonFields();
        String heldBy = readText("Enter where/who holds the item: ");
        Item item = MANAGER.addFoundItem(common[0], common[1], common[2], common[3], heldBy);
        System.out.println("Found-item record created with ID " + item.getId() + ".");
    }

    private static String[] readCommonFields() {
        return new String[] {
                readText("Item title: "), readText("Category: "),
                readText("Location: "), readText("Date reported (DD-MM-YYYY): ")
        };
    }

    private static void displayItems(List<Item> items) {
        if (items.isEmpty()) {
            System.out.println("No matching records found.");
            return;
        }
        for (Item item : items) {
            System.out.println(item.summary());
            System.out.println("  " + item.getExtraDetail());
        }
    }

    private static void searchItems() {
        String keyword = readText("Search by title, category, or location: ");
        displayItems(MANAGER.searchByKeyword(keyword));
    }

    private static void resolveItem() {
        int id = readInt("Enter the item ID to resolve: ");
        if (MANAGER.resolveItem(id)) {
            System.out.println("Item marked as resolved.");
        } else {
            System.out.println("ID not found, or the item is already resolved.");
        }
    }

    private static void exportReport() {
        try {
            MANAGER.exportReport("campuscare_report.txt");
            System.out.println("Report saved as campuscare_report.txt.");
        } catch (IOException exception) {
            System.out.println("Could not save the report: " + exception.getMessage());
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a whole number.");
            }
        }
    }

    private static String readText(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();
            if (!input.isEmpty()) return input;
            System.out.println("This field cannot be empty.");
        }
    }

    private static void seedExampleRecords() {
        MANAGER.addLostItem("Blue water bottle", "Personal item", "Library", "14-09-2026", "Silver sticker on the lid");
        MANAGER.addFoundItem("USB drive", "Electronics", "Computer Lab 2", "15-09-2026", "Security desk");
    }
}
