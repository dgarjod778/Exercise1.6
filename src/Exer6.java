
public class Exer6 {
	public static void main(String[] args) {

		System.out.println("--------------------------- \n" + "Ejercicio 6" + " \n---------------------------");
		final int MAX = 1000;
		int a = 3, b = 4, i;
		double x;
		char c;
		String s;

		System.out.println("a) " + (i = (990 - MAX) / a));
		System.out.println("c) " + (i = a % (MAX - 990)));
		System.out.println("d) " + (i = (MAX - 990) % a));
		System.out.println("f) " + (x = a / b));
		System.out.println("h) " + (i = a / b));
		System.out.println("i) " + (i = ++a) + ". Resultado de a: " + a);
		System.out.println("j) " + (i = a++) + ". Resultado de a: " + a);
		System.out.println("l) " + (c = '”'));
		System.out.println("n) " + (s = "'"));
		System.out.println("p) " + (c = '\u0041'));
		System.out.println("q) " + (c = 65) + "\n");

		System.out.println("Las unidades que no se muestran son porque:");
		System.out.println("b) ==> i = b / 0 || No se puede dividir por cero.");
		System.out.println(
				"e) ==> i = 3.34 * a || El tipo integer no acepta y no puede guardar decimales a menos que se cambie a la variable 'i'.");
		System.out.println(
				"g) ==> x = a % (a / b) || No se puede dividir debido a que el resultado de los paréntesis es un tipo double de 0.");
		System.out.println(
				"m) ==> s='c' || Se esta intentando poner un elemento char en una variable String. Deberías de utilizar \"\".");
		System.out.println("El resto de letras ('k', 'm' and 'o') causan un syntax error.\n");

		System.out.println("Soluciones: ");
		System.out.println("k) " + (c = '\''));
		System.out.println("m) " + (s = "c"));
		System.out.println("o) " + (s = "\""));

	}
}
