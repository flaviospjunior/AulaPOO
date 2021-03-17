package com.example.projetoPoo.aula2;
import java.text.DateFormat;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Tempo {


    private static LocalDate dtNascimento;
    private static LocalDate dtHoje = LocalDate.now();

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public LocalDate getDtHoje() {
        return dtHoje;
    }

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data de nascimento: ");
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dtNascimento = LocalDate.parse(scanner.nextLine(),formatador);
        Period diferenca =  Period.between(dtNascimento,dtHoje);
        System.out.println(String.format( "Você tem %d anos.", diferenca.getYears()));
    }
}
