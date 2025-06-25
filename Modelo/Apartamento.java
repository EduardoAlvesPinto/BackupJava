package Modelo;

public class Apartamento extends Financiamento{
    //Atributos exclusivos dessa classe
    private int numeroAndar;
    private int numeroVagas;
    protected double taxaJurosMensal;
    protected int totalMesesFinanciamento;

    //Contrutor Atualizado para esta SUb-Classe

    public Apartamento(double valorImo, int prazoFinan, double taxaJuAn, int numeroAndar, int numeroVagas) {
        super(valorImo, prazoFinan, taxaJuAn);
        this.numeroVagas = numeroVagas;
        this.numeroAndar= numeroAndar;
        this.taxaJurosMensal = taxaJuAn / 12;
        this.totalMesesFinanciamento = prazoFinan * 12;
    }

    public double calcularPagamentoMensal(){
        /* Fórmula implementada conforme enunciado da atividade, mesmo que não inclua a multiplicação por taxa mensal.
         A versão completa do sistema PRICE incluiria "* taxaJurosMensal" no numerador.
         Ao realizar uma pesquisa rápida, percebi essa diferença. Caso eu esteja equivocado, por favor, me corrija,
         pois não entendi o motivo da remoção dessa parte da fórmula.*/
        return  (valorImovel * (Math.pow(1 + taxaJurosMensal, totalMesesFinanciamento)))
                / (Math.pow(1 + taxaJurosMensal, totalMesesFinanciamento) - 1);
    }

    public int getNumeroAndar() {
        return numeroAndar;
    }

    public int getNumeroVagas() {
        return numeroVagas;
    }
}
