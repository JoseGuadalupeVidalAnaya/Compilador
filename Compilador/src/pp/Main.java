package pp;

/**
 * Clase principal
 *
 * @author Jose Vidal
 * @version 1.0.0
 */
public class Main
{

    public static void main(String[] args)
    {
        Pila pila = new Pila();
        pila.poner("hola");
        System.out.println(pila.quitar());
        System.out.println(pila.quitar());
    }

}
