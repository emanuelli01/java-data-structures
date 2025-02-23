public class Carros {
    private String placa;
    private String cor;
    private String nome;
    private int velocidadeMax;
    
    public Carros(String placa, String cor, String nome, int velocidadeMax){
        this.placa= placa;
        this.cor= cor;
        this.velocidadeMax= velocidadeMax;
        this.nome=nome;
    }

    public String getPlaca(){
        return placa;
    }

    public int getVelocidadeMax(){
        return velocidadeMax;
    }

    public String getNome(){
        return nome;
    }

}
