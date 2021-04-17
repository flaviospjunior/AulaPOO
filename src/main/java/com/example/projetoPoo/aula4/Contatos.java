package com.example.projetoPoo.aula4;

import java.util.Scanner;

public class Contatos {
    Scanner scanner = new Scanner(System.in);

    public int getOpcaoOperacao() {
        return opcaoOperacao;
    }

    private int opcaoOperacao = scanner.nextInt();
    String contato = AdicionarContato().toString();
    String numeroTelefone;

   public CharSequence AdicionarContato(){
       CharSequence contatoDigitado = scanner.nextLine();
       return contatoDigitado;
    }
}
