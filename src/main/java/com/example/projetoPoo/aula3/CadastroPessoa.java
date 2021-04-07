package com.example.projetoPoo.aula3;

public class CadastroPessoa extends CadastroGeral {

    static final int NUMERO_ONZE = 11;

    public void validarNumeroCadastro(String numeroDoCadastro) {
        numeroDoCadastro = getNumeroDoCadastro();
        int numeroPosicao1;
        int numeroPosicao2;
        int contador1 = 10;
        int contador2 = 11;
        int somaGeral1 = 0;
        int somaGeral2 = 0;;
        for (int i = 0; i < 8; i++ ){
            numeroPosicao1 = Integer.parseInt(numeroDoCadastro.valueOf(numeroDoCadastro.indexOf(i))) * contador1;
            numeroPosicao2 = Integer.parseInt(numeroDoCadastro.valueOf(numeroDoCadastro.indexOf(i))) * contador2;
            contador1--;
            contador2--;
            somaGeral1 = (numeroPosicao1 + somaGeral1);
            somaGeral2 = (numeroPosicao2 + somaGeral2);
        }
    }

    public void validarPrimeiroDigitoCPF(int somaGeral){
        String numeroDoCadastro = getNumeroDoCadastro();
        int digitoVerificador = (NUMERO_ONZE -  (somaGeral % NUMERO_ONZE));
        if (digitoVerificador <= 1) {
            digitoVerificador = 0;
        }
        if ( Integer.parseInt(numeroDoCadastro.valueOf(numeroDoCadastro.indexOf(8))) != digitoVerificador){
            throw new NumeroCPFInvalidoException();
        }
    }
}
