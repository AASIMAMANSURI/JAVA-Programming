package graphic;

class Circle extends Two_Dimensional{

  double radius ;

  Circle(double s)
  {
      this.radius = s;
  }
  

  public Circle() {
  }


  void print()
  {
    System.out.println("Two dymentional shape : Circle " );
  }

  public double getRadius() {
      return radius;
  }
  
  public void setRadius(double radius) {
      this.radius = radius;
  }

  @Override
  void area()
  {
    // Circle c = new Circle();
    double area_c = 2 *3.14 *this.getRadius() ;
    // double area_c = 2 *3.14 * radius ;
    System.out.print("Area of Square is : " + area_c);
  }

}