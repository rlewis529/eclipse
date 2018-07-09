
//Create an abstract class
abstract class TwoDShape {
	private double width;
	private double height;
	private String name;
	
	//default constructor
	TwoDShape() {
		width = height = 0.0;
		name = "none";
	}
	
	//parameterized constructor
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}
	
	//construct object with equal width and height
	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}
	
	//construct an object from another object
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	
	//Accessor methods for width and height
	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) {width = w; }
	void setHeight(double h) {height = h; }
	
	String getName() { return name; }
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height ); 
	}
	
	//Now, area() is abstract
	abstract double area();
}


//A subclass of TwoDShape for triangles
class Triangle extends TwoDShape {
	private String style;
	
	//a Default constructor
	Triangle() {
		super();   // 
		style = "none";
	}
	
	//Constructor for Triangle.
	Triangle(String s, double w, double h) {
		super (w, h, "triangle");
		style= s;
	}
	
	Triangle(double x) {
		super(x, "triangle"); 
		style = "filled";
	}
	
	Triangle(Triangle ob) {
		super(ob); 
		style = ob.style;
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style) ;
	}
}
	
class Rectangle extends TwoDShape {
	Rectangle() {
		super();
	}
	
	Rectangle(double w, double h) {
		super(w,h, "rectangle");
	}
	
	Rectangle(double x) {
		super(x, "rectangle" ); 
	}
	
	Rectangle(Rectangle ob) {
		super(ob); 
	}
	
	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
	
	double area() {
		return getWidth() * getHeight();
	}
}
	
class AbsShape {
	public static void main ( String args[]) {
		TwoDShape shapes[] = new TwoDShape[4];
		
		shapes[0] = new Triangle ("outlined", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10, 4);
		shapes[3] = new Triangle(7.0);
		
		for (int i = 0; i < shapes.length; i++ ) {
			System.out.println("object is " + shapes[i].getName());
			System.out.println("Area is " + shapes[i].area());
			System.out.println();
		}
	}
}
