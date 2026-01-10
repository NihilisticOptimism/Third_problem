
public class main {
	public static void main(String[] args) {
		rectangle rec = new rectangle(10, 20);
		circle cir = new circle(15);
		triangle tri = new triangle(3, 4, 5);
		System.out.println("Perimeter first, Area second");
        System.out.println("\n");
		System.out.println("Rectangle:");
		System.out.println(rec.getPerimeter());
		System.out.println(rec.getArea());

        System.out.println("\n");
		System.out.println("Circle:");
		System.out.println(cir.getPerimeter());
		System.out.println(cir.getArea());

        System.out.println("\n");
		System.out.println("Triangle:");
		System.out.println(tri.getPerimeter());
		System.out.println(tri.getArea());

	}
}