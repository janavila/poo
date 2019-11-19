package projaviao;

public class AviaoPremium extends Aviao{
  
    private int nassentos;
    private int vip;
    
    
    public AviaoPremium(int naviao, Data date, int nassentos, int vip){
        super(naviao,date,nassentos);
        this.nassentos = nassentos;
        this.vip = vip;
    }
    
    public int maxVagas(){
        return nassentos;
    }
    
    public int cadeirasPremium(){
        return vip;
    }
    
    public char tipo(int n){
            if(n < vip) {
                return 'P';
            } 
        return 'C';
    }
    
    
    @Override
    public int proximoLivre(){
        for(int i = vip; i< nassentos; i++){
            if(passageiros[i]) {
                return i;
            }
            }
        return -1;
        }
    
    public int proximoPremiumLivre(){
        for(int i = 0; i<vip; i++){
            if(passageiros[i]){
                return i;
            }
        }
        return -1;
    }
    
}
