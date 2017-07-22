public class Odd implements Predicate {
    @Override
    public boolean apply(int n) {
        return n % 2 == 1;
    }
}
