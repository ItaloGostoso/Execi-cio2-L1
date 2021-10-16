package q4;

public class Post {

    public static void main(String[] args) {
        
        Post inst = new Post("Vida cada vez pior", "https://instagram.com/");
        for (int i =0; i<3; i++){
            inst.curtir();
        }
    
        System.out.println("Numero de curtidas: "+inst.numeroCurtidas);
        for (int i=0; i<2; i++){
            inst.compartilhar();
        }
        System.out.println("Numero de compartilhamentos: "+inst.numeroCompartilhamentos);
    }
    
}
