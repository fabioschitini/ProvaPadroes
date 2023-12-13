package br.edu.inf011.aval3.enunciado.visitor;
import br.edu.inf011.aval3.enunciado.model.CPF;
import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
import br.edu.inf011.aval3.enunciado.model.EMail;
import br.edu.inf011.aval3.enunciado.model.RG;

//Concrete Visitor em VISITOR
public class CalcValidadeVisitor implements Visitor{

    @Override
    public String visitCPF(CPF cpf) {
        String qtdDiasFimValidade = "A validade do cpf...";
        return qtdDiasFimValidade;
    }

    @Override
    public String visitCartaoCredito(CartaoCredito cartaoCredito) {
        String qtdDiasFimValidade = "A validade do cartao...";
        return qtdDiasFimValidade;
    }

    @Override
    public String visitEmail(EMail email) {
        String qtdDiasFimValidade = "A validade do email...";
        return qtdDiasFimValidade;
    }

    @Override
    public String visitRG(RG rg) {
        String qtdDiasFimValidade = "A validade rg...";
        return qtdDiasFimValidade;
    }

}