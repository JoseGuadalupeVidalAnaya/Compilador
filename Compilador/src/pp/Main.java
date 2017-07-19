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
        Metodos met=new Metodos();
        System.out.println(met.postfijo("((1+2)/3)*3"));
    }

}
