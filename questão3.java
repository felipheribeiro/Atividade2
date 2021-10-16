public class Aviao {

    private int velocidade, altitude;

    public Aviao(int velocidade, int altitude){

        this.velocidade = velocidade;
        this.altitude = altitude;
    }

    public int getVelocidade(){
        return this.velocidade;
    }

    public int getAltitude(){
        return this.altitude;
    }

    public void aumentarVelocidade(int aceleracao){
        this.velocidade = +aceleracao;
    }
    public void diminuirVelocidade(int aceleracao){
        this.velocidade = -aceleracao;
    }

    public void aumentarAltitude (int altitude){
        this.altitude = -altitude;
    }
    public void diminuirAltitude (int altitude){
        this.altitude = -altitude;
    }
}
