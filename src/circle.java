public class circle {
	private double pi = 3.1415; // I think this is accurate enough
	private double radius;
	
	public circle (double r) {
		if (r <= 0) {
			throw new RuntimeException("There is no figure with such parameters.");
		}
		this.radius = r;
	}
	
	public double getArea() {
		return radius * radius * pi;
	}
	public double getPerimeter() {
		return 2 * pi * radius;
	}
}
