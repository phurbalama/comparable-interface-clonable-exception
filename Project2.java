import java.util.Arrays;
public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Circle c1 = new Circle();
			Circle c2 = new Circle(7);
			Circle c3 = new Circle();
			Circle c4 = new Circle(5);
			Circle c5 = new Circle(2);
			
			
			
			
			
			try {
				c1 = new Circle(-1);
		 
		}

			catch(IllegalArgumentException e)  
			{  
			e.printStackTrace();
            }
			
			try {
				c3 = (Circle) c2.clone();
			}
			catch(CloneNotSupportedException e)
			{
				e.printStackTrace();
			}
			 
				System.out.println(c1.toString());
				System.out.println("Circle 2 : "+ c2.toString());
				System.out.println("Circle 3 cloned Circle 2 : "+ c3.toString());
				System.out.println("Circle 2 comparing with Circle 4 :" + c2.compareTo(c4));
				
				System.out.println("------------Array Sort for Circle---------------------");
				Circle circle[] = {c1,c2,c3,c4,c5};
			Arrays.sort(circle);
			for(Circle c: circle) {
		        System.out.println(c.toString());
		    }
			
	}
}
