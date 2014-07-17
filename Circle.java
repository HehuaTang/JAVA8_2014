public class Circle {
	
 private float r;
 private final static double PI = Math.PI;
 
 Circle()
 {
	 this.r = 1;
	 
 }
 Circle(float radius)
 {
	 this.r = radius;
	 
 }
 private double getPerimeter()
 {
	 
	 return PI*2*r;
 }
 private double getArea()
 {
	 return PI*r*r; 
 }
 private double getRadius()
 {
	 return r; 
 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle = new Circle(3);
		System.out.println("Radius is "+myCircle.getRadius()+" Perimeter is "+myCircle.getPerimeter()+" Area is "+myCircle.getArea());

	}

}
