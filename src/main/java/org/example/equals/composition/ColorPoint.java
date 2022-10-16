package org.example.equals.composition;

import java.util.Objects;

/**
 * @author kiyota
 */
public class ColorPoint {
    private final Point point;

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    public Point asPoint(){
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColorPoint cp = (ColorPoint) o;
        return Objects.equals(point, cp.point) && color == cp.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, color);
    }
}
