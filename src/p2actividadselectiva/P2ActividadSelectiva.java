package p2actividadselectiva;

//Programa que encuentra el mayor de 3 numeros

import java.util.Scanner;

public class P2ActividadSelectiva {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();
        System.out.println("Ingrese el tercer número");
        num3 = leer.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El mayor es: " + num1);
            } else {
                System.out.println("El mayor es: " + num3);
            }
        } else if (num2 > num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }

    }

}
