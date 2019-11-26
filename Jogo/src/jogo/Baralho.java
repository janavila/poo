package jogo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class Baralho {
    
    private Carta[] cards;
    private int nCartas;
    
    public Baralho(){
        this.cards = new Carta[32]; // Cria as 32 cartas
        this.nCartas = 32; // Diz o tamanho
    }
    
    
    public void abreArquivo(){
        String nome,indice,tipo; // pega os dados
        int decomposicao,ataque; // pega os dados
        boolean reciclavel; // pega os dados
    //    int nAtributos = 6; // numero de atributos
        int addCard=0; // para adicionar as cartas.
        
        
    try{
        BufferedReader buffer = new BufferedReader(new FileReader("cartas"));
        String linha = "";
        try{
            while(linha != null){ // para cada linha.
            linha = buffer.readLine(); // pega a linha.
            String[] aux = linha.split(";");
            nome = aux[0];
            indice = aux[1];
            tipo = aux[2];
            decomposicao = Integer.parseInt(aux[3]); // Transforma string para inteiro.
            ataque = Integer.parseInt(aux[4]); // Transforma string para inteiro.
            reciclavel = Boolean.getBoolean(aux[5]); // Transforma string para boolean.
            //System.out.println(nome + indice + tipo + decomposicao + ataque + reciclavel + aux.length);
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
    
    
    public void imprimeCards(){
        //for(Carta a: cards){
            System.out.println(Arrays.toString(cards));
        }
    }
 
