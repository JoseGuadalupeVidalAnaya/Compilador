package pp.metodos;

import pp.estructuras.pila.Pila;

/**
 *
 * @author Jose Vidal
 */
public class Metodos
{

    Pila pila;

    public Metodos()
    {
        pila = new Pila();
    }

    /**
     *
     * @param exprecion
     * @return
     */
    public String postfijo(String exprecion)
    {
        String aux = "";
        for (int i = 0; i < exprecion.length(); i++)
        {
            if (exprecion.charAt(i) == ')')
            {
                while (!pila.vacia())
                {
                    aux = aux + pila.quitar();
                }
            }
            else if (exprecion.charAt(i) == '-' || exprecion.charAt(i) == '+')
            {
                if (pila.vacia())
                {
                    pila.poner(exprecion.charAt(i) + "");
                }
                else if (pila.ver().equals("+") || pila.ver().equals("-"))
                {
                    aux = aux + pila.quitar();
                    pila.poner(exprecion.charAt(i) + "");
                }
                else
                {
                    pila.poner(exprecion.charAt(i) + "");
                }

            }
            else if (exprecion.charAt(i) == '*' || exprecion.charAt(i) == '/')
            {
                if (pila.vacia())
                {
                    pila.poner(exprecion.charAt(i) + "");
                }
                else if (pila.ver().equals("/") || pila.ver().equals("*"))
                {
                    aux = aux + pila.quitar();
                    pila.poner(exprecion.charAt(i) + "");
                }
                else if (pila.ver().equals("+") || pila.ver().equals("-"))
                {
                    while (!pila.vacia())
                    {
                        aux = aux + pila.quitar();
                    }
                    pila.poner(exprecion.charAt(i) + "");
                }
                else
                {
                    pila.poner(exprecion.charAt(i) + "");
                }
            }
            else if (exprecion.charAt(i) != '(')
            {
                aux = aux + exprecion.charAt(i);
            }
        }
        while (!pila.vacia())
        {
            aux = aux + pila.quitar();
        }
        return aux;
    }
}
