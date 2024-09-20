
package poo;

import clases.Detalle;
import clases.Factura;

/**
 *
 * @author admin
 */
public class ArregloFactura
{
    public static Factura[] facturas = null;

    public static String desplegar()
    {
        String str = "";
        if (facturas != null)
        {
            for (Factura factura : facturas)
            {
                str += factura.desplegar() + "\n";
            }
            System.out.println("\n\nFOLIO\t\t\tFECHA\t\tSUBTOTAL\t\tIVA\t\tTOTAL");
            System.out.println("------------------------------------------------------------------");
        } else
        {
            str += "\n\t***No hay productos registrados***\n";
        }
        return str;
    }

    public static void insertar(Factura factura)
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

        //System.out.println("\n\tRegistro exito...!");
    }

    public static int buscarFolio(int folio)
    {
        if (facturas != null && folio > 0)
        {
            for (int i = 0; i < facturas.length; i++)
            {
                if (facturas[i].getFolio() == folio)
                {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public static double subTotal(Detalle[] detalles)
    {
        if (detalles != null)
        {
            double sub = 0.0;
            for(Detalle reg : detalles)
            {
                sub += reg.getPrecio() * reg.getCantidad();
            }
            return sub;
        }
        return 0.0;
    }
}
