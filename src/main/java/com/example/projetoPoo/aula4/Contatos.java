package com.example.projetoPoo.aula4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Contatos {

    public static Logger logger = Logger.getLogger(Contatos.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.FINEST);
        Path diretorioArquivoContatos = Path.of("src", "main", "resources", "aula4", "Contatos");  //Função responsável por criar o diretório na variável diretorioArquivoContatos
        System.out.println(diretorioArquivoContatos.toAbsolutePath());

        final Path listaContatos = diretorioArquivoContatos.resolve("teste.txt");
        try {
            Files.createFile(listaContatos);
        } catch (IOException e) {
            e.printStackTrace();
        }


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
    }
}

