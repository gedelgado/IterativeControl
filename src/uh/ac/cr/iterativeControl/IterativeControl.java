package uh.ac.cr.iterativeControl;

import java.util.Scanner;

public class IterativeControl {
    Scanner scanner;
    int option;

    public IterativeControl(){
        option=0;
        scanner=new Scanner(System.in);
    }
    public void check(){ // inputs for the user and options.
        do { //
            System.out.println("¿How many times do you want to print Hello world?");
            int amount = scanner.nextInt();
            System.out.println("which option do you want to select" +"\n" +"1-Bucle while" + "\n" + "2-Bucle for" + "\n" + "3-bucle do while"+ "\n"+"4-close");
            option = (int) scanner.nextFloat();
            int cont = 0;

            switch (option) {
                case 1: // Bucle while

                    while (cont<amount) {
                        System.out.println("HELLO WORLD");
                        cont++;
                    }
                    break;
                case 2:    // bucle for
                    System.out.println("2-Bucle for");
                    for (cont = 0; cont < amount; cont++){
                        System.out.println("HELLO WORLD");
                    }
                    break;
                case 3:
                    do {   //Bucle do while
                        System.out.println("Hello world");
                        cont++;
                    }while (cont<amount);
                    break;

                    case 4: // finish program
                    System.out.println("Program finished");
                    break;
                default:
                    System.out.println("Error, ingrese un valor dentro del rango 1 a 4");
                    break;
                }

            }while (option<4);

        }
    }

