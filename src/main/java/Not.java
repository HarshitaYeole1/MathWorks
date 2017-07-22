
public class Not implements Predicate {
    private Predicate predicate;

    public Not(Predicate predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean apply(int n) {
        return !predicate.apply(n);
    }
}
