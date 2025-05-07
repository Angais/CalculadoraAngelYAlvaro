/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocalculadora;

import java.util.Scanner;

/**
 *
 * @author AngelDaw
 */
public class ProyectoCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Elige la operación que quieras realizar: 1.Sumar  2.Restar");
        System.out.println("4.Multiplicar");
        int opcion = sc.nextInt();

        double resultado;
        switch (opcion) {
            case 1:
                resultado = calc.sumar(num1, num2);
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = calc.restar(num1, num2);
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 4:
                resultado = calc.multiplicacion(num1, num2);
                System.out.println("Resultado de la multiplicacion: " + resultado);
                break;
            default:
                System.out.println("Opción no válida");
        }
        sc.close();
    }

}
