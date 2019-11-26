package Carros;

public abstract class Veiculo {
    
    private float velocidadeMaxima;
    private float preco;
    
    
    public Veiculo(float vM,float p){
        this.velocidadeMaxima = vM;
        this.preco = p;
    }
    
    public float getPreco(){ // Polimorfismo Estático.
        return preco;
    }
    
    public abstract double calculaIPVA();
    
    public String toString(){
        return "\nVelocidade Máxima: "+ velocidadeMaxima + "\nPreço: " + preco;
    }
    
}
