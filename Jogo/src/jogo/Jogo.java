package jogo;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Jogo {
    
    public Jogo(){} // Método vazio por enquanto.
    
    public void iniciaJogo(){
        Scanner scan;
        int escolha;
        boolean flag = true;
        
        while(flag){ 
            try{
                System.out.println("Você deseja jogar PvP ou PvB?\n1 - PvP\n2 - PvB");
                scan = new Scanner(System.in);
                escolha = scan.nextInt();
                flag = false;
            }
            catch(InputMismatchException e){
                System.out.println("Opção inválida, digite novamente");
            }
        }
        
       // if(escolha == 1){
            //iniciaPvP();
            
        //}
        //else;
    }
    
    
    // método separa cartas.(manda para o jogador) -> dentro da função inicia jogo.
    // método distribui cartas.
    // verifica atributo.
    
    public void terminaJogo(){
        System.exit(0);
    }
    
    
    public static void main(String[] args) {
        Baralho gameBaralho = new Baralho();
        int cartasBaralho,cartasJogador;
        //Jogador [] jogadores;
        
        Jogador j = new Jogador(16);
        gameBaralho.abreArquivo();
        gameBaralho.embaralhaCards();
        cartasBaralho = gameBaralho.getCartas();
        //cartasJogador = 
        


        int t = j.escolheAtributo();
        
        
}
    
}
