package agile.coach.larry.javadatasciencecookbook.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSelenium test = new TestSelenium();
		String webData = test.extractDataWithSelenium("http://cogenglab.csd.uwo.ca/rushdi.htm");
		
		System.out.println(webData);
	}

	public String extractDataWithSelenium(String url) {
		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://cogenglab.csd.uwo.ca/rushdi.htm");
		WebElement webElement = driver.findElement(By.xpath("//*[@id='content']"));
		System.out.println(webElement.getText());
		driver.close();
		return url;
	}
}
