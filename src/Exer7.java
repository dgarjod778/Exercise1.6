
public class Exer7 {
	public static void main(String[] args) {
		
		System.out.println("--------------------------- \n" + "Ejercicio 7" + " \n---------------------------");
		int lado1 = 3, lado2 = 4, hipotenusa=5;
		double precio = 325.6;
		char ch = '7';
		boolean comprar = false;
		
		System.out.println("a) " + (5 * precio - 1.50));
		System.out.println("b) " + ((precio < 300 + 0.1 * precio) || comprar));
		System.out.println("e) " + ((ch <= 'A') && comprar));
		
		System.out.println("\nLas unidades que no se muestran son porque:");
		System.out.println("c) ==> Math.sqrt(lado1) + Math.sqrt(lado2)  = Math.sqrt(hipotenusa) || No se puede hacer debido a que el destinatario tiene que ser una variable.");
		System.out.println("d) ==> (! comprar) && (precio + 125.3) || No se puede verificar si una de los candidatas es un número.");
		System.out.println("f) ==> ch = '7' || ! comprar || No se puede verificar si 'ch' es true o false. Debería ser == .");
	}
}
