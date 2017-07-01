package br.univel.service;

import javax.enterprise.inject.Default;

/*
 * Por padrão ja é default
 * o padrao qualifier default 
 */
@Default
public class MensageiroSMS implements Mensageiro{

	@Override
	public void enviarMensagem(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("Enviando mensangem SMS:" + mensagem);
	}

}
