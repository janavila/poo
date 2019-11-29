package jogo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogador {

    ArrayList<Carta> monte;
    private int nCartas;

    public Jogador(int nCartas) {
        this.nCartas = nCartas;
 
    }

    public int escolheAtributo() {
        Scanner scan;
        int atributo;

        while (true) {
            try {
                System.out.println("Diga qual atributos você deseja escolher: \n1 - Tipo\n2 - Decomposição\n3 - Reciclável\n4 - Ataque");
                scan = new Scanner(System.in);
                atributo = scan.nextInt();
                return atributo;
            } catch (InputMismatchException e) {
                System.out.println("Valor Digitado Incorreto. Digite novamente:");

            }
        }
    
    }

        public void adicionaMonte(Carta[] cartas){
            monte.addAll(Arrays.asList(cartas)); // Adiciona as cartas ao monte.
            nCartas += cartas.length; // novo número de cartas do jogador.
    }
        
        public int getCartasJogador(){
            return nCartas;
        }
}


