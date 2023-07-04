package project1;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Webmathapplication {

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
			String Tip =prop.getProperty("Figuringatip");
			String amount =prop.getProperty("Amountinpercent");
			String Cost =prop.getProperty("Cost");
			String percentage = prop.getProperty("Amount");
			String Value = prop.getProperty("Costvalue");
			String Saleprice = prop.getProperty("saleprice");
			String Originalcost =prop.getProperty("originalcost");
			String saleper = prop.getProperty("num1");
			String salepercentageoff =prop.getProperty("percentageoff");
			String Salevalue = prop.getProperty("num2");
			String Windchill = prop.getProperty("windchill");
			String Windchill_temp =prop.getProperty("windchill_temp");
			String Windchill_Speed =prop.getProperty("windchill_speed");
			String temp_value =prop.getProperty("temp_Value");
			String temp_Speed = prop.getProperty("temp_speed");
			String countcoins =prop.getProperty("count_coins");
			String quatercoins =prop.getProperty("quater_coins");
			String dimecoins =prop.getProperty("dimes_coins" );
			String nickelcoins =prop.getProperty("nickel_coins");
			String Penicoins =prop.getProperty("penis_coins");
			String quater_value =prop.getProperty("quater_value");
			String dimes_value =prop.getProperty("dimes_value");
			String nickel_value =prop.getProperty("nickel_value");
			String penis_value =prop.getProperty("penis_value");
			String Lotteryodds =prop.getProperty("LotteryOdds");
			String correctnum =prop.getProperty("Correctnum");
			String Lowestnum = prop.getProperty("Lowestnum");
			String Highestnum = prop.getProperty("Highestnum");
			String correct_value = prop.getProperty("correct_value");
			String Lowest_Value = prop.getProperty("lowest_Value");
			String Highest_Value =prop.getProperty("Highest_value");
					
					
					
					
			
			
			
			
			
			driver.get(url);
			driver.findElement(By.xpath(Mathforeveryone)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(Tip)).click();
			driver.findElement(By.xpath(amount)).clear();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(amount)).sendKeys(percentage);
			
			driver.findElement(By.xpath(Cost)).sendKeys(Value);
			driver.navigate().back();
			driver.findElement(By.xpath(Saleprice)).click();
			driver.findElement(By.xpath(Originalcost)).sendKeys(saleper);
			driver.findElement(By.xpath(salepercentageoff)).sendKeys(Salevalue);
			driver.navigate().back();
			driver.findElement(By.xpath(Windchill)).click();
			driver.findElement(By.xpath(Windchill_temp)).sendKeys(temp_value);
			driver.findElement(By.xpath(Windchill_Speed)).sendKeys(temp_Speed);
			driver.navigate().back();
			driver.findElement(By.xpath(countcoins)).click();
			driver.findElement(By.xpath(quatercoins)).sendKeys(quater_value);
			driver.findElement(By.xpath(dimecoins)).sendKeys(dimes_value);
			driver.findElement(By.xpath(nickelcoins)).sendKeys(nickel_value);
			driver.findElement(By.xpath(Penicoins)).sendKeys(penis_value);
			driver.navigate().back();
			driver.findElement(By.xpath(Lotteryodds)).click();
			driver.findElement(By.xpath(correctnum)).sendKeys(correct_value);
			driver.findElement(By.xpath(Lowestnum)).sendKeys(Lowest_Value);
			driver.findElement(By.xpath(Highestnum)).sendKeys(Highest_Value);
			
			
			
			
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
			
		}
	}
		
	}
		
		