import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/** Stores and operates on CampusCare records using the Java Collections Framework. */
public class ItemManager {
    private final List<Item> items = new ArrayList<>();
    private int nextId = 1;

    public Item addLostItem(String title, String category, String location, String date, String detail) {
        Item item = new LostItem(nextId++, title, category, location, date, detail);
        items.add(item);
        return item;
    }

    public Item addFoundItem(String title, String category, String location, String date, String heldBy) {
        Item item = new FoundItem(nextId++, title, category, location, date, heldBy);
        items.add(item);
        return item;
    }

    public List<Item> getAllItems() { return new ArrayList<>(items); }

    public List<Item> searchByKeyword(String keyword) {
        List<Item> matches = new ArrayList<>();
        String query = keyword.toLowerCase();
        for (Item item : items) {
            if (item.getTitle().toLowerCase().contains(query)
                    || item.getCategory().toLowerCase().contains(query)
                    || item.getLocation().toLowerCase().contains(query)) {
                matches.add(item);
            }
        }
        return matches;
    }

    public boolean resolveItem(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                if (item.isResolved()) return false;
                item.markResolved();
                return true;
            }
        }
        return false;
    }

    public void exportReport(String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("CAMPUSCARE - LOST AND FOUND REPORT");
            writer.println("===================================");
            writer.println("Total records: " + items.size());
            writer.println();
            for (Item item : items) {
                writer.println(item.summary());
                writer.println("  Date reported: " + item.getDateReported());
                writer.println("  " + item.getExtraDetail());
                writer.println();
            }
        }
    }
}
