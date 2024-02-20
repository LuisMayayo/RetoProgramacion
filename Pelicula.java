package CHALLENGEcine.challenge2;

public class Pelicula {
    private int duracion;
    private String titulo;
    private int edadMin;
    private String director;

    //CONSTRUCTOR
    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMin = edadMinima;
        this.director = director;
    }

    //APTO EDAD
    public boolean esAptoParaEdad(int edad) {

        return edad >= edadMin;
    }

    //GET Y SET
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdad() {
        return edadMin;
    }

    public void setEdad(int edad) {
        this.edadMin = edad;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
