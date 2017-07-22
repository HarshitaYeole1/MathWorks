import java.util.ArrayList;
import java.util.List;

public class FuncTools {

    public static List filter(List<Integer> xs, Predicate predicate) {
        List resultList = new ArrayList();
        for (int n : xs) {
            if (predicate.apply(n)) {
                resultList.add(n);
            }
        }
        return resultList;
    }

    public static int reduce(List<Integer> numbers, int initialValue, BinaryOperator operation) {
        int total = initialValue;
        for (int n : numbers) {
            total = operation.apply(n, total);
        }
        return total;
    }

}
