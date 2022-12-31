public class Calculation implements Runnable {
    public double phi = 3.14;
    public double side, area, radius;

    public void setSquare(double length)  {
      if (length >= 1){
        this.side = length;
        this.area = length * length;
      } else {
        throw new IllegalArgumentException("Side cannot 0");
      }
    }

    public double getSquare() {
        return area;
      }

    public void setCircle(double r)  {
        this.radius = r;
        this.area = phi * r * r;
      }

      public double getCircle() {
        return area;
      }

      public void setTrapezoid(double a, double b, double t)  {
       this.area = 0.5 * (t * (a + b));
      }

      public double getTrapezoid() {
        return area;
      }

    @Override
    public void run() {
        System.out.println();
        System.out.println("Program will start!");
        for (int i = 3; i >= 1; i--) {
            System.out.println("Starting in " + i);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}