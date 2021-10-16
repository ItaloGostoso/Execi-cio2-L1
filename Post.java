package q2;

public class Post {
   private String texto;
   private String link;
   private int numeroCurtidas;
   private int numeroCompartilhamentos;
   
   public Post(String txt, String lk){
       this.texto = txt;
       this.link = lk;
       
   }
   public void curtir() {
       this.setnumeroCurtidas(this.getnumeroCurtidas() + 1);
       
   }
   public void compartilhar(){
       this.setnumeroCompartilhamentos(this.getnumeroCompartilhamentos() + 1);
   }

    public String gettxt() {
        return txt;
    }

    public void settxt(String txt) {
        this.texto = txt;
    }

    public String getlk() {
        return lk;
    }

    public void setlk(String link) {
        this.lk = lk;
    }

    public int getnumeroCurtidas() {
        return numeroCurtidas;
    }

    public void setnumeroCurtidas(int numeroCurtidas) {
        this.numeroCurtidas = numeroCurtidas;
    }

    public int getnumeroCompartilhamentos() {
        return numeroCompartilhamentos;
    }

    public void setNumeroCompartilhamentos(int numeroCompartilhamentos) {
        this.numeroCompartilhamentos = numeroCompartilhamentos;
    }
}
