public class And implements Predicate {

    private final Predicate p1;
    private final Predicate p2;

    public And(Predicate p1, Predicate p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public boolean apply(int n) {
        return p1.apply(n) && p2.apply(n);
    }
}
