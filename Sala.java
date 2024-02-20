package CHALLENGEcine.challenge2;

import java.util.Random;

public class Sala {
    private double precio;
    private Pelicula pelicula;
    private Asientos[][] asientos;


    //CONSTRUCTOR (PARAMETRIZADO)
    public Sala(double precio, Pelicula pelicula, int numeroF, int letraC){
        this.precio=precio;
        this.pelicula=pelicula;
        rellenarsala(numeroF, letraC);
    }



    // CREAR SET Y GET
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPelicula(Pelicula pelicula){
        this.pelicula=pelicula;
    }
    public Pelicula getPelicula(){
        return this.pelicula;
    }



    // Método para rellenar la sala con asientos
    public void rellenarsala(int numeroF, int letraC){
        this.asientos = new Asientos[numeroF][letraC];
        for (int i = 0; i < numeroF; i++) {
            for (int j = 0; j < letraC; j++) {
                this.asientos[i][j] = new Asientos(i + 1, (char)('A' + j));
            }
        }
    }

    public boolean hayEspacioLibre() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                if (!asientos[i][j].estaOcupado()) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean sentarEspectador(Espectador espectador) {
        if (!hayEspacioLibre() || !pelicula.esAptoParaEdad(espectador.getEdad()) || espectador.getDinero() < precio) {
            return false;
        }

        Random rand = new Random();
        int numeroF, letraC;
        do {
            numeroF = rand.nextInt(asientos.length);
            letraC = rand.nextInt(asientos[0].length);
        } while (asientos[numeroF][letraC].estaOcupado());

        asientos[numeroF][letraC].ocuparAsiento(espectador);
        return true;
    }
}

