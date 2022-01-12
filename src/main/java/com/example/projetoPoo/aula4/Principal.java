package com.example.projetoPoo.aula4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Principal {

  public static void main(String[] args) {
    String tipoContato;
    String nome;
    String email;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o tipo de contato(PESSOAL OU PROFISSIONAL):");
    tipoContato = scanner.nextLine();

    System.out.println("Digite o nome:");
    nome= scanner.nextLine();

    System.out.println("Digite o E-mail:");
    email = scanner.nextLine();


  }
        }

/*if (contatos.getOpcaoOperacao() == 1){
            System.out.println("Digite o nome do contato:");
            contatos.nomeContato = scanner.nextLine();
            listagemContatos.add(contatos.nomeContato);
            System.out.println(listagemContatos.size());
            try {
                Files.write(listaContatos, listagemContatos);
            } catch (IOException e) {
                e.printStackTrace();
            }*/
