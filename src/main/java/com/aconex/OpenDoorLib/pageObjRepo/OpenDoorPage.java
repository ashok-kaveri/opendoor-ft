package com.aconex.OpenDoorLib.pageObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenDoorPage {

//name
    @FindBy(id = "email")
    private WebElement name;
    public WebElement name(){
        return name;
    }

    //feed back
    @FindBy(id="feedback")
    private WebElement feedBack;

    public WebElement feedBack(){return feedBack;}

    //Location select
    @FindBy(id="location")
    private static WebElement location;

    public static WebElement selectLocation(){
        return location;
    }

    //Rating select
    @FindBy(xpath = "html/body/div[1]/form/div[4]/label[1]")
    private WebElement rating;

    public WebElement selectRating(){
        return rating;
    }

    //Submit button
    @FindBy(xpath = "html/body/div[1]/form/div[5]/button")
    private WebElement submit;

    public WebElement submit(){
        return submit;
    }

}
