
package co.com.kt.ventas;


public class Mascota {
    int id_mascota;
    String nombre;
    String especie;
    String raza;
    String dueno;
    String estado;   
    public void desplegarInformacion(){
        System.out.println("Codigo: "+ id_mascota );
        System.out.println("Nombre: "+ nombre);
        System.out.println("Especie: "+ especie);
        System.out.println("Raza: "+ raza);
        System.out.println("Estado: "+ estado);
        System.out.println("Dueño: "+ dueno);        
    }
}
