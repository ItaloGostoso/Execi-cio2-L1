package q4;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String nm, double preco, int qut){
        this.nome = nm;
        this.preco = prec;
        this.quantidade = qut;
        
    }
    public void comprar(int p){
        if (p <= qut){
            this.qut -= p;
        }
        else{
            System.out.printf("Compra não efetuada.\n" + "Item indisponível. Quantidade" + " estoque: %d.\n", this.qut);
        }
    }

    public String getnome() {
        return nm;
    }

    public double getpreco() {
        return prec;
    }

    public int getquantidade() {
        return qut;
    }

}
