package br.univel.factory;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import br.univel.model.Base;
import br.univel.model.Circulo;
import br.univel.model.Retangulo;
import br.univel.model.TiposBase;

public class BaseFactory{

	@Any
	@Inject
	private Instance<Base> base;
	
	public Base criar(TiposBase tipos){
		if (TiposBase.CIRCULO.equals(tipos)){
			return base.select(Retangulo.class).get();
		}
		if (TiposBase.RETANGULO.equals(tipos)) {
			return base.select(Circulo.class).get();
		}
		
		return null;
	}
}
