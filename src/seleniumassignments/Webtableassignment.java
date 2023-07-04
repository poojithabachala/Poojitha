package seleniumassignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableassignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\seleniumdownloads\\seleniumdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");// gets the webpage
		driver.manage().window().maximize();
		//List<WebElement> Linkcount = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td//a"));// using locator xpath storing the elements in list.
		List<WebElement> Linkcount = driver.findElements(By.xpath("//table[@class='dataTable']//tr//td//a"));
		
		
		
		
		//Logic to print all the comapny names in console
		for(WebElement m : Linkcount) {
			String name = m.getText();
			System.out.println(name);
		}
		
		Thread.sleep(1000);
		driver.navigate().refresh();// refresh the driver.
		driver.get("https://demo.guru99.com/test/login.html");// open the link given in this.
		driver.findElement(By.id("email")).sendKeys("bachalapoojithasekhar@gmail.com");// Enter email
		driver.findElement(By.id("passwd")).sendKeys("Poojitha@123");//Enter password
		driver.findElement(By.id("SubmitLogin")).click(); // Click on Login button.
		Thread.sleep(1000);
		driver.close(); 
		

	}

}
