package projaviao;


public class Aviao {

    protected boolean[] passageiros; // 1 - Ocupado, 0 - Desocupado.
    private int naviao;
    private Data date;
    private int tam;
    
    public Aviao(int naviao, Data date, int tam){
        passageiros = new boolean[tam];
        this.naviao = naviao;
        this.date = date;
        this.tam = tam;
    }
    
    public int proximoLivre(){
        int i=0;
        
        for(; i < passageiros.length; i++){
            if(!passageiros[i]) {
                return i;
            }
        }
      return 0; // Provisório.
    }
    
    public boolean verifica(int param){
        if(passageiros[param]){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean ocupa(int n){
        if(n == tam) {
            return false;
        }
        if(passageiros[n]) {
            return false;
        } else {
            passageiros[n] = true;
            return true;
        }
        
    }
    
    public int vagas(){
        int cont=0;
        for(boolean t: passageiros){
            if(t) {
                cont++;
            }
        }
        return tam-cont;
    }
    
    public int getNumeroDoVoo(){
        return naviao;
    }
    
    public Data getData(){
        return date;
    }
    
    
}
    
    

