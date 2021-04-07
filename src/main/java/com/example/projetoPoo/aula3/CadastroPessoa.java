package com.example.projetoPoo.aula3;

public class CadastroPessoa extends CadastroGeral {

    static final int NUMERO_ONZE = 11;

    public int[] validarNumeroCadastro(String numeroDoCadastro) {
        numeroDoCadastro = getNumeroDoCadastro();
        int numeroPosicao1;
        int numeroPosicao2;
        int contador1 = 10;

        int contador2 = 11;
        int somaGeral1 = 0;
        int somaGeral2 = 0;

        for (int i = 0; i < 8; i++ ){
            numeroPosicao1 = Integer.parseInt(numeroDoCadastro.valueOf(numeroDoCadastro.indexOf(i))) * contador1;
            numeroPosicao2 = Integer.parseInt(numeroDoCadastro.valueOf(numeroDoCadastro.indexOf(i))) * contador2;
            contador1--;
            contador2--;
            somaGeral1 = (numeroPosicao1 + somaGeral1);
            somaGeral2 = (numeroPosicao2 + somaGeral2);
        }
        int [] somas = {somaGeral1,somaGeral2};
        return somas;
    }

    public void validarPrimeiroDigitoCPF(){
        String numeroDoCadastro = getNumeroDoCadastro();
        int [] somasGerais = validarNumeroCadastro(numeroDoCadastro);
        int digitoVerificador1 = (NUMERO_ONZE -  (somasGerais[0] % NUMERO_ONZE));
        if (digitoVerificador1 <= 1) {
            digitoVerificador1 = 0;
        }
        int digitoVerificador2 = (NUMERO_ONZE -  (somasGerais[1] % NUMERO_ONZE));
        if (digitoVerificador2 <= 1) {
            digitoVerificador2 = 0;
        }
        if ( Integer.parseInt(numeroDoCadastro.valueOf(numeroDoCadastro.indexOf(9))) != digitoVerificador1 ||
                Integer.parseInt(numeroDoCadastro.valueOf(numeroDoCadastro.indexOf(10))) != digitoVerificador2){
            throw new NumeroCPFInvalidoException();
        }
    }
}
