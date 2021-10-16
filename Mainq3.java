package  q3

public class Main {

 public static void main(String[] args) {

        Aviao Gou = new Aviao(10, 900);
        int alt = Gou.getAltitude();
        int vel = Gou.getVelocidade();
        System.out.printf("O avião está a %d Km\n" + "com uma velocidade de %d Km/h.", alt, vel);
        
       Gou.changeAltitude(-45);
       Gou.changeVelocidade(-10);
        alt = Gou.getAltitude();
        vel = Gou.getVelocidade();
        System.out.printf("O avião está a %d Km\n" + "com uma velocidade de %d Km/h.", alt, vel);
    }
    
}
