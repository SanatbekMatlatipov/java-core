public enum BreadRollType {
    LOAF_BREAD("Loaf bread"),
    WHITE_BREAD("White bread"),
    WHEAT_BREAD("Wheat bread"),
    WHOLE_GRAIN("Whole grain"),
    RYE_BREAD("Rye bread"),
    PRETZEL("Pretzel"),
    SWISS_ROLL("Swiss roll(UK)");
    private final String label;

    private BreadRollType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
