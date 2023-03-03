import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_9")
    AndroidElement btn9;
    @FindBy(id= Setup.PACKAGE_ID+":id/digit_8")
    AndroidElement btn8;
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_5")
    AndroidElement btn5;
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_4")
    AndroidElement btn4;
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_3")
    AndroidElement btn3;
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_2")
    AndroidElement btn2;
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_1")
    AndroidElement btn1;
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_0")
    AndroidElement btn0;
    @FindBy(id= Setup.PACKAGE_ID+":id/op_add")
    AndroidElement btnPlus;
    @FindBy(id= Setup.PACKAGE_ID+":id/op_sub")
    AndroidElement btnMinus;
    @FindBy(id=Setup.PACKAGE_ID+":id/op_mul")
    AndroidElement btnMul;
    @FindBy(id=Setup.PACKAGE_ID+":id/op_div")
    AndroidElement btnDiv;
    @FindBy(id=Setup.PACKAGE_ID+":id/eq")
    AndroidElement btnEql;
    @FindBy(id = Setup.PACKAGE_ID+":id/result_final")
    AndroidElement resulFinal;
    @FindBy(id = Setup.PACKAGE_ID+":id/clr")
    AndroidElement btnClr;


    public CalcScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public String doSum() throws InterruptedException {
        Thread.sleep(7000);
        btn9.click();
        btnPlus.click();
        btn5.click();
        btnEql.click();
        return resulFinal.getText();

}

    public String doSub() throws InterruptedException {
        Thread.sleep(6000);
        btn8.click( );
        btnMinus.click( );
        btn3.click( );
        btnEql.click( );
        return resulFinal.getText( );
    }

        public String doMulti () throws InterruptedException {
            Thread.sleep(6000);
            btnMul.click( );
            btn1.click( );
            btn4.click( );
            btnEql.click( );
            return resulFinal.getText( );
        }

    public String doDiv() throws InterruptedException {
        Thread.sleep(5000);
        btnDiv.click();
        btn1.click();
        btn0.click();
        btnEql.click();
        return resulFinal.getText();
    }
    public String doSeries() throws InterruptedException {
        Thread.sleep(6000);
        btn1.click();
        btn0.click();
        btn0.click();
        btnPlus.click();
        btn2.click();
        btn0.click();
        btn0.click();
        btnMinus.click();
        btn1.click();
        btn0.click();
        btn0.click();
        btnMul.click();
        btn2.click();
        btnDiv.click();
        btn5.click();
        btnEql.click();
        return resulFinal.getText();
    }
    }
