package net.awaken.core.linq.constant;

/**
 * Sorting Direction: ascending or descending.
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018(1.5)
 */
public enum Direction {
    ascending(0),
    descending(1);

    private int direction;

    Direction(int direction) {
        this.direction = direction;
    }

    public int val() {
        return this.direction;
    }

    public boolean isSame(Direction direction) {
        return this.direction == direction.val();
    }
}
