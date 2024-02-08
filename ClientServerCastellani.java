/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package client.server.castellani;
import client.server;
import java.io;
import java.util.;
import java.net.;

public class ServerStr {
    ServerSocket server = null;
    Socket client = null;
    String stringaRicevuta = null;
    String stringaModificata = null;
    BufferReader inDalClientt;
    DataOutputStream out VersoClient;
    
    public socket attendi (){
    try{
        System.out.println("server partito in esecuzione");
        server = new ServerSocket(6789);
        client = server.accept();
        server.close();
        inDalClient = new BufferReader(new InputStreamReader(client.getInputStream()));
        outVersoClient = new DataOutputStream(client.getOutputStream());
    }
    
    catch (Excepion e){
        System.out.printl(e.getMessage());
        System.out.printl("errore durante l'istanza");
    }
    return client;
    }

    
    public void comunica(){
        System.out.println("3 benvenuto cliet,scrivi frase trasfotmo in maiuscolo");
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
