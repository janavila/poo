package servidor;

public class Servidor {


    public static void main(String[] args) {
        ServidorDeEmail server = new ServidorDeEmail();
        ClienteDeEmail[] cliente = new ClienteDeEmail[5];
        
        
        cliente[0] = new ClienteDeEmail(server,"Lolo");
        cliente[1] = new ClienteDeEmail(server,"Gui");
        
        cliente[0].enviar("Gui", "Paga o Agiota");
        cliente[1].imprimirProximoEmail();
        
        
        
    }
    
}
