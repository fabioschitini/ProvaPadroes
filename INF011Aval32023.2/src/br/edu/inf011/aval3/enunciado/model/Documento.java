package br.edu.inf011.aval3.enunciado.model;

import br.edu.inf011.aval3.enunciado.visitor.Visitor;

//Element em VISITOR
public interface Documento {
	public String formatar();
	public boolean validar();
	public Integer pontuar();
	public String accept(Visitor visitor);
}
