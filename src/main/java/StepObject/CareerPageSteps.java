package StepObject;

import PageObject.CareerPage;
import io.qameta.allure.Step;

import java.time.Duration;

import static DataObject.RegistrationPageData.*;
import static com.codeborne.selenide.Condition.visible;

public class CareerPageSteps extends CareerPage {

    @Step(" Career start btn ")
    public CareerPageSteps StartPage(){
        Start_Btn.shouldBe(visible);
        Start_Btn.click();

        return this;
    }

    @Step(" question 1 : What do you think we are doing in space? ")
    public CareerPageSteps FirstQuestion(){
        WWD_Question.click();
        WWD_Question.setValue(WWDInSpace);
        Next_Btn.shouldBe(visible, Duration.ofMillis(2000));
        Next_Btn.click();

        return this;
    }

    @Step(" question 2 : How in the world would you live?? ")
    public CareerPageSteps SecondQuestion(){
        YourWorld_Frame.click();
        YourWorld_Frame.setValue(YourWorld);
        Next_Btn.shouldBe(visible, Duration.ofMillis(2000));
        Next_Btn.click();

        return this;
    }

    @Step(" question 3 : The latest technology, what makes your amazement? ")
    public CareerPageSteps ThirdQuestion(){
        LastTech_Frame.click();
        LastTech_Frame.setValue(LastTech);
        Next_Btn.shouldBe(visible, Duration.ofMillis(2000));
        Next_Btn.click();

        return this;
    }

    @Step(" question 4 : What's the most Bravest thing you've ever done? ")
    public CareerPageSteps FourthQuestion(){
        BraveThing_Frame.click();
        BraveThing_Frame.setValue(BraveThing);
        Next_Btn.shouldBe(visible, Duration.ofMillis(2000));
        Next_Btn.click();

        return this;
    }

    @Step(" question 5 : Your name? ")
    public CareerPageSteps FifthQuestion(){
        Name_Frame.click();
        Name_Frame.setValue(Name);
        Next_Btn.shouldBe(visible, Duration.ofMillis(2000));
        Next_Btn.click();

        return this;
    }

    @Step(" question 6 : Your name? ")
    public CareerPageSteps SixthQuestion(){
        Name_Frame.click();
        Name_Frame.setValue(Name);
        Next_Btn.shouldBe(visible, Duration.ofMillis(2000));
        Next_Btn.click();

        return this;
    }

    @Step(" question 7 : Why do you want to start working in the space?? ")
    public CareerPageSteps SeventhQuestion(){
        WhySpace_Frame.click();
        WhySpace_Frame.setValue(WhySpace);
        Next_Btn.shouldBe(visible, Duration.ofMillis(2000));
        Next_Btn.click();

        return this;
    }

    @Step(" question 8 : Your lastname? ")
    public CareerPageSteps EighthQuestion(){
        LastName_Frame.click();
        LastName_Frame.setValue(LastName);
        Next_Btn.shouldBe(visible, Duration.ofMillis(2000));
        Next_Btn.click();

        return this;
    }

    @Step(" question 9 : Your Mail Address? ")
    public CareerPageSteps NinthQuestion(){
        Mail_Frame.click();
        Mail_Frame.setValue(Mail);
        Next_Btn.shouldBe(visible, Duration.ofMillis(2000));
        Next_Btn.click();

        return this;
    }

    @Step(" question 10 : Your mobile number? ")
    public CareerPageSteps TenthQuestion(){
        MobileNum_Frame.click();
        MobileNum_Frame.setValue(MobileNum);
        Next_Btn.shouldBe(visible, Duration.ofMillis(2000));
        Next_Btn.click();

        return this;
    }

    @Step(" question 11 : Upload CV, but it's can't be Tested? ")
    public CareerPageSteps EleventhQuestion(){
        ShareLinkedin_Text.click();

        return this;
    }

    @Step(" question 12 : Share Your LinkedIn? ")
    public CareerPageSteps TwelfthQuestion(){
        ShareLinkedIn_Frame.click();
        ShareLinkedIn_Frame.setValue(LinkedinLink);
        Submit_Btn.shouldBe(visible, Duration.ofMillis(2000));
        Submit_Btn.click();

        return this;
    }

}
