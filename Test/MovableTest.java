import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.List;

public class MovableTest {

    Volvo240 volvo = new Volvo240();
    Saab95 saab = new Saab95();

    @Test
    public void testTurnLeft() {

        volvo.setCurrentDirection(Movable.Direction.NORTH);
        volvo.turnLeft();
        assertEquals(Movable.Direction.WEST, volvo.getCurrentDirection());
        volvo.turnLeft();
        assertEquals(Movable.Direction.SOUTH, volvo.getCurrentDirection());
        volvo.turnLeft();
        assertEquals(Movable.Direction.EAST, volvo.getCurrentDirection());
        volvo.turnLeft();
        assertEquals(Movable.Direction.NORTH, volvo.getCurrentDirection());

        saab.setCurrentDirection(Movable.Direction.NORTH);
        saab.turnLeft();
        assertEquals(Movable.Direction.WEST, saab.getCurrentDirection());
        saab.turnLeft();
        assertEquals(Movable.Direction.SOUTH, saab.getCurrentDirection());
        saab.turnLeft();
        assertEquals(Movable.Direction.EAST, saab.getCurrentDirection());
        saab.turnLeft();
        assertEquals(Movable.Direction.NORTH, saab.getCurrentDirection());
    }

    @Test
    public void testTurnRight() {
        volvo.setCurrentDirection(Movable.Direction.NORTH);
        volvo.turnRight();
        assertEquals(Movable.Direction.EAST, volvo.getCurrentDirection());
        volvo.turnRight();
        assertEquals(Movable.Direction.SOUTH, volvo.getCurrentDirection());
        volvo.turnRight();
        assertEquals(Movable.Direction.WEST, volvo.getCurrentDirection());
        volvo.turnRight();
        assertEquals(Movable.Direction.NORTH, volvo.getCurrentDirection());

        saab.setCurrentDirection(Movable.Direction.NORTH);
        saab.turnRight();
        assertEquals(Movable.Direction.EAST, saab.getCurrentDirection());
        saab.turnRight();
        assertEquals(Movable.Direction.SOUTH, saab.getCurrentDirection());
        saab.turnRight();
        assertEquals(Movable.Direction.WEST, saab.getCurrentDirection());
        saab.turnRight();
        assertEquals(Movable.Direction.NORTH, saab.getCurrentDirection());
    }

    @Test
    public void testMove() {
        volvo.setCurrentDirection(Movable.Direction.NORTH);
        volvo.setCurrentSpeed(5);
        volvo.move();
        assertEquals(5, volvo.y, 0.001);

        saab.setCurrentDirection(Movable.Direction.EAST);
        saab.setCurrentSpeed(5);
        saab.move();
        assertEquals(5, saab.x, 0.001);
    }

    @Test
    public void testGas() {
        volvo.setCurrentSpeed(106);
        volvo.gas(0);
        assertEquals(100, volvo.getCurrentSpeed(), 0.0001);

        volvo.setCurrentSpeed(0);
        volvo.gas(2);
        assertEquals(1.25, volvo.getCurrentSpeed(), 0.0001);

        saab.setCurrentSpeed(50);
        saab.gas(1);
        assertEquals(51.25, saab.getCurrentSpeed(), 0.0001);

        saab.setCurrentSpeed(-50);
        saab.gas(1);
        assertEquals(1.25, saab.getCurrentSpeed(), 0.0001);
    }

    @Test
    public void testBrake() {
        volvo.setCurrentSpeed(100);
        volvo.brake(1);
        assertEquals(98.75, volvo.getCurrentSpeed(), 0.0001);

        saab.setCurrentSpeed(100);
        saab.brake(2);
        assertEquals(98.75, saab.getCurrentSpeed(), 0.0001);

        saab.setTurboOn();
        saab.setCurrentSpeed(100);
        saab.brake(1);
        assertEquals(98.375, saab.getCurrentSpeed(), 0.0001);

        saab.setTurboOff();
        saab.setCurrentSpeed(100);
        saab.brake(1);
        assertEquals(98.75, saab.getCurrentSpeed(), 0.0001);
    }
}