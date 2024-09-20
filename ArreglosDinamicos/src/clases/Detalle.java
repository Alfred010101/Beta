package clases;

import poo.ArregloAlmacen;


/**
 *
 * @author admin
 */
public class Detalle
{

    private int folio;
    private int id;
    private int cantidad;
    private double precio;

    public Detalle()
    {
    }

    public Detalle(int folio, int id, int cantidad, double precio)
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
    public int getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id)
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
    
    public String desplegar()
    {
        return ArregloAlmacen.productos[ArregloAlmacen.buscarId(id)].getNombre() 
                + "\t\t" + cantidad + "\t\t" + precio + "\t\t" + (cantidad * precio);
    }
}
