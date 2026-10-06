/*
* Introduccion a las ciencias de la computacion 
* Programa de una consulta con doctor de psicologia 
* Martinez Jose Jafet 
* 1.0
*/
// Declaro Scnnerr
import java.util.Scanner;
public class Psicologia {

public static void main (String [] args) {
//Se crea un objeto scanner para leer la entrada del usuario 
Scanner in = new Scanner(System.in);
// Damos la bienvenida al usuario
System.out.println("Bienevenido");
//Declaramos n que es el nombre
String N;
//Preguntamos el nombre del usuario 
System.out.println( "¿Cual es tu nombre?");
//El usuario nos regresa el nombre para poder leerlo
N = in.nextLine();
//Saludamos al usuario por su nombre 
System.out.println("!Hola! "  + N );
// Preguntamos su problema
System.out.println("¿Cual es el problema que tiene? ");
//El usuario nos devuelve el problema para poder leerlo 
String Problema = in.nextLine();
// Se le contesta al usuario
System.out.println("MMMM...ya veo");
System.out.println("Y dime");
//Preguntamos al usuario porque dice que tiene eso 
System.out.println("Porque dices que tienes " + Problema);
//El usuario nos regresa el problema para poder leerlo
String Porque = in.nextLine();
//por ultimo le contestamos al usuario y nos despedimos del usuario 
System.out.println("Muy interesante!!, Hablaremos de ello con mas detalle en la siguiente sesion");


}
}
