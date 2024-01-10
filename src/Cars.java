public enum Cars {

    FIRSTCAR(23), SECONDCAR(2), THIRDCAR(23), FOURTHCAR(136), FIFTHCAR(440);

    private int weight;

     Cars(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
