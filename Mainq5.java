package q5;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Contato chato = new Contato("Andre Valzes", "(34)946769-9679");
        chato.enviar("Olá!");
        
        int Msagens = chato.getmgs().size();
        System.out.println("Mensagens não lidas: "+ Msagens);
        System.out.println();
        
        for (int i = 0; i<5; i++){
            chato.receber();
        }
        
        
        System.out.println();
        LinkedList<String> mensagens = chato.getmgs();
        Msagens = mensagens.size();
        System.out.println("Mensagens não lidas: "+ Msagens);
        System.out.println("Suas mensagens:");
        for (int i=0; i<Msagens; i++){
            System.out.println("\t"+i+") "+Mensagens.get(i));
        }
        
        System.out.println();
        mensagens = chato.getmgs();
        Msagens = mensagens.size();
        System.out.println("Mensagens não lidas: "+ Msagens);
        
    }
    
}
