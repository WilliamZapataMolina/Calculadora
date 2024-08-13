package pruebasunitarias;

/**
 *
 * @author WilliamZapataMolina
 */
public class Calculadora {
    /**
     * 
     * @param a Primer número a sumar
     * @param b Segundo número a sumar
     * @return  La suma entre a y b 
     */
    public double sumar(int a, int b) {
        return a + b;
    }
    /**
     * 
     * @param a El número del cual se restará
     * @param b El número a restar
     * @return la diferencia entre a y b
     */
    public int restar(int a, int b) {
        return a - b;
    }
    /**
     * 
     * @param a Primer número a multiplicar
     * @param b Segundo número a multiplicar
     * @return  el producto de a y b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }
    /**
     * 
     * @param a El dividendo 
     * @param b El divisor
     * @return  El cociente de la división entre a y b
     */
    public int dividir(int a, int b) {
        return a / b;
    }
}
