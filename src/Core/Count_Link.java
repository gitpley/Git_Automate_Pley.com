package Core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Count_Link extends BaseClass {
     public Count_Link(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
     List<WebElement> links;
         public void numberOfLinks() throws InterruptedException{
          
          links = driver.findElements(By.tagName("a"));
          System.out.println(links.size());
          Thread.sleep(2000);
         }
         
         
         public void printLinks() throws InterruptedException{
        	 for (int i = 0; i<links.size(); i++)
             {
                 System.out.println(links.get(i).getText());
             }
             Thread.sleep(2000);           
         }     
  
         public void checkAllLinks(){
        	 //link click > get title
        	 for (int i =0; i<links.size(); i++){
        	     links.get(i).click();
        	     driver.getTitle();
        	 }
        	 //if (link opens) > code 200
             //else if (link - 404 ) > code 404 
        	 //else (any other error)
         }

}
         
