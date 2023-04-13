import java.util.Scanner;
/*Hasta este momento llevo lo siguiente: puedo ingresar el nombre de la materia y su calificacion
tambien ya obtengo el promedio. Solo me falta separar el codigo, crear las clases y retornar los valores */
public class Ingresar {
        public static void main(String[] args) {
            Scanner cali = new Scanner(System.in);

            Scanner scanner = new Scanner(System.in);
            String[] materia = {"Fisica ", "Matemáticas 5", "Química 6", "Programación 6", "Algebra 6"};

            for (int i = 0; i < materia.length; i++) {
                System.out.println("Ingrese el nombre de la materia:");
                materia[i] = scanner.next();
            }

            double [] cal = new double[materia.length];
            for (int i = 0; i < materia.length; i++) {
                System.out.println("Ingrese la calificación de la materia de " + materia[i] + ":");
                cal [i] = cali.nextDouble();
            }

            Main m = new Main();
            int size = materia.length;
            double pro = 0;
            for (int i = 0; i < size; i++) {
                pro += cal[i] / size;
                System.out.println("Nombre de materia: " + materia[i] + " ---Calificación de parcial: " + cal[i]);
            }
            System.out.println("Promedio del parcial es: " + m.truncar(pro));

        }
    }


