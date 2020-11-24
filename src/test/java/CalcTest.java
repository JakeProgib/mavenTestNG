import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {
    @Test
    public void plusTest(){
        Calc calc = new Calc();
        int result = calc.plus(1,2);
        Assert.assertEquals(result,3);
    }

    @Test
    public void minusTest(){
        Calc calc = new Calc();
        int result = calc.minus(10,2);
        Assert.assertEquals(result, 8);
    }
    @Test
    public void divTest(){
        Calc calc = new Calc();
        int result = calc.div(10,2);
        Assert.assertEquals(result,5);
    }
    @Test
    public void multiTest(){
        Calc calc = new Calc();
        int result = calc.multi(4,6);
        Assert.assertEquals(result,24);
    }
}
