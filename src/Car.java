import java.awt.*;

public abstract class Car implements Movable {
    private final int nrDoors; // Number of doors on the car
    private final double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private final String modelName; // The car model name
    private Direction currentDirection; // Direction the car is facing
    int x; // x position of car
    int y; // y position of car

    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        this.currentDirection = Direction.NORTH;
        stopEngine();
    }

    public void move() {
        switch (getCurrentDirection()){
            case NORTH:
                y += getCurrentSpeed();
                break;
            case EAST:
                x += getCurrentSpeed();
                break;
            case SOUTH:
                y -= getCurrentSpeed();
                break;
            case WEST:
                x -= getCurrentSpeed();
                break;
        }
    }

    public void turnLeft() {
        switch (getCurrentDirection()) {
            case NORTH:
                setCurrentDirection(Direction.WEST);
                break;
            case EAST:
                setCurrentDirection(Direction.NORTH);
                break;
            case SOUTH:
                setCurrentDirection(Direction.EAST);
                break;
            case WEST:
                setCurrentDirection(Direction.SOUTH);
                break;
        }
    }

    public void turnRight() {
        switch (getCurrentDirection()) {
            case NORTH:
                setCurrentDirection(Direction.EAST);
                break;
            case EAST:
                setCurrentDirection(Direction.SOUTH);
                break;
            case SOUTH:
                setCurrentDirection(Direction.WEST);
                break;
            case WEST:
                setCurrentDirection(Direction.NORTH);
                break;
        }
    }

    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public void setCurrentSpeed(double speed) { currentSpeed = speed; }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public Direction getCurrentDirection() { return currentDirection; }

    public void setCurrentDirection(Direction currentDirection) { this.currentDirection = currentDirection; }

    public void stopEngine(){
        currentSpeed = 0;
    }
}