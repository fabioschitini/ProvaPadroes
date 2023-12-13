package br.edu.inf011.aval3.enunciado.visitor;

import br.edu.inf011.aval3.enunciado.model.CPF;
import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
import br.edu.inf011.aval3.enunciado.model.EMail;
import br.edu.inf011.aval3.enunciado.model.RG;

//Visitor em VISITOR
public interface Visitor {
    public String visitCPF(CPF cpf);
    public String visitCartaoCredito(CartaoCredito cartaoCredito);
    public String visitEmail(EMail email);
    public String visitRG(RG rg);
}
