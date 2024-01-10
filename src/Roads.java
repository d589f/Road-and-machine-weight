public enum Roads {
    FIRSTROAD(10), SECONDROAD(20), THIRDROAD(30), FOURTHROAD(40), FIFTHROAD(50);
    private int weight;

    Roads(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }

}
