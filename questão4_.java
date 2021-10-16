public class Produto {

    public static void main(String[] args){

        Produto iphone = new Produto("iphone", 10, 3000,00);

        System.out.println("\nNome do produto: "+iphone.getNome());
        System.out.println("Preco: "+iphone.getPreco());

        iphone.Comprar(1);

        System.out.println("Quantidade disponível: "+iphone.getQuantidade());

        iphone.Comprar(1);

        System.out.println("Quantidade disponível: "+iphone.getQuantidade());

        iphone.Comprar(9);

        System.out.println("Quantidade disponível: "+iphone.getQuantidade());
    }
}

