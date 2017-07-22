import java.util.List;

public class MathWorks {

    public int sum(List<Integer> numbers) {
        return FuncTools.reduce(numbers, 0, new Sum());
    }

    public int multiply(List<Integer> numbers) {
//        return reduce(numbers, 1, (int n1, int n2) -> n1 * n2);
        return FuncTools.reduce(numbers, 1, new Multiply());
    }

    public List<Integer> findOdd(List<Integer> numbers) {
//        return filter(numbers, (int n) -> n % 2 == 1);
        return FuncTools.filter(numbers, new Odd());
    }

    public List<Integer> findEven(List<Integer> numbers) {
       return FuncTools.filter(numbers, new Even());
    }

    public List<Integer> greaterThan(List<Integer> numbers, int lowerLimit) {
        return FuncTools.filter(numbers, new GreaterThan(lowerLimit));
    }

    public List<Integer> oddGreaterThan(List numbers, int lowerLimit) {
        return FuncTools.filter(numbers, new And(new Odd(), new GreaterThan(lowerLimit)));
    }
}

