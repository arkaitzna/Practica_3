
public class ejercicio4 {
	public static void main(String[] args) {
 

		System.out.print("Ingresa el primer ángulo: ");
        int angulo1 = 50;

        System.out.print("Ingresa el segundo ángulo: ");
        int angulo2 = 70;

        System.out.print("Ingresa el tercer ángulo: ");
        int angulo3 = 60;
        int sumaAngulos= angulo1+ angulo2+angulo3;

        if (sumaAngulos == 180) {
            System.out.println("Estos ángulos  formaran un triángulo.");
        } else {
            System.out.println("Estos ángulos no  forman un triángulo.");
        }


	}
}
