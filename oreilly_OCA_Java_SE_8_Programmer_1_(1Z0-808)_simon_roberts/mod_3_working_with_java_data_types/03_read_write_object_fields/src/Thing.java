public class Thing {
    public int numOne;
    public int numTwo;

    public void doStuff() {
        this.numOne = this.numOne + 10;
        numTwo++;
    }

    public boolean sameAs(Thing other) {
        return other == this;
    }

    @Override
    public String toString() {
        return "Thing: numOne=" + this.numOne + ", numTwo=" + this.numTwo;
    }
}
