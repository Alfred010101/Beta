package poo;

/**
 *
 * @author admin
 */
public class ArregloAlmacen
{
    private Almacen lista[] = null;

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
            for (Almacen producto : lista)
            {
                str += producto.desplegar() + "\n";
            }
            System.out.println("\n\nID\t\tNOMBRE\t\t\tEXISTENCIA\tPRECIO");
            System.out.println("------------------------------------------------------------------");
        } else
        {
            str += "\n\t***No hay productos registrados***\n";
        }
        return str;
    }

    public void insertar(Almacen producto)
    {
        if (lista == null)
        {
            lista = new Almacen[1];
            lista[0] = producto;
        } else
        {
            Almacen tempVector[] = new Almacen[lista.length + 1];
            System.arraycopy(lista, 0, tempVector, 0, lista.length);
            tempVector[lista.length] = producto;
            lista = tempVector;
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

    public void actualizar(int index)
    {
        System.out.print("PRECIO del producto $> ");
        do
        {
            lista[index].setPrecio(Lecturas.leerDoble(true));
            if (lista[index].getPrecio() > 0)
            {
                break;
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);

        System.out.print("EXISTENCIA del producto $> ");
        do
        {
            lista[index].setExistencia(Lecturas.leerEntero(true));
            if (lista[index].getExistencia() > 0)
            {
                break;
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);
        
        System.out.println("\n Datos actualizados correctamente...!\n");
    }
    
    public double venderProducto(int i, int cantidad)
    {
        if(cantidad > 0 && cantidad <= lista[i].getExistencia())
        {
            lista[i].setExistencia( lista[i].getExistencia() - cantidad);
            return lista[i].getPrecio();
        }
        
        System.out.print("La CANTIDAD exede el numero de existencias.\nVuelva a intenrar $> ");
        return 0;
    }
}
