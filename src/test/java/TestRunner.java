import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner extends Setup {
    CalcScreen cal;
    @Test (priority = 1,description = "User can Summation if provides two numbers")
    public void doSum() throws InterruptedException {
        cal = new CalcScreen(driver);
        String sum = cal.doSum();
        //System.out.println(sum);
        Assert.assertEquals(sum, "14");
        cal.btnClr.clear();

    }

    @Test (priority = 2,description = "User can Subtraction if provides two numbers")
    public void doSub() throws InterruptedException {
        cal = new CalcScreen(driver);
        String sub = cal.doSub();
        Assert.assertEquals(sub, "5");
    }

    @Test (priority = 3,description = "User can Multiply if provides any two number or above sum ad sub results")
    public void doMulti() throws InterruptedException {
        cal = new CalcScreen(driver);
        String multi=cal.doMulti();
        Assert.assertEquals(multi,"70");
    }

    @Test (priority = 4,description = "User can Divide the result of multiplication with 10")
    public void doDiv() throws InterruptedException {
        cal = new CalcScreen(driver);
        String div=cal.doDiv();
        cal.btnClr.clear();
        Assert.assertEquals(div,"7");
    }

    @Test (priority = 5,description = "User can Calculate the Series in the following equation")
    public void doSeries() throws InterruptedException {
        cal = new CalcScreen(driver);
        String ser=cal.doSeries();
        cal.btnClr.clear();
        Assert.assertEquals(ser,"260");
    }

    public void clearScreen(){
        cal=new CalcScreen(driver);
        cal.btnClr.clear();
    }
}
