package com.example.projetoPoo.aula2;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Random;





public class Tempo {

    private static LocalDate dtNascimento;
    private static LocalDate dtHoje = LocalDate.now();
    private static LocalDate dtMorte;
    private static String dtMorteFormatada ;

    public static String getDtMorteFormatada() {

        Random rand = new Random();
        dtMorteFormatada = dtHoje.plusDays(rand.nextInt()).toString();
        return dtMorteFormatada;
    }

    public static LocalDate getDtMorte() {
        return dtMorte;
    }

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
        DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        dtNascimento = LocalDate.parse(scanner.nextLine(),formatador);


        Period diferenca =  Period.between(dtNascimento,dtHoje);
        System.out.println(String.format( "Você tem %d anos.", diferenca.getYears() ) );
        System.out.println(LocalDate.parse(getDtMorteFormatada(),formatador2));
    }
}
