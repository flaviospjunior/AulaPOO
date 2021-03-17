package com.example.projetoPoo.aula1;

import java.util.Scanner;
/*


 */

public class Principal {

    public static void main(String[] args) {
        final Motorista PessoaQualquer = new Motorista();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a marca do carro: ");
        PessoaQualquer.getCarro().setMarcaAutomovel(scanner.nextLine());
        System.out.println("Digite a modelo do carro: ");
        PessoaQualquer.getCarro().setModeloAutomovel(scanner.nextLine());
        System.out.println("Digite o tamanho da roda: ");
        PessoaQualquer.getCarro().setTamanhoRoda(scanner.nextInt());
        System.out.println("Digite a Kilometragem: ");
        PessoaQualquer.getCarro().setKilometragem(scanner.nextInt());
    }
}