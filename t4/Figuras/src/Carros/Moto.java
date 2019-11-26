package Carros;

public class Moto extends Veiculo{
    private int cilindradas;
    private final double taxadoIPVA;
    
    public Moto(float vM,float preco,int cilindradas){
        super(vM,preco);
        this.cilindradas = cilindradas;
        taxadoIPVA = 2.0;
        
    }
    
    @Override
    public double calculaIPVA(){
        return (taxadoIPVA/100) * super.getPreco();
    }
    
    @Override
    public String toString(){
        return "\nCilindridas: "+ cilindradas + super.toString() + "\nTaxa Base do IPVA: "+ taxadoIPVA + "\nValor do Imposto: "+ calculaIPVA();
    }
}
