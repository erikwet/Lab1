import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MovableTest {

    Volvo240 volvo = new Volvo240();
    Saab95 saab = new Saab95();

    @Test
    public void testTurn() {


        volvo.turnRight();
        assertEquals(Movable.Direction.EAST, volvo.getCurrentDirection());
        volvo.turnRight();
        assertEquals(Movable.Direction.SOUTH, volvo.getCurrentDirection());
        volvo.turnLeft();
        assertEquals(Movable.Direction.EAST, volvo.getCurrentDirection());

        saab.turnRight();
        assertEquals(Movable.Direction.EAST, saab.getCurrentDirection());
    }

    @Test
    public void testMove() {
        volvo.setCurrentDirection(Movable.Direction.NORTH);

        volvo.setCurrentSpeed(5);
        volvo.move();
        assertEquals(5, volvo.y, 0.001);
    }

    @Test
    public void testGas() {
        volvo.setCurrentSpeed(106);
        volvo.gas(0);
        assertEquals(100, volvo.getCurrentSpeed(), 0.0001);

        volvo.setCurrentSpeed(0);
        volvo.gas(2);
        assertEquals(0, volvo.getCurrentSpeed(), 0.0001);

    }

    @Test
    public void testBrake() {
        volvo.setCurrentSpeed(100);
        volvo.brake(1);
        assertEquals(98.75, volvo.getCurrentSpeed(), 0.0001);

    }
}
