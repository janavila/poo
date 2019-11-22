package figuras;

public class Triangulo extends FIgurasGeometricas{
    
    private int base;
    private int altura;
    
    public Triangulo(int base, int altura){
        super();
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double CalculaArea(){
        return (base*altura)/2;
    }
    
}
