public class Usuarios {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? : " + smartTv.ligada);
        System.out.println("Canal Atual ? : "+ smartTv.canal);
        System.out.println("Volume Atual ? : " + smartTv.volume);

        smartTv.desligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(23);

        System.out.println("TV está ligada? : " + smartTv.ligada);
        System.out.println("O Volume atual é : " + smartTv.volume);
        System.out.println("O Canal atual é : " + smartTv.canal);
    }
    
}
