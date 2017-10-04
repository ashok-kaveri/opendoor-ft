package com.aconex.OpenDoorLib.pageObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenDoorPage {


    @FindBy(id = "name")
    private WebElement name;
    public WebElement name(){
        return name;
    }

    @FindBy(id="Message")
    private WebElement message;

    public WebElement message(){return message;}

}
