public interface Movable {
    /**
     * Possible directions for car
     */
    enum Direction {
        NORTH, EAST, SOUTH, WEST
    }

    /**
     * Makes car move in current direction
     */
    void move();

    /**
     * Makes car turn left depending on current direction
     */
    void turnLeft();

    /**
     * Makes car turn right depending on current direction
     */
    void turnRight();
}