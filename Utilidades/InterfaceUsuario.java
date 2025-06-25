package Utilidades;
import java.util.Scanner;

public class InterfaceUsuario {

    Scanner sc = new Scanner(System.in);

    public double pegarValorImovel() {
        double valorImovel;
        do {
            System.out.print("Por favor, digite o Valor do Imóvel: ");
            valorImovel = sc.nextDouble();
            if (valorImovel <= 0) {
                System.out.println("Valor inválido. O valor do imóvel deve ser maior que 0. Tente novamente.");
            }
        } while (valorImovel <= 0);
        return valorImovel;
    }

    public int pegarPrazoFinanciamento() {
        int valorFinaAnos;
        do {
            System.out.println("Por favor, adicione o prazo do financiamento em ANOS:");
            valorFinaAnos = sc.nextInt();
            if (valorFinaAnos <= 0 || valorFinaAnos > 50) {
                System.out.println("Valor inválido. Deve ser entre 1 e 50 anos.");
            }
        } while (valorFinaAnos <= 0 || valorFinaAnos > 50);
        return valorFinaAnos;
    }

    public double pegarTaxaJurosAnual() {
        double valorTaxa;
        do {
            System.out.println("Por favor, adicione o valor da Taxa de Juros Anual (use ',' como separador decimal): ");
            valorTaxa = sc.nextDouble();
            if (valorTaxa < 0 || valorTaxa > 1000) {
                System.out.println("Valor inválido. Deve estar entre 0% e 1000%.");
            }
        } while (valorTaxa < 0 || valorTaxa > 1000);
        return valorTaxa;
    }

    public int pegarNumeroVagas() {
        int numeroVagas;
        do {
            System.out.println("Por favor, adicione o número de vagas do seu apartamento: ");
            numeroVagas = sc.nextInt();
            if (numeroVagas < 0 || numeroVagas > 50) {
                System.out.println("Valor inválido. Deve estar entre 0 e 50.");
            }
        } while (numeroVagas < 0 || numeroVagas > 50);
        return numeroVagas;
    }

    public int pegarNumeroAndar() {
        int numeroAndar;
        do {
            System.out.println("Por favor, adicione o número do andar do seu apartamento: ");
            numeroAndar = sc.nextInt();
            if (numeroAndar < 0 || numeroAndar > 1000) {
                System.out.println("Valor inválido. Deve estar entre 0 e 1000.");
            }
        } while (numeroAndar < 0 || numeroAndar > 1000);
        return numeroAndar;
    }

    public double pegarAreaConstruida() {
        double areaConstruida;
        do {
            System.out.println("Por favor, adicione a área construída (em metros quadrados): ");
            areaConstruida = sc.nextDouble();
            if (areaConstruida < 0 || areaConstruida > 500000) {
                System.out.println("Valor inválido. Deve estar entre 0 e 500.000 m².");
            }
        } while (areaConstruida < 0 || areaConstruida > 500000);
        return areaConstruida;
    }

    public double pegarTamanhoTerreno() {
        double tamanhoTerreno;
        do {
            System.out.println("Por favor, adicione o tamanho do terreno (em metros quadrados): ");
            tamanhoTerreno = sc.nextDouble();
            if (tamanhoTerreno <= 0 || tamanhoTerreno > 1000000) {
                System.out.println("Valor inválido. Deve estar entre 1 e 1.000.000 m².");
            }
        } while (tamanhoTerreno <= 0 || tamanhoTerreno > 1000000);
        return tamanhoTerreno;
    }
}
