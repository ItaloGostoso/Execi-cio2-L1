package q3;

public class Aviao {
    private int Altitude = 10;
    private int Velocidade = 900;

    
    public Aviao(int altitude, int velocidade){
        this.Altitude = alt;
        this.Velocidade = vel;
    }
    public int getAltitude() {
        return alt;
    }

    public void changeAltitude(int XX) {
        this.altitude += XX;
    }

    public int getVelocidade() {
        return vel;
    }

    public void changeVelocidade(int XX) {
        this.velocidade += XX;
    }

}
