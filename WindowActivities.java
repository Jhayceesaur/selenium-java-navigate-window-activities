import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximize browser window
		driver.get("https://www.google.com"); //Go to specified URL
		driver.navigate().to("https://chatgpt.com/"); //Navigates to specified URL
		driver.navigate().back(); //Navigate back to previous URL (google.com)
		driver.navigate().forward(); //Navigate back to current URL (chatgpt.com)
	}
}
