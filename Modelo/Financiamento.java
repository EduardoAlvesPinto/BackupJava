package Modelo;

public abstract class Financiamento {
    //Atributos da Classe

    protected double valorImovel;
    protected int prazoFinanciamento;
    protected double taxaJurosAnual;

    //Métodos construtor

    public Financiamento(double valorImo, int prazoFinan, double taxaJuAn){
        this.valorImovel = valorImo;
        this.prazoFinanciamento = prazoFinan;
        this.taxaJurosAnual = taxaJuAn;
    }
    //Metodo para mostrar na tela as informações do Financiamento

    public void mostrarFinancasTela(){
        System.out.println("\nO valor do imóvel é de: " + getValorImovel() + "\nE o valor total do financiamento é de: " + calcularTotalPagamento());
    }

    //Métodos da classe

    public abstract double calcularPagamentoMensal();

    public double calcularTotalPagamento(){
        return (this.calcularPagamentoMensal() * this.prazoFinanciamento * 12);
    }

    public double getValorImovel() {
        return this.valorImovel;
    }

    public int getPrazoFinanciamento() {
        return this.prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return this.taxaJurosAnual;
    }

    public double getTaxaJurosDecimal() {
        return (this.taxaJurosAnual / 100);
    }
}

