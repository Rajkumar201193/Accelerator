package testClass;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.By; 

public class CommonMethods extends SkeletonCode{

//New Skel Code for newly identified Objects 

	public static WebDriver driver; 
	//Skeleton code for new object FIRST_NAME_0
  public void enterInputText(By xpath, String text){ 

  WebElement element; 

		element = driver.findElement(xpath); 
		if(element.isDisplayed()){
			element.sendKeys(text);
			System.out.println("Text written"); 
		}
		else
			{
				System.out.println("Failing because of wrong Element"); 
			}
}
	//Skeleton code for new object CUSTOMERS_1
  public void buttonClick(By xpath){

  WebElement element; 
		element = driver.findElement(xpath); 
		if(element.isDisplayed()){
			element.click();
			System.out.println("Button clicked"); 
		}
		else
			{
				System.out.println("Failing because of wrong Element"); 
			}
}

  }
