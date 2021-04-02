package com.example.projetoPoo.aula3;

public class CadastroPessoa extends CadastroGeral {

    static final int NUMERO_ONZE = 11;

    public void validarNumeroCadastro(String numeroDoCadastro) {
        int numeroPosicao;
        int contador = 10;
        int somaGeral = 0;
        for (int i = 0; i < 8; i++ ){
            numeroPosicao = Integer.parseInt(numeroDoCadastro.valueOf(numeroDoCadastro.indexOf(i))) * contador;
            contador--;
            somaGeral = (numeroPosicao + somaGeral);

        }
    }

    public void validarPrimeiroDigitoCPF(int somaGeral){

        int digitoVerificador = (NUMERO_ONZE -  (somaGeral % NUMERO_ONZE));
        if (digitoVerificador <= 1) {
            digitoVerificador = 0;
        }

    }
}
