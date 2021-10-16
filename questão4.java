public class Produto {

    private int quantidade; private String nome; private Double preco;

    public Produto(String nome, int quantidade, double preco){

        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void Comprar um  Produto(int quantidade){
        if((this.quantidade-quantidade) >= 0) {
            this.quantidade = quantidade;
        }else{
            this.quantidade = 0;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
}
