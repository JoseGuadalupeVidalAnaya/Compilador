package pp.estructuras.arbol;

/**
 *
 * @author alcon
 */
public class Nodo
{

    Nodo izq, der;
    private String dato;

    public Nodo(String dato)
    {
        this.dato = dato;
    }

    public String getDato()
    {
        return dato;
    }

    public void setDato(String dato)
    {
        this.dato = dato;
    }
    
}
