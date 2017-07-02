package br.univel.model;

import javax.annotation.PostConstruct;

public class Retangulo extends Base{

	@PostConstruct
	public void setUp(){
		getDependencia().setNome("Retangulo");
	}

}
