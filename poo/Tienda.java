package poo;

/**
 *
 * @author admin
 */
public class Tienda
{

    public static void main(String[] args)
    {
        ArregloAlmacen listaProductos = new ArregloAlmacen();
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
                    
                    System.out.print("\n\nID del producto $> ");
                    do
                    {
                        producto.setId(Lecturas.leerEntero(true));
                        if (producto.getId() > 0)
                        {
                            if (listaProductos.buscarId(producto.getId()) >= 0)
                            {
                                System.out.print("El ID introducido no esta disponible.\nVuelva a intenrar $>");
                                continue;
                            }
                            break;
                        }
                        System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
                    } while (true);
                    
                    producto.llenarDatos();
                    listaProductos.insertar(producto);
                    
                    break;

                case 2:
                    System.out.print("\n\nIngrese el ID del producto a modificar $> ");
                    int productoModificar = Lecturas.leerEntero();
                    productoModificar = listaProductos.buscarId(productoModificar);
                    if (productoModificar < 0)
                    {
                        System.out.print("\nEl dato ingresado NO esta asociado a ningun producto...\n");
                        continue;
                    }
                    listaProductos.actualizar(productoModificar);
                    break;

                case 3:
                    System.out.println(listaProductos.desplegar());
                    break;

                case 4:
                    Factura factura = new Factura();
                    if(listaProductos.getListaLength() == 0)
                    {
                        System.out.println("\n\t***No se puede iniciar venta***\n\t***No hay productos registrados***\n");
                        continue;
                    }
                    System.out.print("\n\nFOLIO de la factura $> ");
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
                    
                    break;

                default:
                    System.out.println("\n\nLa opcion ingresada NO es valida\n\n");
            }
        } while (opcion != 6);
    }
}
