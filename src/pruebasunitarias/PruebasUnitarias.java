
package pruebasunitarias;

/**
 *
 * @author WilliamZapataMolina
 */
public class PruebasUnitarias {

    public static void main(String[] args) {

        Calculadora calculator = new Calculadora();
        int resultado = (int) calculator.sumar(3,5);
        System.out.println("Resultado:"+ resultado);

    }

}
