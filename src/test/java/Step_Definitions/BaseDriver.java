package Step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseDriver {

	public WebDriver driver;

	public void IniciarNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.compras.mg.gov.br/");

	}

}
