package jogo;

public class Carta {
    
    private final String nome;
    private final String indice;
    private final String tipo;
    private final int decomposicao;
    private final boolean reciclavel;
    private final int ataque;
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
