package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class MyFirstClass {
   public MyFirstClass(){
      PageFactory.initElements(Driver.getDriver(),this);

   }
@FindBy(id = "email")
   public WebElement username;

}
