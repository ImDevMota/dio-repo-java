package stu.mota.metodos;
public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv(); 

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();



        System.out.println("A TV esta ligada ? " +smartTv.ligada);
        System.out.println("Canal Atual ? " +smartTv.canal);
        System.out.println("Volume Atual ? " +smartTv.volume);

        smartTv.mudarCanal(15);
        System.out.println("Canal Atual ? " +smartTv.canal);
        
        smartTv.ligar ();
        System.out.println("A TV esta ligada agora? " +smartTv.ligada);

        smartTv.desligar ();
        System.out.println("A TV esta ligada ? " +smartTv.ligada);

    }
}
