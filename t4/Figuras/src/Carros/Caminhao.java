package Carros;

public class Caminhao extends Veiculo{
    private float cargaMaxima;
    private final double taxadoIPVA;
    
    public Caminhao(float vM,float p,float cargaMaxima){
        super(vM,p);
        this.cargaMaxima= cargaMaxima;
        taxadoIPVA = 1.5;
    }
    
    @Override
    public double calculaIPVA(){
        return (taxadoIPVA / 100) * super.getPreco();
    }
    
    @Override
    public String toString(){
        return "\nPeso: "+ cargaMaxima + super.toString() + "\nTaxa Base do IPVA: "+ taxadoIPVA + "\nValor do Imposto: "+ calculaIPVA();
    }
        
}
