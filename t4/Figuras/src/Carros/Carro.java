package Carros;

public class Carro extends Veiculo{
    
    private String cor;
    private final double taxadoIPVA;
    
    public Carro(float vM,float preco,String cor){
        super(vM,preco);
        this.cor = cor;
        taxadoIPVA = 2.5;
    }
    
    @Override
    public double calculaIPVA(){
        return (taxadoIPVA/100) * super.getPreco();
    }
    
    
    @Override
    public String toString(){
        return "\nCor: "+ cor + super.toString() + "\nTaxa Base do IPVA: "+ taxadoIPVA + "\nValor do Imposto: "+ calculaIPVA();
    }
    
    
}
