package Step_Definitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class CarregarPagina extends BaseDriver {

	@Dado("^Sistema inicia processo de abertura da pagina$")
	public void sistema_inicia_processo_de_abertura_da_pagina()  {
		
		IniciarNavegador();
	   
	}

	@Entao("^A Pagina e apresentada com sucesso$")
	public void a_Pagina_e_apresentada_com_sucesso() {
		
		System.out.println("Pagina é carregada com sucesso");
	    
	}


}
