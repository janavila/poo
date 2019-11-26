package servidor;

import java.util.ArrayList; // Biblioteca que permite o uso do array list.

// add, remove, clear(removetudo), get(), isEmpty(), contains(), size(), indexOf

public class ServidorDeEmail {
    
    private ArrayList<EMail> lista;
    
      
public ServidorDeEmail(){
    lista = new ArrayList<>();
    
}

public int quantidadeDeEmails(String destinatario){
    int n=0;
    
    for(EMail a: lista){
        if(a.getDestinatario().equals(destinatario)){
            n++;
        }      
    }
    
    return n;   
}

public EMail proximoEmail(String destinatario){
    
    for(EMail a: lista){
        if(a.getDestinatario().equals(destinatario)){
            return a; // É possivel pois é um for each que repete a cada iteração.
        }
    }   
    return null;// Se não tiver nenhum próximo email para o destinatario. 
}
   
public void enviar(EMail correio){
    lista.add(correio);
}

}
