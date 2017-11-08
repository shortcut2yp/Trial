package hackerEarth;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {


    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Virus\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://hackerearth.com";
        String expectedTitle = "Developer Hackathons & Programming Challenges | Talent Assessment & Innovation Management Software | HackerEarth";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Navigation to website Passed!");
        } else {
            System.out.println("Navigation to website Failed");
        }
       
        LoginFb(driver);
        //close Fire fox
        driver.close();
       
    }

    private static void LoginFb(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
    	driver.findElement(By.xpath("html/body/div[8]/section[1]/header/nav/ul/li[3]/a")).click();
    	driver.findElement(By.xpath("//*[@id='login-modal']/div[2]/div[1]/div[1]/a[1]")).click();
    	
    	driver.wait(10000);
    	
    	driver.switchTo().window("Facebook");
    	System.out.println("switch successful");
    	/*String Parent_Window = driver.getWindowHandle();    
        // Switching from parent window to child window   
       for (String Child_Window : driver.getWindowHandles())  
       {  
    	   driver.switchTo().window(Child_Window);
    	   System.out.println("switch successful");
       }
    */
    	
    	/*try{
            driver.findElement(By.xpath(xpathExpression));
            return true;
        }
        catch(NoSuchElementException e){
            return false;
        }*/
	}

	 	
    

}