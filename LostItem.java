/** A reported item whose owner is trying to find it. */
public class LostItem extends Item {
    private final String identifyingDetail;

    public LostItem(int id, String title, String category, String location,
                    String dateReported, String identifyingDetail) {
        super(id, title, category, location, dateReported);
        this.identifyingDetail = identifyingDetail;
    }

    @Override
    public String getItemType() { return "LOST"; }

    @Override
    public String getExtraDetail() { return "Identifying detail: " + identifyingDetail; }
}
