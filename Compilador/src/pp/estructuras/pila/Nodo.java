package pp.estructuras.pila;

/**
 *
 * @author alcon
 */
public class Nodo
{

    private String valor;
    Nodo sig;

    public Nodo(String valor)
    {
        this.valor = valor;
        sig = null;
    }

    public String getValor()
    {
        return valor;
    }

    public void setValor(String valor)
    {
        this.valor = valor;
    }

}
