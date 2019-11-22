package figuras;

public class Quadrado extends FIgurasGeometricas{
    
    private int lado;
    
    public Quadrado(int lado){
        super(); // Já que estende a classe FIgurasGeometricas, precisa do super.
        this.lado = lado;
    }
    
    @Override
    public double CalculaArea(){ // Método abstrato da sua superclasse.
        return lado*lado;
    }
    
}
