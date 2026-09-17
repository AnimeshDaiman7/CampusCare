/** A reported item that was found and can be returned to its owner. */
public class FoundItem extends Item {
    private final String heldBy;

    public FoundItem(int id, String title, String category, String location,
                     String dateReported, String heldBy) {
        super(id, title, category, location, dateReported);
        this.heldBy = heldBy;
    }

    @Override
    public String getItemType() { return "FOUND"; }

    @Override
    public String getExtraDetail() { return "Currently held by: " + heldBy; }
}
