package q4;

public class Main {

    public static void main(String[] args) {
        Produto pelucia = new Produto("shrek", 5599, 34);
        System.out.printf("Produto: %s\n Preço: %f\n", pelucia.getNome(),
        pelucia.getPreco());
       pelucia.comprar(3);
        System.out.println("Quantidade em estoque após a compra: " + pelucia.getquantidade());
        pelucia.comprar(5);
        System.out.println("Quantidade em estoque após a compra: " + pelucia.getquantidade());
        pelucia.comprar(10);
        System.out.println("Quantidade em estoque (pós compra): " + pelucia.getquantidade());            
    }
    
}
