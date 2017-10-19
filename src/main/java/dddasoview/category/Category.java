package dddasoview.category;

public enum Category {
    POTTERY_EXPERIENCE("陶芸体験"),
    GLASSWORK("ガラス細工"),
    CANOE_KAYAK("カヌーカヤック"),
    PARAGLIDER("パラグライダー");

    private String label;

    Category(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
