package br.edu.inf011.aval3.enunciado;

import java.util.ArrayList;
import java.util.List;

import br.edu.inf011.aval3.enunciado.builder.PerfilBuilder;
import br.edu.inf011.aval3.enunciado.builder.PerfilDirector;
import br.edu.inf011.aval3.enunciado.exceptions.LimiteDeDocumentosNaCriacaoException;
import br.edu.inf011.aval3.enunciado.model.Documento;
import br.edu.inf011.aval3.enunciado.model.Perfil;
import br.edu.inf011.aval3.enunciado.proxy.LocalClassificadorPerfil;
import br.edu.inf011.aval3.enunciado.service.Classificador;
import br.edu.inf011.aval3.enunciado.service.ClassificadorPerfil;
import br.edu.inf011.aval3.enunciado.visitor.CalcValidadeVisitor;


//Cliente em VISITOR, BUILDER & PROXY
public class App {
	//questao 1
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
	//questao 3
	public void runProxy() throws LimiteDeDocumentosNaCriacaoException {
		PerfilBuilder perfilBuilder = new PerfilBuilder();
        PerfilDirector director = new PerfilDirector(perfilBuilder);     
		director.criarParaTestarTudoFuncionando();
		Perfil perfil = perfilBuilder.get();
		Classificador classificador = new LocalClassificadorPerfil(perfil,new ClassificadorPerfil(perfil), "Fabio", "Fabio");
		System.out.println("Nível: "+classificador.nivel());
		System.out.println("*********************");
	}
	//questao 2(roda todos os padroes nele tambem)
	public void runVisitor() throws LimiteDeDocumentosNaCriacaoException {
		PerfilBuilder perfilBuilder = new PerfilBuilder();
        PerfilDirector director = new PerfilDirector(perfilBuilder);     
		director.criarParaTestarTudoFuncionando();
		Perfil perfil = perfilBuilder.get();
		Classificador classificador = new LocalClassificadorPerfil(perfil,new ClassificadorPerfil(perfil), "Fabio", "Fabio");
		System.out.println("Nível: "+classificador.nivel());
		System.out.println("*********************");
		List<Documento> listaDocumentos = perfil.documentos().toList();
		List<String> listaValidades = new ArrayList<String>();
		for (Documento documento : listaDocumentos) {
			String validadeDocumento = documento.accept(new CalcValidadeVisitor());
			listaValidades.add(validadeDocumento);
			System.out.println(validadeDocumento);
		}
	}

    
	public static void main(String[] args) throws LimiteDeDocumentosNaCriacaoException {
		(new App()).runVisitor();
	}
}
