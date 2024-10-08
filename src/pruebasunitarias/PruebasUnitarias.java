package pruebasunitarias;

/**
 *
 * @author WilliamZapataMolina
 */
public class PruebasUnitarias {

    public static void main(String[] args) {

        Calculadora calculator = new Calculadora();
        int resultado = (int) calculator.sumar(3, 5);
        System.out.println("El resultado de la suma es:" + resultado);

        Calculadora calculator1 = new Calculadora();
        int resultado1 = (int) calculator1.restar(8, 3);
        System.out.println("El resultado de la resta es:" + resultado1);

        Calculadora calculator2 = new Calculadora();
        int resultado2 = (int) calculator2.multiplicar(8, 3);
        System.out.println("El resultado de la multiplicación es:" + resultado2);

        try {
            Calculadora calculadora3 = new Calculadora();
            int resultado3 = (int) calculadora3.dividir(8, 5);
            System.out.println("El resultado de la división es: " + resultado3);
        } catch (ArithmeticException error) {
            System.out.println("Error: " + error.toString());
        }
    }

}
