package Modelo;

public class Terreno extends Financiamento {
    // Atributo para o tipo de zona
    private TipoZona tipoZona;

    // Construtor
    public Terreno(double valorImo, int prazoFinan, double taxaJuAn, TipoZona tipoZona) {
        super(valorImo, prazoFinan, taxaJuAn);
        this.tipoZona = tipoZona;
    }

    // Getter
    public TipoZona getTipoZona() {
        return tipoZona;
    }

    // Fórmula original mantida
    @Override
    public double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (getTaxaJurosDecimal() / 12)) * 1.02;
    }
}