package com.example.projetoPoo.aula4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InicializadorArquivo {
  public static void inicializacao(){
    Path diretorioArquivoContatos = Paths.get("PastaContatos");
    Logger logger = Logger.getLogger(CriadorArquivo.class.getName());

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
  }


  }


