package pp.estructuras.pila;

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

    private Nodo pila;
    private int size;

    /**
     * Crea una pila vacia
     */
    public Pila()
    {
        pila = null;
        size = -1;
    }

    /**
     * Metodo que agrega un elemento a la cima de la pila
     *
     * @param elemento elemeto a ser agregado a la cima de la pila
     */
    public void poner(String elemento)
    {
        if (pila == null)
        {
            pila = new Nodo(elemento);
        }
        else
        {
            Nodo nuevo = new Nodo(elemento);
            nuevo.sig = pila;
            pila = nuevo;
        }
        size++;
    }

    /**
     * Metodo que recupera y borra el elemento que esta en la cima de la pila
     *
     * @return El elemeto que esta en la cima de la pila
     */
    public String quitar()
    {
        String dato = pila.getValor();
        pila = pila.sig;
        size = 0;
        return dato;
    }

    /**
     * Comprueva si la pila esta vacia
     *
     * @return true si la pila esta vacia o false si almenos tiene un elemento
     */
    public boolean vacia()
    {
        return pila == null;
    }

    /**
     * Obtiene el elemento que esta en la cima sin borrarlo
     *
     * @return El ultimo elemento agregado
     */
    public String ver()
    {
        return pila.getValor();
    }

    /**
     * Medodo que se encarga de buscar un elemento dentro de la pila
     *
     * @param elemento es es elemento que se desea encontrar en la pila
     * @return La pocision donde se encuentra el elemento y si no lo encuentra
     * devuelbe -1
     */
    public int buscar(String elemento)
    {
        Nodo aux = pila;
        for (int i = size; i >= 0; i++)
        {
            if (aux.getValor().equals(elemento))
            {
                return i;
            }
            aux = aux.sig;
        }
        return -1;
    }

    /**
     * Metodo que devuelve el tamaño de la pila
     *
     * @return El tamaño de la pila
     */
    public int tamaño()
    {
        return size + 1;
    }
}
