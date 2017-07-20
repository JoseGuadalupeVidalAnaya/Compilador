package pp.estructuras.pila;

import java.util.ArrayList;

/**
 * Esta clase representa una estructura de datos permite almacenar y recuperar
 * datos basasa en LIFO
 *
 * @author Jose Vidal
 * @version 1.0.0
 * @since Compilador 1.0.0
 */
public class Pila
{

    private ArrayList<String> pila;

    /**
     * Crea una pila vacia
     */
    public Pila()
    {
        pila = new ArrayList<>();
    }

    /**
     * Metodo que agrega un elemento a la cima de la pila
     *
     * @param elemento elemeto a ser agregado a la cima de la pila
     */
    public void poner(String elemento)
    {
        pila.add(elemento);
    }

    /**
     * Metodo que recupera y borra el elemento que esta en la cima de la pila
     *
     * @return El elemeto que esta en la cima de la pila
     */
    public String quitar()
    {
        return pila.remove(pila.size() - 1);
    }

    /**
     * Comprueva si la pila esta vacia
     *
     * @return true si la pila esta vacia o false si almenos tiene un elemento
     */
    public boolean vacia()
    {
        return pila.isEmpty();
    }

    /**
     * Obtiene el elemento que esta en la cima sin borrarlo
     *
     * @return El ultimo elemento agregado
     */
    public String ver()
    {
        return pila.get(pila.size() - 1);
    }

    public int buscar(String elemento)
    {
        for (int i = pila.size() - 1; i >= 0; i++)
        {
            if (pila.get(i).equals(elemento))
            {
                return i;
            }
        }
        return -1;
    }

    public int tamaño()
    {
        return pila.size();
    }
}
