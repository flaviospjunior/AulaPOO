package com.example.projetoPoo.aula4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class InicializadorArquivo {
  private static String inicioJson = "{}";
  public static String getData(){

    String data= null;
    {
      try {
        data = String.valueOf(Files.readAllLines(CriadorArquivo.getCaminhoArquivo()));
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    if (data=="[]"){
      try {
        Files.write(CriadorArquivo.getCaminhoArquivo(),inicioJson.getBytes());
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return data;
  }



}
