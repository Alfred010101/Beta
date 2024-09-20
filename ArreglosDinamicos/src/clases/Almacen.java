package clases;

import poo.Lecturas;

/**
 *
 * @author admin
 */
public class Almacen
{

    private int id;
    private int existencia;
    private String nombre;
    private double precio;

    public Almacen()
    {
    }

    public Almacen(int id, String nombre, int existencia, double precio)
    {
        this.id = id;
        this.existencia = existencia;
        this.nombre = nombre;
        this.precio = precio;
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
     * @return the existencia
     */
    public int getExistencia()
    {
        return existencia;
    }

    /**
     * @param existencia the existencia to set
     */
    public void setExistencia(int existencia)
    {
        this.existencia = existencia;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
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
        return getId() + "\t\t" + getNombre() + "\t\t\t" + getExistencia() + "\t\t$" + getPrecio();
    }
}
