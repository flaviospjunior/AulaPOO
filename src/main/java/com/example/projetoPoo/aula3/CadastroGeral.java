package com.example.projetoPoo.aula3;

public abstract class CadastroGeral {
    private TipoDeCadastro tipoDeCadastro;
    private String numeroDoCadastro;
    private String nome;
    private String idade;
    private String tipoDePessoa;


    public void validarTipoCadastro(String tpCadastro) {
        for (int i = 0; i < TipoDeCadastro.values().length; i++) {
            TipoDeCadastro teste1 = TipoDeCadastro.values()[i];
            if (teste1.name().equals(tpCadastro)) {
                this.tipoDeCadastro = teste1;
                return;
            }
        }
        throw new TipoDeCadastroInvalidoException();
    }
}


//        for (TipoDeCadastro teste1 :
//                TipoDeCadastro.values()) {
//            if (teste1.name().equals(tpCadastro)) {
//                this.tipoDeCadastro = teste1;
//                return;
//            }
//        }
//        throw new TipoDeCadastroInvalidoException();

//        final TipoDeCadastro tipoDeCadastro1 = Stream.of(TipoDeCadastro.values())   //Estou criando um fluxo com os valores de TipoDeCadastro
//                .filter(tipoDeCadastro -> tipoDeCadastro.name().equals(tpCadastro)) //Filtrando o enumerador
//                .findFirst()
//                .orElseThrow(TipoDeCadastroNaoEncontradoException::new);
//        System.out.println("Tipo de Cadastro Inválido");
//        this.tipoDeCadastro = tipoDeCadastro1;
