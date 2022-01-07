package com.example.projetoPoo.aula4;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Scanner;

public class Contatos {

 static ObjectMapper mapper = new ObjectMapper();
  String data = InicializadorArquivo.getData();

  public static ObjectMapper getMapper() {
    return mapper;
  }
}
