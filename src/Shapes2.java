
class TwoDShape 
{
	private double width; 
	private double height;
	
	//parameterized constructor
	TwoDShape(double w, double h) 
	{
		width = w;
		height = h;
	}
	
	
	//Accessor methods to get and set private variables
	double getWidth() { return width; }
	double getHeight() { return height; } 
	void setWidth(double w) { width = w; }
	void setHeight(double h) {height = h; }
	
	void showDim()
	{
		System.out.println("Width and height are " + width + " and " + height + ".");
	}
	
}

class Triangle extends TwoDShape
{
	private String style;
	
	//Constructor
	Triangle(String s, double w, double h)
	{
		//setWidth(w);
		// setHeight(h);
		super(w,h);
		style = s;
	}
	
	
	
	double area()
	{
		return getWidth() * getHeight() * 0.5;
	}
	
	void showStyle() 
	{
		System.out.println("Triangle is " + style);
	}
	
}

class Shapes2
{
	public static void main(String args[])
	{
		//Triangle t1 = new Triangle();
		//Triangle t2 = new Triangle();
	
		// t1.setWidth(4.0);
		// t1.setHeight(4.0);
		// t1.style = "filled";
		
		// t2.setWidth(8.0);
		// t2.setHeight(12.0);
		// t2.style = "outlined";
		
		Triangle t1 = new Triangle("filled", 4.0, 4.0);
		Triangle t2 = new Triangle("outlined", 8.0, 12.0);
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
		
	}
}

