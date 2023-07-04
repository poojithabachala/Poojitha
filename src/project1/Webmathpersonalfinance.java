package project1;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webmathpersonalfinance {

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
			String simpleintrest = prop.getProperty("simpleintrest");
			String principleamount = prop.getProperty("principalamount");
			String simplerate =prop.getProperty("Simplerate");
			String simplerate_after =prop.getProperty("simplerate_after");
			String principalvalue = prop.getProperty("principalValue");
			String simpleratevalue = prop.getProperty("simpleratevalue");
			String simplerate_aftervalue =prop.getProperty("simplerate_aftervalue");
			String compoundintrest = prop.getProperty("compoundintrest");
			String principal_ciamount = prop.getProperty("Principal_ciamount");
			String principalrate = prop.getProperty("principalrate");
			String principalrate_value = prop.getProperty("principalrate_value");
			String principalrateafter_value = prop.getProperty("principalrateafter_value");
			String amount1 = prop.getProperty("amount1");
			String amount2 = prop.getProperty("amount2");
			String amount3 = prop.getProperty("amount3");
			String amount4 =prop.getProperty("amount4");
			String retirement =prop.getProperty("retirement");
			String Investementtext1 = prop.getProperty("Investementtext1");
			String Investementtext2 =prop.getProperty("Investementtext2");
			String Investementtext3 = prop.getProperty("Investementtext3");
			String Investementtext4 = prop.getProperty("Investementtext4");
			String Investementtext5 = prop.getProperty("Investementtext5");
			String Investementtext6 = prop.getProperty("Investementtext6");
			String reteramount1 =prop.getProperty("reteramount1");
			String reteramount2 = prop.getProperty("reteramount2");
			String reteramount3 = prop.getProperty("reteramount3");
			String reteramount4 = prop.getProperty("reteramount4");
			String reteramount5 = prop.getProperty("reteramount5");
			String reteramount6 = prop.getProperty("reteramount6");
			String loan = prop.getProperty("loan");
			String amountofloan = prop.getProperty("amountofloan");
			String durationoflaon = prop.getProperty("durationofloan");
			String paymentsperyear = prop.getProperty("paymentsperyear");
			String annualintrestrate = prop.getProperty("annualintrestrate");
			String extraamount =prop.getProperty("extraamount");
			String loanamount1 =prop.getProperty("loanamount1");
			String loanamount2 = prop.getProperty("loanamount2");
			String loanamount3 = prop.getProperty("loanamount3");
			String loanamount4 = prop.getProperty("loanamount4");
			String loanamount5 = prop.getProperty("loanamount5");
			
			driver.get(url);
			driver.findElement(By.xpath(Mathforeveryone)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(simpleintrest)).click();
			driver.findElement(By.xpath(principleamount)).sendKeys(principalvalue);
			driver.findElement(By.xpath(simplerate)).sendKeys(simpleratevalue);
			driver.findElement(By.xpath(simplerate_after)).sendKeys(simplerate_aftervalue);
			driver.navigate().back();
			driver.findElement(By.xpath(compoundintrest)).click();
			driver.findElement(By.xpath(principal_ciamount)).sendKeys(amount1);
			driver.findElement(By.xpath(principalrate)).sendKeys(amount2);
			driver.findElement(By.xpath(principalrate_value)).sendKeys(amount3);
			driver.findElement(By.xpath(principalrateafter_value)).sendKeys(amount4);
			driver.navigate().back();
			driver.findElement(By.xpath(retirement)).click();
			driver.findElement(By.xpath(Investementtext1)).sendKeys(reteramount1);
			driver.findElement(By.xpath(Investementtext2)).sendKeys(reteramount2);
			driver.findElement(By.xpath(Investementtext3)).sendKeys(reteramount3);
			driver.findElement(By.xpath(Investementtext4)).sendKeys(reteramount4);
			driver.findElement(By.xpath(Investementtext5)).sendKeys(reteramount5);
			driver.findElement(By.xpath(Investementtext6)).sendKeys(reteramount6);
			driver.navigate().back();
			driver.findElement(By.xpath(loan)).click();
			driver.findElement(By.xpath(amountofloan)).sendKeys(loanamount1);
			driver.findElement(By.xpath(durationoflaon)).sendKeys(loanamount2);
			driver.findElement(By.xpath(paymentsperyear)).sendKeys(loanamount3);
			driver.findElement(By.xpath(annualintrestrate)).sendKeys(loanamount4);
			driver.findElement(By.xpath(extraamount)).sendKeys(loanamount5);
			

	}catch (Exception e) {
		System.out.println(e.getMessage());
		
		
	}

}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
