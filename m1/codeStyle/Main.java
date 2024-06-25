interface Figure {
    double getPerimeter();
  }
  
  class Rectangle implements Figure {
    private final double width;
    private final double height;
  
    public Rectangle(final double width, final double height) {
      this.width = width;
      this.height = height;
    }
  
    public double getPerimeter() {
      return 2 * width + 2 * height;
    }
  }
  
  class Triangle implements Figure {
    private final double sideA;
    private final double sideB;
    private final double sideC;
  
    public Triangle(final double sideA, final double sideB, final double sideC) {
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
    }
  
    public double getPerimeter() {
      return sideA + sideB + sideC;
    }
  }
  
  public class Main {
    public static void main(final String[] args) {
      final Figure rectangle = new Rectangle(10, 15);
      System.out.println("Rectangle perimeter = " + rectangle.getPerimeter());
  
      final Figure triangle = new Triangle(10, 20, 30);
      System.out.println("Triangle perimeter = " + triangle.getPerimeter());
    }
  }