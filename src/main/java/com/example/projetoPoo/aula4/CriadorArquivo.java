package com.example.projetoPoo.aula4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CriadorArquivo {


  public static void criarArquivo(){

    Logger logger = Logger.getLogger(CriadorArquivo.class.getName());
    logger.setLevel(Level.FINEST);
    Path diretorioArquivoContatos = Paths.get("PastaContatos");  //Função responsável por criar o diretório na variável diretorioArquivoContatos
    System.out.println(diretorioArquivoContatos.toAbsolutePath());
    List<String> listagemContatos = new ArrayList<>();



     final Path listaContatos = diretorioArquivoContatos.resolve("AgendaDeContatos.txt");

     String caminhoListaContatos = listaContatos.toString();

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

  }

  public static Path getCaminhoArquivo(){
    return Paths.get("PastaContatos").resolve("AgendaDeContatos.txt");
    //Perguntar ao Sombra como ter acesso ao caminho da função "criarArquivo".
  }

}
