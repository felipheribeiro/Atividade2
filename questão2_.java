public class Post {

    public static void main(String[] args){

        Post nmr1 = new Post("Flamengo é o maior time do mundo", "https://www.youtube.com/watch?v=fU0VTqvEoIM&t=37s");

         nmr1.curtir();
        nmr1.curtir();
        nmr1.curtir();

        System.out.println("\nNumero de curtidas: "+nmr1.numeroCurtidas());

        nmr1.compartilhar();
        nmr1.compartilhar();

        System.out.println("\nNumero de compartilhamentos: "+nmr1.numeroCompartilhamentos());
    }
}
