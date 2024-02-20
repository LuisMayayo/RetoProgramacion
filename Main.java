package CHALLENGEcine.challenge2;

public class Main {

public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("El Padrino", 180, 18, "Francis Ford Coppola");
        Sala sala = new Sala(10.0, pelicula, 8, 9);

        // Creamos espectadores
        Espectador espectador1 = new Espectador("Juan", 25, 15.0);
        Espectador espectador2 = new Espectador("Maria", 16, 8.0);
        Espectador espectador3 = new Espectador("Pedro", 30, 12.0);

        // Los sentamos en la sala
        sala.sentarEspectador(espectador1);
        sala.sentarEspectador(espectador2);
        sala.sentarEspectador(espectador3);
        }
}

