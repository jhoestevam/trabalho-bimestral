package br.univel.model;

import javax.annotation.PostConstruct;

public class Retangulo extends Base{
	/*
	 * A anotação postconstruct como o nome ja diz
	 * é executado toda vez que o ManagedBean for instanciado
	 * logo apos a execução do construtor da classe
	 */
	@PostConstruct
	public void setUp(){
		getDependencia().setNome("Retangulo");
	}

}
