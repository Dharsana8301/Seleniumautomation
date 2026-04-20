package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public WebDriver driver; //web driver declaration
public void browserLaunch() {
	driver=new ChromeDriver();//it is a browser class
	driver.get("https://selenium.qabible.in/");
	driver.manage().window().maximize();
	
		
}
public void BrowserCloseandquit() {
	//driver.close();
	driver.quit();
	
}

	public static void main(String[] args) {
		Base base= new Base();
		base.browserLaunch();
		base.BrowserCloseandquit();
		

	}

}
