class Box {
    protected int size;

    public Box(int size) {
        this.size = size;
    }

    public void shrink(int n) throws ShrinkException {
        if (n < 0) {
            throw new ShrinkException("Cannot shrink by a negative amount: " + n);
        }
        size -= n;
    }
}


