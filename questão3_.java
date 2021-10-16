public class Aviao {

    public static void main(String[] args){

        Aviao azul = new Aviao(900, 10);

        System.out.println("\nVelocidade: "+azul.getVelocidade()+" Km/h");
        System.out.println("Altitude: "+azul.getAltitude()+" Km\n");

        azul.reduzirAltitude(1);
        azul.reduzirVelocidade(100);

        System.out.println("\nVelocidade: "+azul.getVelocidade()+" Km/h");
        System.out.println("Altitude: "+azul.getAltitude()+" Km\n");
    }
}
