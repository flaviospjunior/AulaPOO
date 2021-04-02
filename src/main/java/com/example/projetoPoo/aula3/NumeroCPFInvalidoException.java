package com.example.projetoPoo.aula3;

public class NumeroCPFInvalidoException extends RuntimeException {
    public NumeroCPFInvalidoException(){
        super("Numero de CPF inválido!");
    }
}
