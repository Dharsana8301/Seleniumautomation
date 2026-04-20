package seleniumbasics;

public class BrowserCommands extends Base {
	
	public void verifyBrowserCommand() {
		//get title
		String title= driver.getTitle();
		System.out.println(title);
		String url= driver.getCurrentUrl();
		System.out.println(url);
		String handleid= driver.getWindowHandle();
		System.out.println(handleid);
		String source= driver.getPageSource();
		System.out.println(source);
	}
	
	public void verifyNavigationComands() {
		//to()
		driver.navigate().to("https://www.amazon.jobs/en/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		BrowserCommands commands= new BrowserCommands();
		commands.browserLaunch();
		//commands.verifyBrowserCommand();
		commands.verifyNavigationComands();
		
		
		

	}

}
