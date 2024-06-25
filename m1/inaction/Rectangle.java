package com.codio.figures;

public class Rectangle implements Figure {
  private final double width;
  private final double height;

  public Rectangle(final double width, final double height) {
    if (width < 0) {
      throw new IllegalArgumentException("Invalid width");
    }
    if (height < 0) {
      throw new IllegalArgumentException("Invalid height");
    }
    this.width = width;
    this.height = height;
  }

  public double getPerimeter() {
    return 2 * width + 2 * height;
  }
}