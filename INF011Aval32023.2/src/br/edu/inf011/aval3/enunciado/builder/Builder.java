package br.edu.inf011.aval3.enunciado.builder;
//interface Builder em Builder

import br.edu.inf011.aval3.enunciado.exceptions.LimiteDeDocumentosNaCriacaoException;
import br.edu.inf011.aval3.enunciado.model.Documento;

public interface Builder {
    public void reset();
    public void addUsuario(String usuario);
    public void addNome(String nome);
    public void addSenha(String senha);
    public void addCartaoCredito(Documento documento)throws LimiteDeDocumentosNaCriacaoException;
    public void addCpf(Documento documento)throws LimiteDeDocumentosNaCriacaoException;
    public void addEmail(Documento documento)throws LimiteDeDocumentosNaCriacaoException;
    public void addRg(Documento documento)throws LimiteDeDocumentosNaCriacaoException;

}