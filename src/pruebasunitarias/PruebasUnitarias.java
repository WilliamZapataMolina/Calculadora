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

    }

}
