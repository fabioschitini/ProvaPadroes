package br.edu.inf011.aval3.enunciado.service;

import br.edu.inf011.aval3.enunciado.model.Perfil;
//SUBJECT em um PROXY
public interface Classificador {
	public NivelPerfil nivel();
	public Perfil getPerfil();
	
}
