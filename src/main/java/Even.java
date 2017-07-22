public class Even implements Predicate {
    @Override
    public boolean apply(int n) {
        return n % 2 == 0;
    }
}
