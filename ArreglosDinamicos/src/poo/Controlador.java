package poo;

/**
 *
 * @author Alfred
 */
public class Controlador
{
    public static int validarId()
    {
        System.out.print("\n\nID del producto $> ");
        int id;
        do
        {
            id = Lecturas.leerEntero(true);
            if (id > 0)
            {
                if (ArregloAlmacen.buscarId(id) >= 0)
                {
                    System.out.print("El ID introducido no esta disponible.\nVuelva a intenrar $>");
                    continue;
                }
                break;
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);
        return id;
    }
    
    public static int validarExistencia()
    {
        int existencia;
        System.out.print("EXISTENCIA del producto $> ");
        do
        {
            existencia = Lecturas.leerEntero(true);
            if (existencia > 0)
            {
                break;
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);
        return existencia;
    }
    
    public static double validarPrecio()
    {
        double precio;
        System.out.print("PRECIO del producto $> ");
        do
        {
            precio = Lecturas.leerDoble(true);
            if (precio > 0)
            {
                break;
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);
        return precio;
    }
    
    public static int validarFolio()
    {
        System.out.print("\n\nFolio de factura $> ");
        int id;
        do
        {
            id = Lecturas.leerEntero(true);
            if (id > 0)
            {
                if (ArregloFactura.buscarFolio(id) >= 0)
                {
                    System.out.print("El Folio introducido no esta disponible.\nVuelva a intenrar $>");
                    continue;
                }
                break;
            }
            System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
        } while (true);
        return id;
    }
}
