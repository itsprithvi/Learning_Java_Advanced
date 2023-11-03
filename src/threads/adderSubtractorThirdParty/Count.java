package threads.adderSubtractorThirdParty;

public class Count {
    private int value = 0;

    public void incrementValue(int offset) {
        value += offset;
    }

    public int getValue() {
        return this.value;
    }

}
