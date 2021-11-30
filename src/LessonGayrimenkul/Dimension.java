package LessonGayrimenkul;

public class Dimension {
	private double length;
	private double width;
	
	public Dimension(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getarea() {
		return width * length;
	}
	
	@Override
	public String toString() {
		return "Dimension [length=" + length + ", width=" + width + "]";
	}
	
}
