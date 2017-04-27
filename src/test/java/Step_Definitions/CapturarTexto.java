package Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CapturarTexto {

	public static WebDriver driver;

	public static String GetHome(){

		return driver.findElement(By.xpath(".//*[@id='corpo']/div/div[1]/p[2]")).getText();

	}

}
