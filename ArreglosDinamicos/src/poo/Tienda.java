package poo;

import clases.Factura;
import clases.Almacen;
import clases.Detalle;
import java.util.Date;

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
                        System.out.print("\nEl ID ingresado NO esta asociado a ningun producto...\n");
                    } else
                    {
                        //          listaProductos.actualizar(productoModificar);              
                    }
                    break;

                case 3:
                    System.out.println(ArregloAlmacen.desplegar());
                    break;

                case 4:
                    if (ArregloAlmacen.productos == null)
                    {
                        System.out.println("\n\t***No se puede iniciar venta***\n\t***No hay productos registrados***\n");
                        continue;
                    }

                    Factura factura = new Factura();
                    factura.setFolio(Controlador.validarFolio());
                    factura.setFecha(new Date().toString());
                    ArregloFactura.insertar(factura);
                    MatrizDetalles.insertar();
                    
                    char mas;
                    do
                    {
                        System.out.println(ArregloAlmacen.desplegar());
                        Detalle detalle = new Detalle();
                        detalle.setFolio(factura.getFolio());
                        detalle.setId(Controlador.asignarId());
                        int index = ArregloAlmacen.buscarId(detalle.getId());
                        detalle.setCantidad(Controlador.validarCantidad(index));
                        detalle.setPrecio(ArregloAlmacen.productos[index].getPrecio());
                        MatrizDetalles.insertar(MatrizDetalles.matrizDetalles.length, detalle);
                        System.out.println("Agregar otro producto ({*}-N)=(Si) / N=(No) >$");
                        mas = Lecturas.leerCaracter();
                    } while (mas != 'N' && mas != 'n');
                    break;
                
                case 5:
                    System.out.println(ArregloFactura.desplegar());
                    break;

                default:
                    System.out.println("\n\nLa opcion ingresada NO es valida\n\n");
            }
        } while (opcion != 6);
    }
}
