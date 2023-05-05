
package co.com.kt.ventas;


public class PruebaMascota {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();
        mascota1.id_mascota = 1;
        mascota1.nombre = "Lucas";
        mascota1.especie = "Perro";
        mascota1.raza = "Golden Retriever";
        mascota1.estado = "Saludable";
        mascota1.dueno = "Sebastian Pinzon";        
        mascota1.desplegarInformacion();               
    }
}
