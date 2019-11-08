import java.awt.*;

/**
 * @author SOME
 * Subclass of Car. Represents a car of model Volvo240
 */
public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;

    /**
     * Constructor for Volvo240 class
     */
    public Volvo240(){
        super(4, 100, Color.black, "Volvo240");
    }

    /**
     * @return The speed factor (factor the speed is changed by)
     */
    private double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    @Override
    protected void incrementSpeed(double amount) { setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower())); }

    @Override
    protected void decrementSpeed(double amount) { setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount, 0));}
}