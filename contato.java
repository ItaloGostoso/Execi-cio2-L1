package q;
import java.util.LinkedList;


public class Contato {
    private String Nome;
    private String Numero;
    private LinkedList <String> msg = new LinkedList<>();
    
    public Contato(String nome, String numero){
        this.nome = nome;
        this.number = number;
    }
    public void enviar(String mg){
        System.out.println("Enviando: "+mg+"");
        System.out.println("Enviado");
    }
    public void receber(){
        System.out.println("novas mensagens" +);
        this.newMsgms.add("Nova mensagem!!");
    }

    public String getNome() {
        return Nome;
    }

    public String getNumero() {
        return Numero;
    }

    public LinkedList<String> getmsg() {
        LinkedList<String> reset;
        reset = (LinkedList) msg.clone();
        msg.Remove(msg);
        return reset;
    }
    
}
