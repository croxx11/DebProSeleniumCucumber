package com.DebsCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 20/03/2017.
 */
public class DebsRegisterPage {
    WebDriver driver = null;

       public DebsRegisterPage(WebDriver driver){
           this.driver=driver;
           PageFactory.initElements(driver,this);
       }
}
