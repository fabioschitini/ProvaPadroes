package br.edu.inf011.aval3.enunciado;

import br.edu.inf011.aval3.enunciado.builder.PerfilBuilder;
import br.edu.inf011.aval3.enunciado.builder.PerfilDirector;
import br.edu.inf011.aval3.enunciado.exceptions.LimiteDeDocumentosNaCriacaoException;
import br.edu.inf011.aval3.enunciado.model.Perfil;
import br.edu.inf011.aval3.enunciado.proxy.LocalClassificadorPerfil;
import br.edu.inf011.aval3.enunciado.service.Classificador;
import br.edu.inf011.aval3.enunciado.service.ClassificadorPerfil;

public class App {

    private void rodarBuilder() throws LimiteDeDocumentosNaCriacaoException {
		PerfilBuilder perfilBuilder = new PerfilBuilder();
        PerfilDirector director = new PerfilDirector(perfilBuilder);     
		director.criarParaTestarTudoFuncionando();
		Perfil perfil = perfilBuilder.get();
		System.out.println(perfil);
		
		System.out.println("*********************");
		
		director.setBuilder(perfilBuilder);
		director.criarComUsuarioESenha();;
		perfil = perfilBuilder.get();
		System.out.println(perfil);
			
	}

	public void runProxy() throws LimiteDeDocumentosNaCriacaoException {
		PerfilBuilder perfilBuilder = new PerfilBuilder();
        PerfilDirector director = new PerfilDirector(perfilBuilder);     
		director.criarParaTestarTudoFuncionando();
		Perfil perfil = perfilBuilder.get();
		Classificador classificador = new LocalClassificadorPerfil(perfil,new ClassificadorPerfil(perfil), "Fabio", "Fabio");
		System.out.println("Nível: "+classificador.nivel());
		System.out.println("*********************");
	}
    
	public static void main(String[] args) throws LimiteDeDocumentosNaCriacaoException {
		(new App()).runProxy();
	}
}
