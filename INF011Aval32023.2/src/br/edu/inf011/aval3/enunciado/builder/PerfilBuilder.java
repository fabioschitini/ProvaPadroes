package br.edu.inf011.aval3.enunciado.builder;

import java.util.ArrayList;
import java.util.List;

import br.edu.inf011.aval3.enunciado.exceptions.LimiteDeDocumentosNaCriacaoException;
import br.edu.inf011.aval3.enunciado.model.Documento;
import br.edu.inf011.aval3.enunciado.model.Perfil;
//Concrete Builder em builder
public class PerfilBuilder implements Builder {
    private List<Documento> documentos;
    private List<Documento> cartoes;
    private List<Documento> emails;
    private Documento cpf;
    private Documento rg;
    private String user;
    private String nome;
    private String pwd;

    public void reset() {
		this.documentos = new ArrayList<Documento>();
        this.cartoes = new ArrayList<Documento>();
		this.emails = new ArrayList<Documento>();
        this.cpf=null;
        this.rg=null;
        this.nome=null;
        this.user=null;
        this.pwd=null;
	}; 

    public void addNome(String nome){
        this.nome=nome;
    }  

    public void addUsuario(String usuario){
        this.user=usuario;
    }

    public void addSenha(String senha){
        this.pwd=senha;
    }

    public void addCartaoCredito(Documento cartao) throws LimiteDeDocumentosNaCriacaoException{
        if(this.cartoes.size()>2) throw new LimiteDeDocumentosNaCriacaoException("Atingiu o limite de cartões na criação do perfil");
        this.cartoes.add(cartao);
        this.documentos.add(cartao);
        }

    public void addEmail(Documento email) throws LimiteDeDocumentosNaCriacaoException{
        if(this.emails.size()>1) throw new LimiteDeDocumentosNaCriacaoException("Atingiu o limite de emails na criação do perfil");
        this.emails.add(email);
        this.documentos.add(email);
        }

    public void addCpf(Documento cpf) throws LimiteDeDocumentosNaCriacaoException{
        if(this.cpf!=null) throw new LimiteDeDocumentosNaCriacaoException("Atingiu o limite de cpf's na criação do perfil");
        this.cpf=cpf;
        this.documentos.add(cpf);
        }

    public void addRg(Documento rg) throws LimiteDeDocumentosNaCriacaoException{
        if(this.rg!=null) throw new LimiteDeDocumentosNaCriacaoException("Atingiu o limite de rg's na criação do perfil");
        this.rg=rg;
        this.documentos.add(rg);
        }

    public Perfil get(){
        if(this.user==null)this.user=this.nome;
        if(this.pwd==null)this.pwd=this.nome;
        return new Perfil(this.nome, this.user, this.pwd, this.documentos);
    }

}
