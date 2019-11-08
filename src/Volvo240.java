import java.awt.*;

public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;
    
    public Volvo240(){
        super(4, 100, Color.black, "Volvo240");
    }
    
    private double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    private void incrementSpeed(double amount) { setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower())); }

    private void decrementSpeed(double amount) { setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount, 0));}

    // TODO fix this method according to lab pm
    public void gas(double amount) {
        if(amount < 0 || amount > 1) {
            return;
        }
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}