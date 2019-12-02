package jogo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Baralho {
    
    private Carta[] cards;
    private int nCartas;
    
    public Baralho(){
        this.cards = new Carta[10]; // Cria as 32 cartas
        this.nCartas = 10; // Diz o tamanho
    }
    
    
    public void abreArquivo(){
        String nome,indice,tipo; // pega os dados
        int decomposicao,ataque; // pega os dados
        boolean reciclavel; // pega os dados
        int addCard=0; // para adicionar as cartas.
        
        
    try{
        BufferedReader buffer = new BufferedReader(new FileReader("cartas"));
        String linha = "";
        try{
            while(linha != null && addCard < 32){ // para cada linha.
                linha = buffer.readLine(); // pega a linha.
                String[] aux = linha.split(";");
                nome = aux[0];
                indice = aux[1];
                tipo = aux[2];
                decomposicao = Integer.parseInt(aux[3]); // Transforma string para inteiro.
                reciclavel = aux[4].equals("true") ? true: false;// Transforma string para boolean.
                ataque = Integer.parseInt(aux[5]); // Transforma string para inteiro.
                //System.out.println(Arrays.toString(aux) + aux.length);
                cards[addCard] = new Carta(nome,indice,tipo,decomposicao,reciclavel,ataque);
                addCard++;
            }
        }
        catch(NullPointerException e){ // Quando chega no final do arquivo.
                System.out.println("Todas as cartas foram inseridas no jogo.");
        }
    }
        
    catch(IOException e){ // Caso não tenha conseguido ler o arquivo.
            System.out.println("Erro ao abrir o arquivo.");
    }
        
        
    }
    
    public void embaralhaCards(){
        Random rand = new Random(); // cria numeros aleatórios.
        //rand.nextInt((max - min) + 1) + min;
        int indiceUm,indiceDois; // cria numeros aleatórios.
        int embaralha = rand.nextInt(200) + 100 ;
        Carta aux;
        
        for(int i=0; i < embaralha; i++){
            
            indiceUm = rand.nextInt(nCartas);
            indiceDois = rand.nextInt(nCartas);
            
            aux = cards[indiceUm];
            cards[indiceUm] = cards[indiceDois];
            cards[indiceDois] = aux;
        }
       
    }
        public int getCartas(){
            return nCartas;
        }
        
        public Carta retornaCarta(int pos){
            return cards[pos];
        }
        
}
 
