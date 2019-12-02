package jogo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogador {

    private ArrayList<Carta> monte;
    private int nCartas;
            
    public Jogador(int nCartas) {
        this.nCartas = nCartas;
        this.monte = new ArrayList<>(nCartas);
 
    }

    public int escolheAtributo() {
        Scanner scan;
        int atributo;

        while (true) {
            try {
                System.out.println("---------------\n"+monte.get(0)+ "\n---------------");
                System.out.println("Diga qual atributos você deseja escolher: \n1 - Tipo\n2 - Decomposição\n3 - Reciclável\n4 - Ataque");
                scan = new Scanner(System.in);
                atributo = scan.nextInt();
                return atributo;
            } catch (InputMismatchException e) {
                System.out.println("Valor Digitado Incorreto. Digite novamente:");

            }
        }
    
    }
    
    public void showCards(){
        System.out.println(monte);
    }
    
    public void adicionaMonte(Carta cards){
            monte.add(cards);
 
    }
    public void adicionaMonte(ArrayList<Carta> cards){
            for(Carta aux: cards){
                monte.add(aux);
            }
        
    }
    

    public Carta getCard(){
        System.out.println("=============================\n"+monte.get(0)); // 0 é a posição do topo.
        return monte.remove(0);
    }
    
    public int numCartas(){
        return monte.size();
    }

}



