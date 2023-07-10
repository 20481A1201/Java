abstract class Shape
  {
    abstract void numberOfSides();
  }
class Trapezoid extends Shape
  {
    void numberOfSides()
    {
      System.out.println("Trapezoid contains 4 sides");
    }
  }
class Triangle extends Shape
  {
    void numberOfSides()
    {
      System.out.println("Triangle contains 3 sides");
    }
  }
class Hexagon extends Shape
  {
    void numberOfSides()
    {
      System.out.println("Hexagon contains 6 sides");
    }
  }
class Polymorphism
  {
    static public void main(String...args)
    {
      Shape s1;
      s1=new Trapezoid();
      s1.numberOfSides();
      s1=new Triangle();
      s1.numberOfSides();
      s1=new Hexagon();
      s1.numberOfSides(); 
    }
}
