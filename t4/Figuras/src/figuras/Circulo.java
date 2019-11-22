package figuras;

public class Circulo extends FIgurasGeometricas {
    private int raio;
    
    public Circulo(int raio){
        super();
        this.raio = raio;
    }
    
    @Override
    public double CalculaArea(){
        return (raio*raio)*3.14;
    }
    
    
    
}
