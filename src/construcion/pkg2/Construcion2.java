/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package construcion.pkg2;

/**
 *
 * @author CarlosXl
 */
public class Construcion2 {

    /**
     * @param args the command line arguments
     */
        
    public static void orden(){
        for (int x = 0; x < 6; x++) {
            for (int z = 1; z < 6; z++) {
                if(datos[z-1].getEdad() >= datos[z].getEdad()){
                    temp = datos[z];
                    datos[z] = datos[z-1];
                    datos[z-1] = temp;
                }
            }
        }
    }
    
    public static void mostrar(){
        for (int i = 0; i < 6; i++) {
            System.out.println("Nombre: " + datos[i].getNombre());
            System.out.println("Edad: " + datos[i].getEdad());
            System.out.println("------------------");
        }
    }
    
    public static People datos[] = new People [6];
    public static People  temp = new People ();
    public static void main(String[] args) {
        
        // TODO code application logic here
        datos[0] = new People ();
        datos[0].setNombre("Carlos");
        datos[0].setEdad(17);
        
        datos[1] = new People ();
        datos[1].setNombre("Nelson");
        datos[1].setEdad(19);
        
        datos[2] = new People ();
        datos[2].setNombre("Oscar");
        datos[2].setEdad(15);
        
        datos[3] = new People ();
        datos[3].setNombre("Alfonso");
        datos[3].setEdad(30);
        
        datos[4] = new People ();
        datos[4].setNombre("Camila");
        datos[4].setEdad(25);
        
        datos[5] = new People ();
        datos[5].setNombre("Ponce");
        datos[5].setEdad(100);
        
        mostrar();
        orden();
        System.out.println("=================ORDENADO===============");
        mostrar();
        
    }
        
    
        
        
        

        
        
    
    

}