package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code her
        ArbolTriWay arbol = new ArbolTriWay();



        //Hash vec = new Hash(m, bkfr);
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un dato entero: ");
                    int dato = scan.nextInt();

                    if (arbol.insertar(dato)) {
                        System.out.println("Se ingreso el reg");
                    } else {
                        System.out.println("No se ingreso");
                    }
                    break;

                case 2:
                    System.out.println("Ingrese un registro para consultar");
                    int datoBuscar = scan.nextInt();
                    String datoHallado = arbol.buscar(datoBuscar);
                    if (!datoHallado.isEmpty()) {
                        System.out.println("El registro existe y es : "+datoHallado);
                    } else {
                        System.out.println("El registro no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el reg a eliminar: ");
                    int reg=scan.nextInt();
                   // vec.eliminarRegistro(reg);

                    break;
                case 5:
                    arbol.mostrarArbol();
                    break;
                case 4:
                    break;

            }

        } while (opcion != 4);

    }

    public static int menu(){
        int opcion = 4;
        System.out.println("");
        System.out.println("Seleccione: \n1) Ingresar \n2) Consultar \n3) Eliminar REG \n4) Salir \n5) Mostrar matriz");
        opcion = scan.nextInt();
        return opcion;
    }



}
