public interface Movable {
    /**
     * Direction for car
     */
    enum Direction {
        NORTH, EAST, SOUTH, WEST
    }

    void move();
    void turnLeft();
    void turnRight();
}