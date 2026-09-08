class LabeledBox extends Box {
    private String label;

    public LabeledBox(int size, String label) {
        super(size);
        this.label = label;
    }
}
