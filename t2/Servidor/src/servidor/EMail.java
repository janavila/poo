/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;


public class EMail {

private String Remetente;
private String destinatario;
private String mensagem;


public EMail(String Remetente, String destinatario, String mensagem) {
    this.Remetente = Remetente;
    this.destinatario = destinatario;
    this.mensagem = mensagem;
    
}

public String getRementente(){
    return Remetente;
}

public String getDestinatario() {
    return destinatario;
}

public String getMensagem(){
    return mensagem;
}

public void imprimir(){
    System.out.println("Remetente: "+ Remetente+"\nDestinatário: "+ destinatario+"\nTexto da Mensagem: "+mensagem+"\n------------------------\n");

}
    
}
