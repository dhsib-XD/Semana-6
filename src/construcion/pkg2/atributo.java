package atributo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author CarlosXl
 */
public class atributo {
    String escritor, Titulo;
    Double Precio, identificacion;
    
    public atributo(String Titulo, String Autor, double Precio, double ISBN){
        this.Titulo = Titulo;
        this.escritor = Autor;
        this.Precio = Precio;
        this.identificacion = ISBN;
    }
    
    public void DetallesLibro(){
        System.out.println(Titulo + "\n Autor: " + escritor + "\n Codigo (ISBN): " + identificacion + "\n Precio: Lps." + Precio);
    }
}