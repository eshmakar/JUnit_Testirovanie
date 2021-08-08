public class Vector2D {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double length() {
        return Math.sqrt(x * x * y * y);
    }

    public int result(int a, int b){
        if (b == 0 ) throw new ArithmeticException("Can't divide by zero");
        return a/b;
    }

    public int timeToSleep() throws InterruptedException {
        Thread.sleep(500);
        return 0;
    }
}
