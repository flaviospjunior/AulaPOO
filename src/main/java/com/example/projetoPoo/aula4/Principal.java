package com.example.projetoPoo.aula4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static Logger logger = Logger.getLogger(Principal.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.FINEST);
        Path diretorioArquivoContatos = Path.of("src", "main", "resources", "aula4", "Contatos");  //Função responsável por criar o diretório na variável diretorioArquivoContatos
        System.out.println(diretorioArquivoContatos.toAbsolutePath());

        try {
            if (Files.exists(diretorioArquivoContatos)) {
                logger.info("Diretório já existe.");
            } else {
                Files.createDirectories(diretorioArquivoContatos);
                logger.info("Diretório criado com sucesso.");
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Não foi possível criar o diretório");
        }

        final Path listaContatos = diretorioArquivoContatos.resolve("AgendaDeContatos.txt");
        try {
            if (Files.exists((listaContatos))) {
                logger.info("Arquivo não foi criado pois já existe");
            } else {
                Files.createFile(listaContatos);
                logger.info("Arquivo criado com sucesso!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

