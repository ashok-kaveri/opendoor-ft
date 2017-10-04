package com.aconex.OpenDoorLib;

import com.aconex.OpenDoorLib.genericLib.Driver;
import com.aconex.OpenDoorLib.genericLib.WebDriverCommonLib;
import com.aconex.OpenDoorLib.pageObjRepo.OpenDoorPage;
import org.openqa.selenium.support.PageFactory;

public class CreateFeedBackpg {
    OpenDoorPage openDoorPage;

    //This Function is used to used to enter a query in the mail no CHF
    public void createFeedBack(String name, String message) throws InterruptedException {
        openDoorPage = PageFactory.initElements(Driver.DRIVER, OpenDoorPage.class);
        WebDriverCommonLib.waitForPageToLoad();
        openDoorPage.name().sendKeys(name);
        openDoorPage.message().sendKeys(message);


    }
}
