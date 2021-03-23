package com.example.projetoPoo.aula3;

public abstract class CadastrosGerais {
    protected String nome;
    protected TiposDeCadastro opcaoCadastro;
    protected int idade;
    protected String cnpj;
    protected String cpf;


    public void CalcularIdade(){
    };

    public CadastrosGerais(String nome){
        this.nome=nome;
    }
}
