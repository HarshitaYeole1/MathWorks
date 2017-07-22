public class GreaterThan implements Predicate {

    private int lowerLimit;

    public GreaterThan(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    @Override
    public boolean apply(int n) {
        return n > lowerLimit;
    }
}
