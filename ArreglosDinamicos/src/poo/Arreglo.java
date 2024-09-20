package poo;

/**
 *
 * @author admin
 */
public class Arreglo
{

    private Almacen vector[] = null;

    public String desplegar()
    {
        String str = "";
        if (vector != null)
        {
            for (Almacen producto : vector)
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
        if (vector == null)
        {
            vector = new Almacen[1];
            vector[0] = producto;
        } else
        {
            Almacen tempVector[] = new Almacen[vector.length + 1];
            System.arraycopy(vector, 0, tempVector, 0, vector.length);
            tempVector[vector.length] = producto;
            vector = tempVector;
        }

        System.out.println("\n\tRegistro exito...!");
    }

    public int buscarId(int idBudcar)
    {
        if (vector != null && idBudcar > 0)
        {
            for (int i = 0; i < vector.length; i++)
            {
                if (vector[i].getId() == idBudcar)
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
            vector[index].setPrecio(Lecturas.leerDoble(true));
            if (vector[index].getPrecio() > 0)
            {
                break;
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);

        System.out.print("EXISTENCIA del producto $> ");
        do
        {
            vector[index].setExistencia(Lecturas.leerEntero(true));
            if (vector[index].getExistencia() > 0)
            {
                break;
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);
        
        System.out.println("\n Datos actualizados correctamente...!\n");
    }
}
