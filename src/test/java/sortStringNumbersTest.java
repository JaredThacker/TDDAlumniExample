import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcode.sortStringNumbers;

public class sortStringNumbersTest {
    sortStringNumbers s;

    @Before
    public void setUp() throws Exception{
        s = new sortStringNumbers();
    }

    @Test
    public void exampleTest(){
        //given
        String[] input = {"1", "5", "15", "9", "4"};
        String[] expected = {"1", "4", "5", "9", "15"};

        //when
        String[] actual = s.sortNumbers(input);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exampleTestWithDecimals(){
        //given
        String[] input = {"1.0", "5.00", "15.2", "9", "4"};
        String[] expected = {"1.0", "4", "5.00", "9", "15.2"};

        //when
        String[] actual = s.sortNumbers(input);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareTestLessThan(){
        //given
        String s1 = "1";
        String s2 = "2";

        //when
        int actual = s.compare(s1, s2);

        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void compareTestEqualTo(){
        //given
        String s1 = "0";
        String s2 = "0";

        //when
        int actual = s.compare(s1, s2);

        //then
        Assert.assertTrue(actual == 0);
    }

    @Test
    public void compareTestGreaterThan(){
        //given
        String s1 = "2";
        String s2 = "1";

        //when
        int actual = s.compare(s1, s2);

        //then
        Assert.assertTrue(actual > 0);
    }

    @Test
    public void compareTestLengthGreaterThan(){
        //given
        String s1 = "10";
        String s2 = "2";

        //when
        int actual = s.compare(s1, s2);

        //then
        Assert.assertTrue(actual > 0);
    }


    @Test
    public void compareTestLengthLessThan(){
        //given
        String s1 = "2";
        String s2 = "10";

        //when
        int actual = s.compare(s1, s2);

        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testingEdgeCasesDecimal(){
        //given
        String s1 = "1.0";
        String s2 = "0.02";

        //when
        int actual = s.compare(s1, s2);

        //then
        Assert.assertTrue(actual > 0);
    }

    @Test
    public void testingEdgeCasesDecimalTest2(){
        //given
        String s1 = "2.000";
        String s2 = "15.00";

        //when
        int actual = s.compare(s1, s2);

        //then
        Assert.assertTrue(actual < 0);
    }
}
