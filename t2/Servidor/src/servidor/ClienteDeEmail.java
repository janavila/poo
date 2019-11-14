package servidor;

public class ClienteDeEmail {
    private ServidorDeEmail server;
    private String usuario;
    
    public ClienteDeEmail(ServidorDeEmail server, String usuario){
        this.server = server;
        this.usuario = usuario;
    }
    
    public EMail proximoEmail(String usuario){    
        return server.proximoEmail(usuario);
}
 
    public void imprimirProximoEmail(){
        EMail aux;
        aux = server.proximoEmail(usuario);
        aux.imprimir();
    }
    
    public void enviar(String destinatario, String mensagem){
        EMail aux;
        aux = new EMail(usuario,destinatario,mensagem);
        server.enviar(aux);        
    }

}
