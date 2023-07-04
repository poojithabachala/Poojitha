package project1;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webmathunitsconversation {

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
			String Length = prop.getProperty("Length");
			String Length_conversation =prop.getProperty("Length_conversion");
			String Length_convert =prop.getProperty("Length_convert");
			String Length_Value = prop.getProperty("Length_value");
			String mass =prop.getProperty("mass");
			String mass_conversation =prop.getProperty("mass_conversation");
			String mass_convert =prop.getProperty("mass_convert");
			String mass_Value = prop.getProperty("mass_Value");
			String area =prop.getProperty("area");
			String area_conversation = prop.getProperty("area_conversation");
			String area_convert =prop.getProperty("area_convert");
			String area_value =prop.getProperty("area_value");
			String Volume =prop.getProperty("volume");
			String volume_conversation =prop.getProperty("volume_conversation");
			String volume_convert =prop.getProperty("volume_convert");
			String volume_value =prop.getProperty("volume_value");
			String speed = prop.getProperty("speed");
			String speed_conversation =prop.getProperty("speed_conversation");
			String speed_convert =prop.getProperty("speed_convert");
			String speed_value =prop.getProperty("speed_value");
			String power =prop.getProperty("power");
			String power_conversation =prop.getProperty("power_conversation");
			String power_convert =prop.getProperty("power_convert");
			String power_value =prop.getProperty("power_value");
			String temps =prop.getProperty("temps");
			String temps_conversation = prop.getProperty("temps_conversation");
			String tempvalue1 =prop.getProperty("temp1");
			String tempvalue2 = prop.getProperty("temp2");
			String tempvalue =prop.getProperty("tempvalue");
			
			
			
			
			
			
			
			
			
			driver.get(url);
			driver.findElement(By.xpath(Mathforeveryone)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(Length)).click();
			driver.findElement(By.xpath(Length_conversation)).sendKeys(Length_Value);
			WebElement lengthvalue = driver.findElement(By.xpath(Length_convert));
			Select obj = new Select(lengthvalue);
		    
			obj.selectByIndex(2);
			driver.navigate().back();
			driver.findElement(By.xpath(mass)).click();
			driver.findElement(By.xpath(mass_conversation)).sendKeys(mass_Value);
			WebElement massvalue =driver.findElement(By.xpath(mass_convert));
            Select obj1 = new Select(massvalue );
            obj1.selectByIndex(3);
			driver.navigate().back();
			driver.findElement(By.xpath(area)).click();
			driver.findElement(By.xpath(area_conversation)).sendKeys(area_value);
			WebElement areavalue = driver.findElement(By.xpath(area_convert));
			Select obj3 = new Select(areavalue);
			obj3.selectByIndex(2);
			driver.navigate().back();
			driver.findElement(By.xpath(Volume)).click();
			driver.findElement(By.xpath(volume_conversation)).sendKeys(volume_value);
			WebElement volumevalue = driver.findElement(By.xpath(volume_convert));
			Select obj4 = new Select(volumevalue);
			obj4.selectByIndex(2);
			driver.navigate().back();
			driver.findElement(By.xpath(speed)).click();
			driver.findElement(By.xpath(speed_conversation)).sendKeys(speed_value);
			WebElement speedvalue = driver.findElement(By.xpath(speed_convert));
			Select obj5 = new Select(speedvalue);
			obj5.selectByIndex(1);
			driver.navigate().back();
			driver.findElement(By.xpath(power)).click();
			driver.findElement(By.xpath(power_conversation)).sendKeys(power_value);
			WebElement powervalue = driver.findElement(By.xpath(power_convert));
			Select obj6 = new Select(powervalue);
			obj6.selectByIndex(1);
			driver.navigate().back();
			driver.findElement(By.xpath(temps)).click();
			driver.findElement(By.xpath(temps_conversation)).sendKeys(tempvalue);
			WebElement temp1 = driver.findElement(By.xpath(tempvalue1));
			Select obj7 = new Select(temp1);
			obj7.selectByIndex(1);
			WebElement temp2 = driver.findElement(By.xpath(tempvalue2));
			Select obj8 = new Select(temp2);
			obj8.selectByIndex(0);
			
			
			
		    
			
			
			
		    
			
			
			
			
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
			
		}
		

	}

}
