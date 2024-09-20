package poo;

import clases.Almacen;

/**
 *
 * @author admin
 */
public class ArregloAlmacen
{

    public static Almacen[] productos = null;

    public static String desplegar()
    {
        String str = "";
        if (productos != null)
        {
            for (Almacen producto : productos)
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

    public static void insertar(Almacen producto)
    {
        if (productos == null)
        {
            productos = new Almacen[1];
            productos[0] = producto;
        } else
        {
            Almacen tempVector[] = new Almacen[productos.length + 1];
            System.arraycopy(productos, 0, tempVector, 0, productos.length);
            tempVector[productos.length] = producto;
            productos = tempVector;
        }
        System.out.println("\n\tRegistro exito...!");
    }

    public static int buscarId(int idBudcar)
    {
        if (productos != null && idBudcar > 0)
        {
            for (int i = 0; i < productos.length; i++)
            {
                if (productos[i].getId() == idBudcar)
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
            productos[index].setPrecio(Lecturas.leerDoble(true));
            if (productos[index].getPrecio() > 0)
            {
                break;
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);

        System.out.print("EXISTENCIA del producto $> ");
        do
        {
            productos[index].setExistencia(Lecturas.leerEntero(true));
            if (productos[index].getExistencia() > 0)
            {
                break;
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);
        
        System.out.println("\n Datos actualizados correctamente...!\n");
    }
    
    
    public double venderProducto(int i, int cantidad)
    {
        /*if(cantidad > 0 && cantidad <= lista[i].getExistencia())
        {
            lista[i].setExistencia( lista[i].getExistencia() - cantidad);
            return lista[i].getPrecio();
        }
        
        System.out.print("La CANTIDAD exede el numero de existencias.\nVuelva a intenrar $> ");*/
        return 0;
    }
}
