package graphic;

class Square extends Two_Dimensional{
    double side;

    Square(double s)
    {
        this.side = s;
    }
    
    public Square() {
    }

    @Override
  void print()
  {
    System.out.println("Two dymentional shape : Square " );
  }

  public void setSide(double side) {
      this.side = side;
  }

  public double getSide() {
      return side;
  }

  @Override
  void area()
  {
    // Square x = new Square();
    double s = this.getSide(); 
    double area_s = s * s ;
    System.out.print("Area of Square is : " + area_s);
  }

}