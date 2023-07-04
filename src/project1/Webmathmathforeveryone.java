package project1;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webmathmathforeveryone {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\seleniumdownloads\\seleniumdrivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			Properties prop = new Properties();
			

			FileInputStream Input = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\practice\\excelrprojects\\src\\project1\\TestData.properties");
			prop.load(Input);
			String url = prop.getProperty("url");
			String Mathforeveryone =prop.getProperty("Mathforeveryone");
			String costofelectricity = prop.getProperty("costofelectricity");
			String power = prop.getProperty("power");
			String powertext =prop.getProperty("powertext");
			String kilowatt = prop.getProperty("kilowatt");
			String much_butt =prop.getProperty("much_butt");
			String power_value =prop.getProperty("power_value");
			String powertext_value = prop.getProperty("powertext_value");
			String kilowatt_value = prop.getProperty("kilowatt_value");
			String weightonplanet = prop.getProperty("weightonplanet");
			String weightpounds = prop.getProperty("weightpounds");
			String weight_value =prop.getProperty("weight_value");
			String dropdown = prop.getProperty("dropdown");
			
			
			driver.get(url);
			driver.findElement(By.xpath(Mathforeveryone)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(costofelectricity)).click();
			driver.findElement(By.xpath(power)).sendKeys(power_value);
			driver.findElement(By.xpath(powertext)).sendKeys(powertext_value);
			driver.findElements(By.xpath(kilowatt)).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath(kilowatt)).sendKeys(kilowatt_value);
			driver.findElement(By.xpath(much_butt)).click();
			driver.navigate().back();
			driver.navigate().back();
			driver.findElement(By.xpath(weightonplanet)).click();
			driver.findElement(By.xpath(weightpounds)).sendKeys(weight_value);
			driver.navigate().back();
			WebElement option = driver.findElement(By.xpath(dropdown));
			
			Select obj = new Select(option);
			List<WebElement> down =obj.getOptions();
			for(WebElement options: down)
				System.out.println(options.getText());
			if(obj.isMultiple()) {
				obj.selectByIndex(2);
				
				obj.selectByIndex(3);
			}
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

			
			
			
			
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
			
		}
		

	}

}
