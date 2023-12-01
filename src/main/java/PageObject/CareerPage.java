package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class CareerPage {

public SelenideElement
    Start_Btn = $(byXpath("//span[text()='დაიწყე']")),
        WWD_Question = $(byName("question-0")),
        Next_Btn = $(byXpath("//span[text()='შემდეგი']")),
        YourWorld_Frame = $(byName("question-1")),
        LastTech_Frame = $(byName("question-2")),
        BraveThing_Frame = $(byName("question-3")),
        Name_Frame = $(byName("question-4")),
        WhySpace_Frame = $(byName("question-5")),
        LastName_Frame = $(byName("question-6")),
        Mail_Frame = $(byName("question-7")),
        MobileNum_Frame = $(byName("question-8")),
        ShareLinkedin_Text = $(byXpath("//div[text()='გაგვიზიარე შენი ონლაინ CV ან Linkedin პროფილი']")),
        ShareLinkedIn_Frame = $(byName("question-10")),
        Submit_Btn = $(byText("მიმართვა"));

}
