import java.awt.*;

/**
 * @author SOME
 * Subclass of Car. Represents a car of model Saab95
 */
public class Saab95 extends Car {

    private boolean turboOn;

    /**
     * Constructor for Saab95 class
     */
    public Saab95(){
        super(2, 125, Color.red, "Saab95");
	    turboOn = false;
    }

    /**
     * Turns on turbo (sets turboOn to true)
     */
    public void setTurboOn(){
	    turboOn = true;
    }

    /**
     * Turns off turbo (sets turboOn to false)
     */
    public void setTurboOff(){
	    turboOn = false;
    }

    /**
     * @return The speed factor (factor the speed is changed by)
     */
    private double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    @Override
    protected void incrementSpeed(double amount) { setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount); }

    @Override
    protected void decrementSpeed(double amount){ setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount); }
}