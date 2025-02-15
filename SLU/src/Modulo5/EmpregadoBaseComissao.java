package Modulo5;

import java.util.Scanner;


public class EmpregadoBaseComissao {
	
	private String nome;
    private double vendasBrutas;
    private double taxaComissao;

    public EmpregadoBaseComissao(String nome, double vendasBrutas, double taxaComissao) {
        this.nome = nome;
        this.vendasBrutas = vendasBrutas;
        this.taxaComissao = taxaComissao;
    }

    public double calcularPagamento() {
        return vendasBrutas * taxaComissao;
    }

    public String getNome() {
        return nome;
    }
}
