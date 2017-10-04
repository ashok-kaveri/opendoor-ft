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
    String message="Something"+Math.random();


    @BeforeClass
    public void createFeedBack() throws IOException, InvalidFormatException, InterruptedException {

        excelLib = new ExcelLib();
        String URL = excelLib.getExcelData("DATA", 1, 0);
        DRIVER.get(URL);

        //Open Feedback
        createFeedBack = new CreateFeedBackpg();



    }

    //Create feed back
    @Test(priority = 1)
    public void createFeebBack() throws InterruptedException {
        WebDriverCommonLib.waitForPageToLoad();
        createFeedBack.createFeedBack("tst", message= "tst");

    }

}
