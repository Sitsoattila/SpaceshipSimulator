import java.util.Scanner;

public class AstilleroEspacial {

     public static void main(String[] args) {
         int opcionMenu = 0; // variable que maneja la opción del menú
         boolean mostrarMenu = true; // variable que automatiza que se muestre el menú constantemente
         String nombre="";
         String matriculaGalactica = "";
         float aceleracion;
         Scanner lector = new Scanner(System.in);

         System.out.println("---------------------------------------------------------------------------------");
         System.out.println("<><><><><><><><><><><><><><><>ESTÁS EN EL ASTILLERO<><><><><><><><><><><><><><><>");
         System.out.println("---------------------------------------------------------------------------------");
         System.out.print("Introduce el nombre que tendrá tu nave: ");
         nombre = lector.nextLine();
         System.out.print("Introduce la matrícula galáctica de tu nave: ");
         matriculaGalactica = lector.nextLine();
         System.out.print("Introduce el valor de aceleración de tu nave: ");
         aceleracion = lector.nextFloat();
         System.out.println("");

         SpaceShip nuevaNave = new SpaceShip(nombre,matriculaGalactica,aceleracion);
         System.out.println("--------------------------");
         System.out.println("Su nave ha sido fabricada:" + "\n"
                 + "--------------------------"
                 + "\n" + "Nombre: " + nuevaNave.nombre
                 + "\n" + "Matrícula: " + nuevaNave.matriculaGalactica
                 + "\n" + "Aceleración: " + nuevaNave.aceleracion);
         System.out.println("");

         while(mostrarMenu){
             System.out.println("-----------------------------------------");
             System.out.println("Seleccione que acción hacer con " + nuevaNave.nombre);
             System.out.println("-----------------------------------------");
             System.out.println("\t" + "1. Mostrar representación de " + nuevaNave.nombre);
             System.out.println("\t" + "2. Acelerar con " + nuevaNave.nombre);
             System.out.println("\t" + "3. Frenar con " + nuevaNave.nombre);
             System.out.println("\t" + "4. Parar de emergencia con " + nuevaNave.nombre);
             System.out.println("\t" + "Q. Salir del astillero espacial");
             System.out.println("");
             System.out.print("\t" + "¿Cuál es su elcción?: ");
             opcionMenu = lector.nextInt();


             switch (opcionMenu){
                 case 1:
                     System.out.println("Ha seleccionado vizualizar una representación de su nave");
                     break;

                 case 2:
                     System.out.println("Acelerando...");
                     nuevaNave.speedUp();
                     System.out.println("La nueva velocidad ahora es: " + nuevaNave.getVelocidadX() + "km/h");
                     System.out.println("La nava se encuentra en la: " + nuevaNave.getCoordenadaX() + " coordenada en X");
                     break;

                 case 3:
                     System.out.println("Frenando...");
                     nuevaNave.brake();
                     System.out.println("La nueva velocidad ahora es: " + nuevaNave.getVelocidadX() + "km/h");
                     System.out.println("La nava se encuentra en la: " + nuevaNave.getCoordenadaX() + " coordenada en X");
                     break;

                 case 4:
                     System.out.println("Ejecutando parada de emergencia...");
                     nuevaNave.emergencyStop();
                     System.out.println("La nueva velocidad ahora es: " + nuevaNave.getVelocidadX() + "km/h");
                     System.out.println("La nava se encuentra en la: " + nuevaNave.getCoordenadaX() + " coordenada en X");
                     break;

                 case 5:
                     System.out.println("Probando load");

                     break;

                 default:
                     System.out.println("El valor introducido no corresponde a ninguna opción");
                     break;

             }
         }
     }
}
