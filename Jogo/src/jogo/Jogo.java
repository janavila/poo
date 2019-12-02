package jogo;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Jogo {
    
    private Baralho baralhoPrincipal; // baralho principal do jogo.
    private Jogador[] jogadores;
    private int nJogadores;
    
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
        int cartasBaralho,jogada,play;
        cartasBaralho = baralhoPrincipal.getCartas(); // pega o número de cartas.
        baralhoPrincipal.embaralhaCards(); // embaralha as cartas.
        System.out.println(cartasBaralho); // mostra em quantas as cartas foram divididas.
        boolean flag = true;
        
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
        
        
        do{
        jogada = jogadores[0].escolheAtributo();
        
        switch(jogada){
            case 1:
                break; // tipo
            case 2: break; // decomposição
            case 3: break; // reciclável
            case 4: break; // ataque
            default: System.out.println("Opção invalida");
        }
        }while(flag);
}
    
    
    public void terminaJogo(){
        System.exit(0);
    }
    
     public static void main(String[] args) {
        Jogo game = new Jogo(2);
        
        game.iniciaJogo();
        
}
    
}
