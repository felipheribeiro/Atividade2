public class Post {

    private String texto, link; private int numeroCurtidas, numeroCompartilhamentos;

    public Post(String texto, String link){

        this.texto = texto;
        this.link = link;
    }

    public void curtir(){

        this.numeroCurtidas = 1;
    }

    public void compartilhar(){

        this.numeroCompartilhamentos = 1;
    }

    public int getNumeroCurtidas(){
        return this.numeroCurtidas;
    }

    public int getNumeroCompartilhamentos(){
        return this.numeroCompartilhamentos;
    }
}
