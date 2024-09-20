package poo;

import clases.Factura;
import clases.Almacen;
import clases.Detalle;

/**
 *
 * @author admin
 */
public class Tienda
{

    public static void main(String[] args)
    {
        //ArregloAlm listaProductos = new ArregloAlm();
        ArregloFactura listaFacturas = new ArregloFactura();
        MatrizDetalles matriz = new MatrizDetalles();

        int opcion;
        do
        {
            System.out.println("\n------------- Proyecto Almacen -------------");
            System.out.println("1) Registrar nuevo producto.");
            System.out.println("2) Modificacion de prouctos.");
            System.out.println("3) Consultar productos.");
            System.out.println("4) Registrat venta.");
            System.out.println("5) Consultar factura.\n");
            System.out.println("6) Terminar programa.\n");
            System.out.print("Ingrese una opcinon $> ");
            opcion = Lecturas.leerEntero();

            switch (opcion)
            {
                case 1:
                    Almacen producto = new Almacen();
                    producto.setId(Controlador.validarId());
                    System.out.print("NOMBRE del producto $> ");
                    producto.setNombre(Lecturas.leerCadena());
                    producto.setExistencia(Controlador.validarExistencia());
                    producto.setPrecio(Controlador.validarPrecio());
                    ArregloAlmacen.insertar(producto);
                    break;

                case 2:
                    System.out.print("\n\nIngrese el ID del producto a modificar $> ");
                    int productoModificar = Lecturas.leerEntero();
                    productoModificar = ArregloAlmacen.buscarId(productoModificar);
                    if (productoModificar < 0)
                    {
                        System.out.print("\nEl dato ingresado NO esta asociado a ningun producto...\n");
                    } else
                    {
                        //          listaProductos.actualizar(productoModificar);              
                    }
                    break;

                case 3:
                    System.out.println(ArregloAlmacen.desplegar());
                    break;

                case 4:
                    if (ArregloFactura.facturas == null)
                    {
                        System.out.println("\n\t***No se puede iniciar venta***\n\t***No hay productos registrados***\n");
                        continue;
                    }

                    Factura factura = new Factura();
                    factura.setFolio(Controlador.validarFolio());
                    char mas;
                    do
                    {
                        Detalle datalle = new Detalle();
                        datalle.getId();
                        
                        System.out.println("Agregar otro producto ({*}-N)=(Si) / N=(No) >$");
                        mas = Lecturas.leerCaracter();
                    } while (mas != 'N' || mas != 'n');

                    /*System.out.print("\n\nFOLIO de la factura $> ");
                    do
                    {
                        factura.setFolio(Lecturas.leerEntero(true));
                        if (factura.getFolio() > 0)
                        {
                            if (listaFacturas.buscarFolio(factura.getFolio()) >= 0)
                            {
                                System.out.print("El FOLIO introducido no esta disponible.\nVuelva a intenrar $>");
                                continue;
                            }
                            break;
                        }
                        System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
                    } while (true);
                    
                    factura.llenarDatos(listaProductos, matriz);
                     */
                    break;

                default:
                    System.out.println("\n\nLa opcion ingresada NO es valida\n\n");
            }
        } while (opcion != 6);
    }
}
