package br.univel.service;

import br.univel.qualifier.Urgente;
/*
 * Aqui esta qualificando ele como Urgente
 * MensageiroEMAIL é um tipo Urgente
 */
@Urgente
public class MensageiroEMAIL implements Mensageiro{

	@Override
	public void enviarMensagem(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem EMAIL" + mensagem);
	}

}
