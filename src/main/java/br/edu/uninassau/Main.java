package br.edu.uninassau;

import java.util.Scanner;

public class Main extends Endereco {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro do endereço.");

        System.out.println("Digite o CEP: ");
        int cep = sc.nextInt();
        endereco.setCep(cep);

        System.out.println(endereco.getCep());
    }
}