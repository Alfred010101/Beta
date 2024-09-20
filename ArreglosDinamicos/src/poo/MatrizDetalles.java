package poo;

import clases.Detalle;

/**
 *
 * @author admin
 */
public class MatrizDetalles
{

    public static Detalle[][] matrizDetalles = null;

    public static void insertar()
    {
        if (matrizDetalles == null)
        {
            matrizDetalles = new Detalle[1][];
            matrizDetalles[0] = null;
        } else
        {
            Detalle[][] tmp = new Detalle[matrizDetalles.length + 1][];
            System.arraycopy(matrizDetalles, 0, tmp, 0, matrizDetalles.length);
            tmp[matrizDetalles.length] = null;
            matrizDetalles = tmp;
        }
    }

    public static void insertar(int iD, Detalle detalle)
    {
        if (matrizDetalles[iD] == null)
        {
            matrizDetalles[iD] = new Detalle[1];
            matrizDetalles[iD][0] = detalle;
        } else
        {
            Detalle tmp[] = new Detalle[matrizDetalles[iD].length + 1];
            System.arraycopy(matrizDetalles[iD], 0, tmp, 0, matrizDetalles[iD].length);
            tmp[matrizDetalles[iD].length] = detalle;
            matrizDetalles[iD] = tmp;
        }
        System.out.println("\n\tSe agrego de forma exitosa...!");
    }
    
    public static void desplegar(int iD)
    {
        for(Detalle detalle: matrizDetalles[iD])
        {
            System.out.println(detalle.desplegar());
        }
    }
}
