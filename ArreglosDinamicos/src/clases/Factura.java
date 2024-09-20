package clases;

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
        return getFolio() + "\t" + getFecha() + "\t\t" + getSubtotal() + "\t\t$" + getIva() + "\t\t" + getTotal();
    }

}
