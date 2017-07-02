package br.univel.model;

import javax.annotation.PostConstruct;

public class Circulo extends Base {

	@PostConstruct
	public void setUp(){
		getDependencia().setNome("Circulo");
	}

}
