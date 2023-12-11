package br.edu.inf011.aval3.enunciado.builder;

import java.time.LocalDate;
import br.edu.inf011.aval3.enunciado.exceptions.LimiteDeDocumentosNaCriacaoException;
import br.edu.inf011.aval3.enunciado.model.CPF;
import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
import br.edu.inf011.aval3.enunciado.model.EMail;
import br.edu.inf011.aval3.enunciado.model.RG;
//Director em builder
public class PerfilDirector {
    private Builder builder;

    public PerfilDirector(Builder builder) {
		this.setBuilder(builder);
	}
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public void criarParaTestarTudoFuncionando() throws LimiteDeDocumentosNaCriacaoException {
		this.builder.reset();
		this.builder.addNome("Fabio");
		this.builder.addCpf(new CPF("Fábio", "62103524055"));
		this.builder.addRg(new RG("Fábio", "123214145", "SSP", LocalDate.now().plusDays(1).plusMonths(1)));
		this.builder.addCartaoCredito(new CartaoCredito("Fabio", "1241225151234135", "142", LocalDate.now().plusDays(1).plusMonths(1)));
		this.builder.addEmail(new EMail("Fabio@exemplo.com"));
	}

		public void criarComUsuarioESenha() throws LimiteDeDocumentosNaCriacaoException {
		this.builder.reset();
		this.builder.addNome("Fabio");
		this.builder.addUsuario("Fabio Usuario");
		this.builder.addSenha("Senha Fábio");
		this.builder.addCpf(new CPF("Fábio", "62103524055"));
		this.builder.addRg(new RG("Fábio", "123214145", "SSP", LocalDate.now().plusDays(1).plusMonths(1)));
		this.builder.addCartaoCredito(new CartaoCredito("Fabio", "1241225151234135", "142", LocalDate.now().plusDays(1).plusMonths(1)));
		this.builder.addEmail(new EMail("Fabio@exemplo.com"));
	}
	
	public void criarParaTestarLimiteCpf() throws LimiteDeDocumentosNaCriacaoException {
		this.builder.reset();
		this.builder.addNome("Fabio");
		this.builder.addCpf(new CPF("Fábio", "62103524055"));
		this.builder.addCpf(new CPF("Caia", "62103524056"));
		this.builder.addRg(new RG("Fábio", "123214145", "SSP", LocalDate.now().plusDays(1).plusMonths(1)));
		this.builder.addCartaoCredito(new CartaoCredito("Fabio", "1241225151234135", "142", LocalDate.now().plusDays(1).plusMonths(1)));
		this.builder.addEmail(new EMail("Fabio@exemplo.com"));
	}

	public void criarParaTestarLimiteRg() throws LimiteDeDocumentosNaCriacaoException {
		this.builder.reset();
		this.builder.addNome("Fabio");
		this.builder.addCpf(new CPF("Fábio", "62103524055"));
		this.builder.addRg(new RG("Fábio", "123214145", "SSP", LocalDate.now().plusDays(1).plusMonths(1)));
		this.builder.addRg(new RG("Caian", "123214146", "SSP", LocalDate.now().plusDays(1).plusMonths(2)));
		this.builder.addCartaoCredito(new CartaoCredito("Fabio", "1241225151234135", "142", LocalDate.now().plusDays(1).plusMonths(1)));
		this.builder.addEmail(new EMail("Fabio@exemplo.com"));
	}
	
	public void criarParaTestarLimiteDeCartoes() throws LimiteDeDocumentosNaCriacaoException {
		this.builder.reset();
		this.builder.addNome("Caian");
		this.builder.addCpf(new CPF("Fábio", "62103524055"));
		this.builder.addRg(new RG("Fábio", "123214145", "SSP", LocalDate.now().plusDays(1).plusMonths(1)));
		this.builder.addCartaoCredito(new CartaoCredito("Fabio", "1241225151234135", "142", LocalDate.now().plusDays(1).plusMonths(1)));
		this.builder.addCartaoCredito(new CartaoCredito("Caian", "1241225151234136", "143", LocalDate.now().plusDays(1).plusMonths(2)));
		this.builder.addCartaoCredito(new CartaoCredito("Matheus", "1241225151234137", "144", LocalDate.now().plusDays(1).plusMonths(3)));
		this.builder.addCartaoCredito(new CartaoCredito("Alana", "1241225151234138", "145", LocalDate.now().plusDays(1).plusMonths(4)));
		this.builder.addEmail(new EMail("Caian@exemplo.com"));
	}

	public void criarParaTestarLimiteDeEmails() throws LimiteDeDocumentosNaCriacaoException {
		this.builder.reset();
		this.builder.addNome("Caian");
		this.builder.addCpf(new CPF("Caian", "62103524055"));
		this.builder.addRg(new RG("Caian", "123214145", "SSP", LocalDate.now().plusDays(1).plusMonths(1)));
		this.builder.addCartaoCredito(new CartaoCredito("Fabio", "1241225151234135", "142", LocalDate.now().plusDays(1).plusMonths(1)));
		this.builder.addCartaoCredito(new CartaoCredito("Caian", "1241225151234136", "143", LocalDate.now().plusDays(1).plusMonths(2)));
		this.builder.addEmail(new EMail("Caian@exemplo.com"));
		this.builder.addEmail(new EMail("Fabio@exemplo.com"));
		this.builder.addEmail(new EMail("Matheus@exemplo.com"));
	}
}
