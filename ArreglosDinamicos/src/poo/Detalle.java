package poo;

/**
 *
 * @author admin
 */
public class Detalle
{

    private int folio;
    private String id;
    private int cantidad;
    private double precio;

    public Detalle()
    {
    }

    public Detalle(int folio, String id, int cantidad, double precio)
    {
        this.folio = folio;
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     * @return the folio
     */
    public int getFolio()
    {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio)
    {
        this.folio = folio;
    }

    /**
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad()
    {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public void llenarDetalles(ArregloAlmacen listaProductos, int folio)
    {
        this.folio = folio;
        int index;
        System.out.print("\nID del producto a vender $> ");
        do
        {
            id = "" + Lecturas.leerEntero(true);
            if (Integer.parseInt(id) > 0)
            {
                index = listaProductos.buscarId(Integer.parseInt(id));
                if (index < 0)
                {
                    System.out.println("No se ha encontrado un producto asociado al ID.\nVuelva a intenrar $>");
                    continue;
                }
                break;
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);

        System.out.print("CANTIDAD del producto $> ");
        do
        {
            cantidad = Lecturas.leerEntero(true);
            if (cantidad > 0)
            {
                precio =  listaProductos.venderProducto(index, cantidad);
                if(precio > 0)
                {
                     break;
                }
                continue;               
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);

    }

}
