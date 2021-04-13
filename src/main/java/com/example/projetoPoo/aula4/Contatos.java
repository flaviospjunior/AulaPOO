package com.example.projetoPoo.aula4;

import java.nio.file.Files;
import java.nio.file.Path;

public class Contatos {
    public static void main(String[] args) {
        Path diretorioArquivoContatos = Path.of("src", "java", "com.example.projetoPoo", "aula4", "Contatos");  //Função responsável por criar o diretório na variável diretorioArquivoContatos
        System.out.println(diretorioArquivoContatos.toAbsolutePath());

        Files.createDirectories(diretorioArquivoContatos);


    }
}

