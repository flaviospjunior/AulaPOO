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
        Scanner scanner = new Scanner(System.in);

        CriadorArquivo.criarArquivo();
        if (InicializadorArquivo.getData()=="[]"){
          System.out.println("1");
      } else System.out.println("2");
        System.out.println(InicializadorArquivo.getData());


        Contatos contatos = new Contatos();

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

        }


    }



