package br.univel.model;

import javax.inject.Inject;

import br.univel.dependencia.BaseDependencia;

public abstract class Base {

	@Inject
	private BaseDependencia dependencia;
	
	public BaseDependencia getDependencia(){
		return dependencia;
	}
}
