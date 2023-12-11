package br.edu.inf011.aval3.enunciado;

import br.edu.inf011.aval3.enunciado.builder.PerfilBuilder;
import br.edu.inf011.aval3.enunciado.builder.PerfilDirector;
import br.edu.inf011.aval3.enunciado.exceptions.LimiteDeDocumentosNaCriacaoException;
import br.edu.inf011.aval3.enunciado.model.Perfil;

public class App {
    	private void rodarBuilder() throws LimiteDeDocumentosNaCriacaoException {
		PerfilBuilder perfilBuilder = new PerfilBuilder();
        PerfilDirector director = new PerfilDirector(perfilBuilder);     
		director.criarParaTestarTudoFuncionando();
		Perfil roteiro = perfilBuilder.get();
		System.out.println(roteiro);
		
		System.out.println("*********************");
		
		director.setBuilder(perfilBuilder);
		director.criarComUsuarioESenha();;
		roteiro = perfilBuilder.get();
		System.out.println(roteiro);
			
	}
    
	public static void main(String[] args) throws LimiteDeDocumentosNaCriacaoException {
		(new App()).rodarBuilder();
	}
}
