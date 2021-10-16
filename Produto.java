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

    public String getnm() {
        return nm;
    }

    public double getprec() {
        return prec;
    }

    public int getqut() {
        return qut;
    }

}
