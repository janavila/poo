package figuras;

public class Retangulo extends FIgurasGeometricas{

    private int base;
    private int altura;
    
    public Retangulo(int base,int altura){
        super();
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double CalculaArea(){
        return base*altura;
    }
    
}
