import java.util.Arrays;
import java.util.Comparator;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ClosestPairOfPoints {
    private static double distance(Point p1, Point p2) {
        int dx = p1.x - p2.x;
        int dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    private static double closestPair(Point[] points, int left, int right) {
        if (left >= right) {
            return Double.MAX_VALUE;
        }

        int mid = left + (right - left) / 2;
        Point midPoint = points[mid];

        double delta = Math.min(closestPair(points, left, mid), closestPair(points, mid + 1, right));
        Point[] strip = new Point[right - left + 1];
        int j = 0;

        for (int i = left; i <= right; i++) {
            if (Math.abs(points[i].x - midPoint.x) < delta) {
                strip[j] = points[i];
                j++;
            }
        }

        Arrays.sort(strip, 0, j, Comparator.comparingInt(o -> o.y));

        for (int i = 0; i < j; i++) {
            for (int k = i + 1; k < j && strip[k].y - strip[i].y < delta; k++) {
                double dist = distance(strip[i], strip[k]);
                delta = Math.min(delta, dist);
            }
        }

        return delta;
    }

    public static double closestPair(Point[] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o.x));
        return closestPair(points, 0, points.length - 1);
    }

    public static void main(String[] args) {
        Point[] points = {
            new Point(2, 3),
            new Point(12, 30),
            new Point(40, 50),
            new Point(5, 1),
            new Point(12, 10),
            new Point(3, 4)
        };

        double closestDistance = closestPair(points);
        System.out.println("Closest Pair Distance: " + closestDistance);
    }
}
