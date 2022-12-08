package PageObjectModel1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class NewTest {
  @FindBy(name="q")
  public static WebElement inputBox;
  
}
