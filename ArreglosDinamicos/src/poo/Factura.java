package poo;

/**
 *
 * @author admin
 */
public class Factura
{

    private int folio;
    private String fecha;
    private double subtotal;
    private double iva;
    private double total;

    public Factura()
    {
        subtotal = 0;
        iva = 0;
        total = 0;
    }

    public Factura(int folio, String fecha, double subtotal, double iva, double total)
    {
        this.folio = folio;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
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
     * @return the fecha
     */
    public String getFecha()
    {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal()
    {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal)
    {
        this.subtotal = subtotal;
    }

    /**
     * @return the iva
     */
    public double getIva()
    {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva)
    {
        this.iva = iva;
    }

    /**
     * @return the total
     */
    public double getTotal()
    {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total)
    {
        this.total = total;
    }

    public String desplegar()
    {
        return getFolio() + "\n" + getFecha() + "\n\t" + getSubtotal() + "\n\t$" + getIva() + "\n\t" + getTotal() + "\n";
    }

    public void llenarDatos(ArregloAlmacen listaProductos, MatrizDetalles matriz)
    {
        Detalle detalles = new Detalle();
        System.out.print("FECHA de la factura $> ");
        fecha = Lecturas.leerCadena();
        String res;
        do
        {
            detalles.llenarDetalles(listaProductos, getFolio());
            do
            {
                System.out.print("Agragar otro producto 'Si/No' $> ");
                res = Lecturas.leerCadena();
                if (res.equalsIgnoreCase("si") || res.equalsIgnoreCase("no"))
                {
                    subtotal += detalles.getPrecio() * detalles.getCantidad();
                    break;
                }
                System.out.println("<<<Opcion invalida>>> ");
            } while (true);
            System.out.println(res + " *WEE**EW**W*E" + res.equalsIgnoreCase("no"));
        } while (res.equalsIgnoreCase("si"));

        iva = subtotal * 0.16;
        total = iva + subtotal;
        System.out.println("\nGracias por su compra...!");        
    }
}
