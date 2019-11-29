package jogo;

public class Carta {
    
    private String nome;
    private String indice;
    private String tipo;
    private int decomposicao;
    private boolean reciclavel;
    private int ataque;
//  private String mensagem;
    
    public Carta(String n,String i,String t,int d,boolean r,int a){
        this.nome = n;
        this.indice = i;
        this.tipo = t;
        this.decomposicao = d;
        this.reciclavel= r;
        this.ataque = a;
    }
    
    @Override
    public String toString(){
        return "\nNome: "+nome+"\nIndice: "+indice+"\nTipo: "+tipo+"\nDecomposição: "+decomposicao+
                "\nReciclavel: "+reciclavel+"\nAtaque: "+ataque;
    }
}
