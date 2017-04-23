package Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Pesquisar extends BaseDriver {
WebDriverWait wait = new WebDriverWait(driver, 10);
	
	@Dado("^O sistema apresenta os campos para preenchimento$")
	public void o_sistema_apresenta_os_campos_para_preenchimento() {
		IniciarNavegador();
		
		Actions actions = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[href*='pregao']")));
		driver.findElement(By.xpath(".//*[@id='mPrincipal']/div/ul/li[2]"));
		WebElement BtPregao = driver.findElement(By.cssSelector("a[href*='pregao']"));
		actions.moveToElement(BtPregao);

	}

	@Dado("^Apos Preencher/Selecionar todos os campos$")
	public void apos_Preencher_Selecionar_todos_os_campos() {

	}

	@Quando("^Aciono o comando de pesquisa$")
	public void aciono_o_comando_de_pesquisa() {

	}

	@Entao("^É Apresentado o resultado conforme solicitado$")
	public void é_Apresentado_o_resultado_conforme_solicitado() {

	}

}
