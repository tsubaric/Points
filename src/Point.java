import java.util.Objects;

public class Point {
    protected double x, y;
    public Point(double x, double y) { this.x =x; this.y = y;}
    public double getX() { return x; }
    public double getY() { return y; }
    public Point getLocation() { return new Point(x,y); }
    public void setLocation(double x, double y) { this.x = x; this.y = y; }
    public void translate(double dx, double dy) { x +=dx; y += dy;}
    @Override public boolean equals(Object object) {
        if (object instanceof Point ){
            Point point = (Point)object;
            return (x == point.x) && (y == point.y);
        }
        else
            return false;
    }
    @Override public int hashCode() {
        return Objects.hash(x,y);
    }
    @Override public String toString(){
        return ("(" + x + "," + y + ")");
    }

    public static void main(String[] args) {

        /* create point p = (2,3) using keyword new */
        Point p = new Point(2,3);
        System.out.println("p=" + p);

        /* create point q using p.getLocation() */
        Point q = p.getLocation();
        //(q and p will have the same value, i.e q equals p) */
        System.out.println("q="+q);

        /* translate q up 3 and left 1 */

        //(now p and q have different values)
        q.translate(-1,3);
        System.out.println("q="+q);

        // make q refer to p
        q = p;
        //(now q and p are the same, p==q) */
        System.out.println("q="+q);
    }
}