package Main;

import Modelo.*;
import Utilidades.InterfaceUsuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Interface de Financiamento");
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        List<Financiamento> listaDosFinanciamentos = new ArrayList<>();

        // Solicita dados do usuário apenas para 1 financiamento
        System.out.println("\n--- Financiamento informado pelo usuário ---");
        double taxaJurosAnual = interfaceUsuario.pegarTaxaJurosAnual();
        int prazoFinanciamento = interfaceUsuario.pegarPrazoFinanciamento();
        double valorImovel = interfaceUsuario.pegarValorImovel();
        int numeroAndar = interfaceUsuario.pegarNumeroAndar();
        int numeroVagas = interfaceUsuario.pegarNumeroVagas();

        Financiamento apartamentoDoUsuario = new Apartamento(valorImovel, prazoFinanciamento, taxaJurosAnual, numeroAndar, numeroVagas );
        listaDosFinanciamentos.add(apartamentoDoUsuario);

        // Financiamentos definidos automaticamente
        Financiamento casa1 = new Casa(250000.0, 20, 9);
        Financiamento casa2 = new Casa(270000.0, 15, 7.5);
        Financiamento apartamento1 = new Apartamento(320000.0, 25, 8,5,5);
        Financiamento terreno1 = new Terreno(150000.0, 10, 7, TipoZona.RESIDENCIAL);

        listaDosFinanciamentos.add(casa1);
        listaDosFinanciamentos.add(casa2);
        listaDosFinanciamentos.add(apartamento1);
        listaDosFinanciamentos.add(terreno1);

        //Exibe informações de cada financiamento
        //Não sei se está correto essa lógica específica
        double somaValorImoveis = 0;
        double somaTotalFinanciamentos = 0;

        for (int i = 0; i < listaDosFinanciamentos.size(); i++) {
            Financiamento f = listaDosFinanciamentos.get(i);
            double parcela = f.calcularPagamentoMensal();
            double total = f.calcularTotalPagamento();

            System.out.println("\nFinanciamento " + (i + 1) + ":");
            System.out.println("Valor do Imóvel: R$" + String.format("%.2f", f.getValorImovel()));
            System.out.println("Prazo: " + f.getPrazoFinanciamento() + " anos");
            System.out.println("Taxa de Juros Anual: " + String.format("%.2f", f.getTaxaJurosAnual()) + "%");
            System.out.println("Pagamento Mensal: R$" + String.format("%.2f", parcela));
            System.out.println("Total a Pagar: R$" + String.format("%.2f", total));

            somaValorImoveis += f.getValorImovel();
            somaTotalFinanciamentos += total;
        }

        // Exibe o total
        System.out.println("\n=== Resumo Final ===");
        System.out.println("Soma dos Valores dos Imóveis: R$" + String.format("%.2f", somaValorImoveis));
        System.out.println("Soma dos Valores dos Financiamentos: R$" + String.format("%.2f", somaTotalFinanciamentos));
    }
}