
package poo;

import clases.Factura;

/**
 *
 * @author admin
 */
public class ArregloFactura
{
    public static Factura[] facturas = null;

     /**
     * @return the facturas
     */
    public int getListaLength()
    {
        return facturas != null ? facturas.length : 0;
    }
    
    public String desplegar()
    {
        String str = "";
        if (facturas != null)
        {
            for (Factura factura : facturas)
            {
                str += factura.desplegar() + "\n";
            }
            System.out.println("\n\nID\t\tNOMBRE\t\t\tEXISTENCIA\tPRECIO");
            System.out.println("------------------------------------------------------------------");
        } else
        {
            str += "\n\t***No hay productos registrados***\n";
        }
        return str;
    }

  /*  public void insertar(Factura factura)
    {
        if (facturas == null)
        {
            facturas = new Factura[1];
            facturas[0] = factura;
        } else
        {
            Factura tempLista[] = new Factura[facturas.length + 1];
            System.arraycopy(facturas, 0, tempLista, 0, facturas.length);
            tempLista[facturas.length] = factura;
            facturas = tempLista;
        }

        System.out.println("\n\tRegistro exito...!");
    }

    public int buscarId(int idBudcar)
    {
        if (facturas != null && idBudcar > 0)
        {
            for (int i = 0; i < facturas.length; i++)
            {
                if (facturas[i].getId() == idBudcar)
                {
                    return i;
                }
            }
        }
        return -1;
    }

    public void actualizar(int id)
    {
        System.out.print("PRECIO del producto $> ");
        do
        {
            facturas[id].setPrecio(Lecturas.leerDoble(true));
            if (facturas[id].getPrecio() > 0)
            {
                break;
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);

        System.out.print("EXISTENCIA del producto $> ");
        do
        {
            facturas[id].setExistencia(Lecturas.leerEntero(true));
            if (facturas[id].getExistencia() > 0)
            {
                break;
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);
        
        System.out.println("\n Datos actualizados correctamente...!\n");
    }*/
    
    public static int buscarFolio(int idBudcar)
    {
        if (facturas != null && idBudcar > 0)
        {
            for (int i = 0; i < facturas.length; i++)
            {
                if (facturas[i].getFolio() == idBudcar)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
