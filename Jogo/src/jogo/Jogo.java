package jogo;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Jogo {
    
    private Baralho baralhoPrincipal; // baralho principal do jogo.
    private Jogador[] jogadores;
    private final int nJogadores;
    
    public Jogo(int nJogadores){
        this.baralhoPrincipal = new Baralho(); // baralho do jogo.
        this.jogadores = new Jogador[nJogadores]; // para dois jogadores.
        this.nJogadores = nJogadores;
    }
    
    public void iniciaJogo(){
        Scanner scan;
        int escolha;
        boolean flag = true;
        baralhoPrincipal.abreArquivo();
        
        System.out.println("------BEM VINDO AO SUPER TRUNFO DA RECICLAGEM------");
        
        while(flag){ // Só para qual opção o usuário vai selecionar.
            try{
                
                System.out.println("Você deseja jogar PvP ou PvB?\n1 - PvP\n2 - PvB");
                scan = new Scanner(System.in);
                escolha = scan.nextInt();
                flag = false;
                if(escolha == 1) iniciaPvP();
                //else iniciaPvB();
            }
            catch(InputMismatchException e){
                System.out.println("Opção inválida, digite novamente");
            }
        }
        
        
    }
    
    public void iniciaPvP(){
        int cartasBaralho,jogada,play=0;
        cartasBaralho = baralhoPrincipal.getCartas(); // pega o número de cartas.
        baralhoPrincipal.embaralhaCards(); // embaralha as cartas.
        //System.out.println(cartasBaralho); // mostra em quantas as cartas foram divididas.
        ArrayList<Carta> pilha = new ArrayList<>();
        
        jogadores[0] = new Jogador(cartasBaralho/nJogadores); // Cria o jogador 1.
        jogadores[1] = new Jogador(cartasBaralho/nJogadores); // Cria o jogador 2. 
        
        try{
        for(int i = 0; i< cartasBaralho; i += 2){ // adiciona as cartas nos montes
            jogadores[0].adicionaMonte(baralhoPrincipal.retornaCarta(i));
            jogadores[1].adicionaMonte(baralhoPrincipal.retornaCarta(i+1));
        }
        }
        catch(NullPointerException e){
                System.out.println("Não foi possível adicionar as cartas.");
        }
        
        //Jogador aux; // auxiliar que vai decidir quem vai jogar.
        
        
        do{
        System.out.println("Jogador "+(play+1));
        jogada = jogadores[play].escolheAtributo(); // parei aqui.
        pilha.add(jogadores[0].getCard());
        pilha.add(jogadores[1].getCard());
        
        switch(jogada){
            case 1:         // // tipo
                break; 
                
            case 2:                 // // decomposição
                if(pilha.get(0).getDecomposicao() < pilha.get(1).getDecomposicao()){
                    System.out.println("Jogador 1 Ganhou");
                    jogadores[0].adicionaMonte(pilha);
                    play = 0;
                    
                } else{
                    System.out.println("Jogador 2 Ganhou");
                    jogadores[1].adicionaMonte(pilha);
                    play = 1;
                }
                
                    System.out.println(jogadores[0].numCartas());
                    System.out.println(jogadores[1].numCartas());    
                break;
            
            
            case 3:         // // reciclável
                if(pilha.get(0).getReciclavel() && !(pilha.get(1).getReciclavel())){
                    System.out.println("Jogador 1 Ganhou");
                    jogadores[0].adicionaMonte(pilha);
                    play = 0;
                    
                } else{
                    System.out.println("Jogador 2 Ganhou");
                    jogadores[1].adicionaMonte(pilha);
                    play = 1;
                }
                
                    System.out.println(jogadores[0].numCartas());
                    System.out.println(jogadores[1].numCartas());
                
                break;
            
            
            case 4:         // ataque
                if(pilha.get(0).getAtaque() > pilha.get(1).getAtaque()){
                    System.out.println("Jogador 1 Ganhou");
                    jogadores[0].adicionaMonte(pilha);
                    play = 0;
                    
                } else{
                    System.out.println("Jogador 2 Ganhou");
                    jogadores[1].adicionaMonte(pilha);
                    play = 1;
                }
                
                    System.out.println(jogadores[0].numCartas());
                    System.out.println(jogadores[1].numCartas());
                                    
                break;
                
            default: 
                System.out.println("Opção invalida");
                break;
        }
        
        pilha.clear();
        System.out.println(pilha);
        //System.exit(0);
        
    }while((jogadores[0].numCartas() != 0 && jogadores[1].numCartas() != 0) && jogada != 0);
}
    
    
    public void terminaJogo(){
        System.exit(0);
    }
    
     public static void main(String[] args) {
        Jogo game = new Jogo(2);
        
        game.iniciaJogo();
        
}
    
}
