public interface Movable {
    enum Direction {
        NORTH, EAST, SOUTH, WEST
    }

    void move();
    void turnLeft();
    void turnRight();
}