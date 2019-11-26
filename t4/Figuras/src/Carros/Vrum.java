package Carros;

// Cadastro de Carros.

public class Vrum {
    
    private Veiculo[] veiculos;
    private int numeroDeVeiculos;
    
    public Vrum(){
        veiculos = new Veiculo[12];
        numeroDeVeiculos = 0;
    }
            
    public void inserirVeiculo(Veiculo v) {
        if (numeroDeVeiculos < veiculos.length)
            veiculos[numeroDeVeiculos++] = v;
    }
    
    public void exibeInfoVeiculo() {
        for(int i = 0; i < numeroDeVeiculos; i++) {
            System.out.println("Veiculo["+i+"] : " + veiculos[i]+"\n"); // Vai para o toString("Método Especial").
            
        }
        
    }
    
    
    public static void main(String[] args) {
        Vrum cadastro = new Vrum(); // "Controla".
        
        cadastro.inserirVeiculo(new Carro(120,15000, "Preto"));
        cadastro.inserirVeiculo(new Caminhao(120,70000, 5));
        cadastro.inserirVeiculo(new Moto(280,55000, 1200));
        
        cadastro.exibeInfoVeiculo();
    }
    
}
