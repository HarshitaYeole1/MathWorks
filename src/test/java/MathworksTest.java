import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MathworksTest {

    private MathWorks mathWorks;

    @Test
    public void shouldSumAListOfNumbers() throws Exception {
        List numbers = Arrays.asList(1,2,3,4);

        int result = mathWorks.sum(numbers);

        Assert.assertEquals(10, result);
    }


    @Test
    public void shouldMultiplyAListOfNumbers() throws Exception {
        List numbers = Arrays.asList(1,2,3,4);

        int result = mathWorks.multiply(numbers);

        Assert.assertEquals(24, result);
    }

    @Test
    public void shouldFindAllOddElementsInTheList() throws Exception {
        List numbers = Arrays.asList(1,2,3,4,5);

        List<Integer> result = mathWorks.findOdd(numbers);

        Assert.assertEquals(Arrays.asList(1, 3, 5), result);
    }

    @Test
    public void shouldFindAllEvenElementsInTheList() throws Exception {
        List numbers = Arrays.asList(1,2,3,4,5);

        List<Integer> result = mathWorks.findEven((numbers));

        Assert.assertEquals(Arrays.asList(2, 4), result);
    }

    @Test
    public void shouldFindAllNumbersGreaterThan10InTheList() throws Exception {
        List numbers = Arrays.asList(1,2,3,4,5, 12, 15, 17);

        List<Integer> result = mathWorks.greaterThan(numbers, 10);

        Assert.assertEquals(Arrays.asList(12, 15, 17), result);
    }

    @Test
    public void shouldFindAllOddNumbersGreaterThan20() throws Exception {
        List numbers = Arrays.asList(3,4,5, 23, 22, 25);

        List<Integer> result = mathWorks.oddGreaterThan(numbers, 20);

        Assert.assertEquals(Arrays.asList(23, 25), result);

    }

    @Test
    public void shouldFindAllEvenNumbersGreaterThan20ButLessThan50() throws Exception {
        List numbers = Arrays.asList(3,4,5, 23, 22, 25, 54, 50);
        Predicate even = new Even();
        Predicate greaterThan20 = new GreaterThan(20);
        Predicate lessThan50 = new Not(new GreaterThan(49));

//        Predicate evenAndGreaterThan20 = new And(even, greaterThan20);
//        Predicate evenAndGreaterThan20AndLessThan50 = new And(evenAndGreaterThan20, lessThan50);

        List<Integer> result = FuncTools.filter(numbers, new And(even, new And(greaterThan20, lessThan50)));

        Assert.assertEquals(Arrays.asList(22), result);

    }

    @Before
    public void setUp() throws Exception {
        mathWorks = new MathWorks();
    }
}
