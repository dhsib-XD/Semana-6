package reyesoscar_actividadsemana6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;


public class Libro {
    
    public static atributo[] A = new atributo[6];
     
    public static void Libreria(){
        for (int i = 0; i < 6; i++){
            System.out.println((i+1) + " " +A[i].Titulo);
        }
    }
    
    public static void main(String[] args) {
        //Diccionario
        double Edad; int Escoger;
        Scanner S = new Scanner(System.in);
        
            //Definir Libreria
            A[0] = new atributo("Meditaciones", "Marco Aurelio", 200, 1493949399);
            A[1] = new atributo("Paradise Lost", "John Milton", 350, 1593848193);
            A[2] = new atributo("El arte de la guerra", "Sun Tzu", 100, 137481938);
            A[3] = new atributo("Dracula", "Bram Stoker", 150, 1483849123);
            A[4] = new atributo("Las Aventuras de Sherlock Holmes", "Arthur Conan Doyle", 200, 1493949399);
            A[5] = new atributo("Anna Karenina", "Leo Tolstoy", 150, 1939928349);
            
            
        
            //Entrada - Pregunta edad para calcular descuento
            System.out.println("Bienvenido a la Libreria \n \nLibros Disponibles: \n");
            Libreria();
            System.out.println("Elegir: ");
            Escoger = S.nextInt();

                //Presenta libro escogido
                A[Escoger - 1].DetallesLibro();
       
            //Edad para calcular descuento
            System.out.println("Ingrese su edad: ");
            Edad = S.nextDouble();
            
            if (60 > Edad){
                Edad = 0.10;
            }
            else if (Edad > 60){
                Edad = 0.25;
            }
            
           
            A[Escoger - 1].Precio = A[Escoger -1].Precio - (A[Escoger - 1].Precio * Edad);
        
        //Salida - Imprime precio de libro vendido    
        A[Escoger -1].DetallesLibro();
        
    }
    
}
