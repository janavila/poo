package lista;

public class Lista {

    private caneta[] pen;
    int numeroDeElementos;
    
    public Lista(int n){
        pen = new caneta[n];
        numeroDeElementos = 0;
    }
        
    public void inserir(String cor){
        caneta nov = new caneta(cor);
        if(numeroDeElementos == pen.length) {
           caneta[] novaCaneta = new caneta[numeroDeElementos * 2];
           for(int i = 0; i < pen.length; i++) {
               novaCaneta[i] = pen[i];
           }
           
           pen = novaCaneta;
           
        }
     
            pen[numeroDeElementos++] = nov;
            
        }
 
    
    public caneta retornaItem(int n){
        return pen[n];

    }
    
    public int tamanho(){
        return numeroDeElementos;
    }
    
    public void imprime(){
        int n = 1;
        for(caneta t: pen){
            if(t != null) {
            System.out.println("Caneta: "+n+"\nCor: "+t.getCor()+"\n");
            n++;
            }
    }
}

public static void main(String[] args) {
        Lista lista = new Lista(2);
        
        lista.inserir("Vermelho");
        lista.inserir("Amarelo");
        lista.inserir("Azul");
        lista.inserir("Ciano");
        lista.inserir("Branco");
        lista.inserir("Preto");
        lista.imprime();
        
        
    }
    
}
