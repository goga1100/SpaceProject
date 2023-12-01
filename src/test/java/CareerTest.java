import StepObject.CareerPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CareerTest extends ChromeRunner {
    CareerPageSteps careerPageSteps = new CareerPageSteps();


    @Test(priority = 1)
    @Description("Case fill in all Career frames and submit")
    @Severity(SeverityLevel.NORMAL)
    public void CareerTestPage(){
        careerPageSteps
                .StartPage()
                .FirstQuestion()
                .SecondQuestion()
                .ThirdQuestion()
                .FourthQuestion()
                .FifthQuestion()
                .SixthQuestion()
                .SeventhQuestion()
                .EighthQuestion()
                .NinthQuestion()
                .TenthQuestion()
                .EleventhQuestion()
                .TwelfthQuestion();
        Assert.assertTrue(careerPageSteps.Submit_Btn.isDisplayed());

    }
}
