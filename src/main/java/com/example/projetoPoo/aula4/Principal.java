package com.example.projetoPoo.aula4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal {

    public static Logger logger = Logger.getLogger(Principal.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.FINEST);
        Path diretorioArquivoContatos = Path.of("src", "main", "resources", "aula4", "Contatos");  //Função responsável por criar o diretório na variável diretorioArquivoContatos
        System.out.println(diretorioArquivoContatos.toAbsolutePath());

                List <String> listagemContatos = new ArrayList<>();
        try {
            if (Files.exists(diretorioArquivoContatos)) {
                logger.info("Diretório já existe.");
            } else {
                Files.createDirectories(diretorioArquivoContatos);
                logger.info("Diretório criado com sucesso!");
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Não foi possível criar o diretório");
        }

        final Path listaContatos = diretorioArquivoContatos.resolve("AgendaDeContatos.txt");
        try {
            if (Files.exists((listaContatos))) {
                logger.info("Arquivo não foi criado pois já existe!");
            } else {
                Files.createFile(listaContatos);
                logger.info("Arquivo criado com sucesso!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Contatos contatos = new Contatos();

        if (contatos.getOpcaoOperacao()== 1){
            System.out.println("Digite o contato:");

            listagemContatos.add(contatos.contato);
            try {
                Files.write(listaContatos, listagemContatos);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}



