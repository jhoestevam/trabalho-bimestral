package br.univel.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.univel.qualifier.Urgente;
import br.univel.service.Mensageiro;
/*
 * Todo escopo de CDI precisa ser nomeado
 */
@Named
/*
 * O escopo RequestScoped é o padrao do ManagedBean, 
 * faz com os objetos fiquem por pouco tempo em memoria
 * sendo assim o objeto fica apenas em uma requisição, na proxima os objetos não serao os mesmos
 */
@RequestScoped
public class MensagemBean {
	/*
	 * É onde acontece a injeção
	 * voce esta avisando com o @Inject 
	 * vai ter a injecao automatica
	 * 
	 */
	
	@Inject
	/*
	 * Aqui a gente especifica qual qualifier é injetado
	 * se vc quer chamar o qualifier @default chamara o MensageiroSMS
	 */
	@Urgente
	private Mensageiro mensageiro;
	
	private String mensagem;
	
	public void enviarMensagem(){
		mensageiro.enviarMensagem(mensagem);
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
