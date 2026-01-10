public class rectangle {
	private float length;
	private float width;
	
	public rectangle (float l, float w) {
		if (l < 0 || w < 0) {
			throw new RuntimeException("There is no figure with such parameters.");
		}
		this.length = l;
		this.width = w;
	}
	
	public float getArea() {
		return length * width;
	}
	public float getPerimeter() {
		return 2*(length + width);
	}
}