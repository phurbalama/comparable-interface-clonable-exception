public class Circle extends GeometricObject implements Comparable<Circle>, Cloneable  {
  private double radius;

  public Circle() {
  }

  public Circle(double radius) {
	  if(radius < 0 )
	  {
		  throw new IllegalArgumentException("\"My exception: radius must be greater than 0.");
	  }
    this.radius = radius;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override /** Return area */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }

  @Override /** Return perimeter */
  public double getPerimeter() {
	    return 2 * radius * Math.PI;
	  }

  /* Print the circle info */
  public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() +
      " and the radius is " + radius);
  }

  @Override
  public String toString() {
    return super.toString() + " and the radius is " + radius;
  }
  @Override
  public int compareTo(Circle o)
  {
	  if(this.radius == o.radius)
	  {
		  return 0;
	  }
	  else if(this.radius > o.radius) {
		  return 1;
	  }
	  else {
	  return -1;
	  }
  }
  
  public Object clone()throws CloneNotSupportedException{  
		return (Circle)super.clone();  
	   }

  
	
}