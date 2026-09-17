/**
 * Abstract parent for every item registered in CampusCare.
 * It demonstrates abstraction and encapsulation in a small CLI project.
 */
public abstract class Item {
    private final int id;
    private final String title;
    private final String category;
    private final String location;
    private final String dateReported;
    private boolean resolved;

    protected Item(int id, String title, String category, String location, String dateReported) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.location = location;
        this.dateReported = dateReported;
        this.resolved = false;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getLocation() { return location; }
    public String getDateReported() { return dateReported; }
    public boolean isResolved() { return resolved; }
    public void markResolved() { resolved = true; }

    public abstract String getItemType();
    public abstract String getExtraDetail();

    public String summary() {
        String status = resolved ? "RESOLVED" : "OPEN";
        return String.format("#%d | %s | %s | %s | %s | %s", id, getItemType(), title,
                category, location, status);
    }
}
