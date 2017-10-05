package com.aconex.OpenDoorLib;

import com.aconex.OpenDoorLib.genericLib.Driver;
import com.aconex.OpenDoorLib.genericLib.WebDriverCommonLib;
import com.aconex.OpenDoorLib.pageObjRepo.OpenDoorPage;
import org.openqa.selenium.support.PageFactory;
import static com.aconex.OpenDoorLib.genericLib.Driver.DRIVER;
import static com.aconex.OpenDoorLib.genericLib.WebDriverCommonLib.select;

public class CreateFeedBackpg {
    OpenDoorPage openDoorPage;

    //This method is for entering the name
    public void enterName(String name) throws InterruptedException {
        openDoorPage = PageFactory.initElements(DRIVER, OpenDoorPage.class);
        WebDriverCommonLib.waitForPageToLoad();
        openDoorPage.name().sendKeys(name);
    }

    //This method is for entering the message
    public void enterFeedBack(String feedBack) throws InterruptedException {
        openDoorPage = PageFactory.initElements(DRIVER, OpenDoorPage.class);
        WebDriverCommonLib.waitForPageToLoad();
        openDoorPage.feedBack().sendKeys(feedBack);
    }

    //This method is for selecting the location
    public void selectLocation(String location) throws InterruptedException{
        openDoorPage = PageFactory.initElements(DRIVER, OpenDoorPage.class);
        WebDriverCommonLib.waitForPageToLoad();
        select(OpenDoorPage.selectLocation(),location);
    }

    //This method is for selecting stars
    public void selectRating(String rating) throws InterruptedException{
        openDoorPage = PageFactory.initElements(DRIVER, OpenDoorPage.class);
        WebDriverCommonLib.waitForPageToLoad();
        openDoorPage.selectRating().click();
    }

    //This method is for submitting the feed back
    public void submit() throws InterruptedException{
        openDoorPage = PageFactory.initElements(DRIVER, OpenDoorPage.class);
        WebDriverCommonLib.waitForPageToLoad();
        openDoorPage.submit().click();
    }


}
