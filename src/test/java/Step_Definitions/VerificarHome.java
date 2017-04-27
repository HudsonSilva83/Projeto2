package Step_Definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;


public class VerificarHome extends BaseDriver {

	//CapturarTexto capturatexto;

	@Dado("^A pagina inicial carregada$")
	public void a_pagina_inicial_carregada() {

		IniciarNavegador();

	}

	@Dado("^Ao clicar em outra funcionalidade$")
	public void ao_clicar_em_outra_funcionalidade() {

		Actions actions = new Actions(driver);

		WebElement BtPregao = driver.findElement(By.xpath(".//*[@id='mPrincipal']/div/ul/li[2]"));
		actions.moveToElement(BtPregao).build().perform();

		WebElement BtConsulta = driver.findElement(By.xpath(".//*[@id='mPrincipal']/div/ul/li[2]/ul/li[1]/a/span"));
		actions.moveToElement(BtConsulta).click().build().perform();

	}

	@Dado("^clicar na pagina home$")
	public void clicar_na_pagina_home() {

		WebDriverWait espere = new WebDriverWait(driver, 20);

		espere.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='idPagInicial']")));
		driver.findElement(By.xpath(".//*[@id='idPagInicial']")).click();

	}

	@Entao("^deve exibir a pagina Home novamente$")
	public void deve_exibir_a_pagina_Home_novamente() {

		WebDriverWait espere = new WebDriverWait(driver, 10);

		espere.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='corpo']/div/div[1]/p[2]")));
  
		
		//assertEquals("prezados senhores",capturatexto.GetHome());
		
		//System.out.println("tem que imprimir:" + capturatexto.GetHome());
		
		//Assert.assertEquals(CarrinhoPage.getVerificarValorTaxaCoriMatricula(), "R$3,00");
				
		
		Assert.assertEquals(CapturarTexto.GetHome(),"Prezados Fornecedores");

	}

	
}
