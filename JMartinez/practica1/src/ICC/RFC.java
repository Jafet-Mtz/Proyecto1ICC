/*
* Introduccion a las ciencias de la computacion 
* Programa para consultar el RFC del usuario 
* Martinez Jose Jafet 
* 1.0
*/
// Declaramos el Scanner  
import java.util.Scanner;
public class  RFC {

public static void main (String [] args) {
//Se crea el objeto Sanner para leer la entrada del ususarion 
Scanner in = new Scanner(System.in);
//Declaramos una variable para el nombre 
String N;
//Pedios al usuario que ingrese su nombre completo con restricciones 
System.out.println("Ingresa tu nombre completo(Apellido Paterno, Apellido Materno y Nombre) ");
//El ususraio regresa el nombre para leerlo
N = in.nextLine();
//Pedimos al usuario proporcionar su fecha de nacimiento con restricciones 
System.out.println("Ingresa tu fecha de nacimiento (dd/mm/aa/)");
//El usuario no regresa su fecha para leerlo 
String Fecha = in.nextLine();

String[] partesNombre = N.split("\\s+");
String paterno = partesNombre[0];
String materno = partesNombre[1];
String nombre = partesNombre[2];
//  Extraer la inicial del nombre de la persona
char inicialNombre = N.charAt(0);
//  Extraer las dos primeras letras del apellido paterno
String letrasPaterno = paterno.substring(0, 2);
 //  Extraer la inicial del apellido materno
char inicialMaterno = materno.charAt(0);
 //  Formar el RFC con las letras antes obtenidas
String rfcLetras = letrasPaterno + inicialMaterno + inicialNombre;
// Manipular la fecha de nacimiento (extraer año, mes y día)
String[] partesFecha = Fecha.split("/");
String dia = partesFecha[0];
String mes = partesFecha[1];
String anio = partesFecha[2];
// Formar el RFC agregando la fecha en orden año, mes, día (aa/mm/dd)
String rfcCompleto = rfcLetras + anio + mes + dia;
 // Imprimir el RFC del usuario 
System.out.println("\nEl RFC generado es: " + rfcCompleto);


}
}
