
package poo;

/**
 *
 * @author admin
 */
public class ArregloFactura
{
    private Factura lista [] = null;

     /**
     * @return the lista
     */
    public int getListaLength()
    {
        return lista != null ? lista.length : 0;
    }
    
    public String desplegar()
    {
        String str = "";
        if (lista != null)
        {
            for (Factura factura : lista)
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
        if (lista == null)
        {
            lista = new Factura[1];
            lista[0] = factura;
        } else
        {
            Factura tempLista[] = new Factura[lista.length + 1];
            System.arraycopy(lista, 0, tempLista, 0, lista.length);
            tempLista[lista.length] = factura;
            lista = tempLista;
        }

        System.out.println("\n\tRegistro exito...!");
    }

    public int buscarId(int idBudcar)
    {
        if (lista != null && idBudcar > 0)
        {
            for (int i = 0; i < lista.length; i++)
            {
                if (lista[i].getId() == idBudcar)
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
            lista[id].setPrecio(Lecturas.leerDoble(true));
            if (lista[id].getPrecio() > 0)
            {
                break;
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);

        System.out.print("EXISTENCIA del producto $> ");
        do
        {
            lista[id].setExistencia(Lecturas.leerEntero(true));
            if (lista[id].getExistencia() > 0)
            {
                break;
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);
        
        System.out.println("\n Datos actualizados correctamente...!\n");
    }*/
    
    public int buscarFolio(int idBudcar)
    {
        if (lista != null && idBudcar > 0)
        {
            for (int i = 0; i < lista.length; i++)
            {
                if (lista[i].getFolio() == idBudcar)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
