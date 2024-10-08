package poo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author admin
 */
public class Lecturas
{

    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);

    public static int leerEntero()
    {
        try
        {
            return Integer.parseInt(br.readLine());
        } catch (IOException ex)
        {
            System.out.println("No hay periferico de entrada");
            return 0;
        } catch (NumberFormatException errorEntro)
        {
            return 0;
        } catch (Exception e)
        {
            return 0;
        }
    }

    public static int leerEntero(int a)
    {
        try
        {
            return Integer.parseInt(br.readLine());
        } catch (IOException ex)
        {
            System.out.println("No hay periferico de entrada");
            return 0;
        } catch (NumberFormatException errorEntro)
        {
            System.out.println("Se espearaba un entero");
            return 0;
        } catch (Exception e)
        {
            System.out.println("Error..." + e.toString());
            return 0;
        }

    }

    public static int leerEntero(boolean b)
    {
        do
        {
            try
            {
                return Integer.parseInt(br.readLine());
            } catch (Exception e)
            {
                System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
            }

        } while (b);

        return 0;
    }

    public static double leerDoble()
    {
        try
        {
            return Double.parseDouble(br.readLine());
        } catch (IOException ex)
        {
            System.out.println("No hay periferico de entrada");
            return 0;
        } catch (NumberFormatException errorEntro)
        {
            System.out.println("Se espearaba un double");
            return 0;
        } catch (Exception e)
        {
            System.out.println("Error..." + e.toString());
            return 0;
        }

    }

    public static double leerDoble(boolean b)
    {
        do
        {
            try
            {
                return Double.parseDouble(br.readLine());
            } catch (Exception e)
            {
                System.out.print("El dato ingresado no es valido.\nVuelva a intenrar $> ");
            }

        } while (b);
        return 0;
    }

    public static char leerCaracter()
    {
        char c = ' ';
        try
        {
            c = (char) br.read();
            String s = br.readLine();
        } catch (IOException e)
        {
            System.out.println("Error..." + e.toString());
        }

        return c;
    }

    public static String leerCadena()
    {
        String s = "";
        try
        {
            s = br.readLine();
        } catch (IOException e)
        {
            System.out.println("Error..." + e.toString());
        }
        return s;
    }
}
