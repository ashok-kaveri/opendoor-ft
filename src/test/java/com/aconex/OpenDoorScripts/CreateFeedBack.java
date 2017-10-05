package com.aconex.OpenDoorLib.genericLib;

import com.aconex.OpenDoorLib.CreateFeedBackpg;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;
import static com.aconex.OpenDoorLib.genericLib.Driver.DRIVER;

public class CreateFeedBack {
    ExcelLib excelLib;
    WebDriverCommonLib webDriverCommonLib;
    //Open Door
    CreateFeedBackpg createFeedBack;

    String name = "OpenDoorLib"+ Math.random();
    String feedBack="Something"+Math.random();
    String location = "Mumbai";
    String rating = "5";


    @BeforeClass
    public void createFeedBack() throws IOException, InvalidFormatException, InterruptedException {
        excelLib = new ExcelLib();
        String URL = excelLib.getExcelData("DATA", 1, 0);
        DRIVER.get(URL);
        createFeedBack = new CreateFeedBackpg();
    }

    @Test(priority = 1)
    public void userFeedBack() throws InterruptedException {
        WebDriverCommonLib.waitForPageToLoad();
        createFeedBack.enterName(name);
        createFeedBack.enterFeedBack(feedBack);
        createFeedBack.selectLocation(location);
        createFeedBack.selectRating(rating);
        createFeedBack.submit();

    }

}
