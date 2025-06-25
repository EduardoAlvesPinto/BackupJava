package Modelo;

public class Casa extends Financiamento{
    // ATRIBUITOS
    private double areaConstruida;
    private double tamanhoTerreno;
    //Contrutor Atualizado para esta SUb-Classe

    public Casa (double valorImo, int prazoFinan, double taxaJuAn){
        super(valorImo, prazoFinan, taxaJuAn);
    }

    public double calcularPagamentoMensal(){
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (getTaxaJurosDecimal() / 12)) + 80;
    }


    public double getAreaConstruida() {
        return areaConstruida;
    }

    public double getTamanhoTerreno() {
        return tamanhoTerreno;
    }
}
