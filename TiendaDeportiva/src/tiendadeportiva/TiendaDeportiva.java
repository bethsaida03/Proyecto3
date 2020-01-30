/*
Se necesita un sistema para la venta de camisetas de equipos de football de una 
tienda deportiva. Una camiseta tiene una categoría de equipo, número, y un precio. 
Las categorías de equipos pueden ser ‘A’, ‘B’ o ‘C’. Cada camiseta tiene un precio,
sin embargo si su tipo es ‘A’ aumenta su precio en un 10%, si su tipo es ‘B’ 
aumenta en un 5% y si el número de camiseta es 10 o 7 su precio aumenta en $5.
a.Cree la clase Camiseta necesaria definiendo sus atributos. Agregue a la clase 
el constructor por defecto y un constructor que inicialice categoría de equipo, número y precio.
b.Encapsule/oculte los atributos de las clases para categoría de equipo con 
descriptores (get y set). Utilice el descriptor set para validar que las categorías solo puedan ser las especificadas. 
c.Escriba el método que permita calcular el precio total de la camiseta, en base a las indicaciones del enunciado.
d.Escriba un método que permita ingresar los datos de la camiseta
e.Escriba un método que permita mostrar todos los datos de la camiseta incluyendo su precio calculado.
f.Para probar su programa, haga un lazo que permita a los usuarios ingresar nuevas
camisetas, calcular su precio y mostrar todos sus datos mientras lo requiera.

 */
package tiendadeportiva;
import java.util.Scanner;

/**
 *
 * @author familiachea
 */
public class TiendaDeportiva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String vuelta;
        
        Camiseta ca=new Camiseta();
        
        do{
        System.out.println("DIGITE EL NUMERO DE LA COMISETA: ");
        numero=sc.nextInt();
        ca.setNumero(numero);
        System.out.println("MENU LA CATEGORIA DE EQUIPO: ");
        System.out.println("1-Categoria 'A': +10%");
        System.out.println("2-Categoria 'B': + 5%");
        System.out.println("3-Categoria 'C': + $5");
        ca.IngresoDatos();
        ca.CalcularPrecT();
        ca.MostrarDatos();
        
        System.out.print("QUIERE OTRA CAMISETA SI(caracter) O NO(0): ");
        vuelta= sc.nextLine();
        } while(!"0".equals(vuelta));
        
    }
    
}
