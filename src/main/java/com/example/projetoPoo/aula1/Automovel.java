package com.example.projetoPoo.aula1;

public class Automovel {
    private String tipoAutomovel;
    private String marcaAutomovel;
    private String modeloAutomovel;
    private int tamanhoRoda;
    private int kilometragem;
    private String possuiAirBag;
    private String cor;
    private String numeroPortas;
    private String categoria;
    private String TipoCambio;

    public void setTamanhoRoda(int tamanhoRoda) {
        if(tamanhoRoda<=0){
            throw new IllegalArgumentException("Não é possível existir uma roda menor ou igual a 0.");
        }
        if(tamanhoRoda>30){
            throw new IllegalArgumentException("Não há roda maior que 30");
        }
        this.tamanhoRoda = tamanhoRoda;
    }

    public void setKilometragem(int kilometragem)  {
        if(kilometragem< 0 ){
            throw new IllegalArgumentException("Comprar carro 0km é prejuízo");
        }
        this.kilometragem = kilometragem;
    }

    public int getKilometragem() {
        return kilometragem;
        }

    public void setModeloAutomovel(String modeloAutomovel) {
        if( modeloAutomovel.equals("MAREA")  ){
            throw new IllegalArgumentException("Parabéns! Você comprou uma bomba e seu carro vai explodir.");
        }
        if( modeloAutomovel.equals("RENEGADE")  ){
            throw new IllegalArgumentException("Ninguém compra um UNO bombado.");
        }
        if( modeloAutomovel.equals("HILUX")  ){
            throw new IllegalArgumentException("Carro de quem ouve sertanejo universitário");
        }
        if( modeloAutomovel.equals("HB20")  ){
            throw new IllegalArgumentException("Carro de playboy.");
        }
        if( modeloAutomovel.equals("M")  ){
            throw new IllegalArgumentException("Parabéns! Você comprou uma bomba e seu carro vai explodir.");
        }
    }
    public void setMarcaAutomovel(String marcaAutomovel) {
        if (marcaAutomovel.equals("FIAT")) {
            throw new IllegalArgumentException("Manutenção barata, mas tem toda hora... :(");
        }
        if (marcaAutomovel.equals("PEGEOT") || marcaAutomovel.equals("RENEAULT") ) {
            throw new IllegalArgumentException("Ta de brincadeira? Carro francês? Sério mesmo?");
        }
    }

}
