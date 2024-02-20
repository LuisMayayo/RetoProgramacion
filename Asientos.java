package CHALLENGEcine.challenge2;

public class Asientos {
    private char letraC;
    private int numeroF;
    private boolean ocupado;

    private Espectador espectador;

    //CONSTRUCTOR
    public Asientos(int fila, char columna) {
        this.numeroF = numeroF;
        this.letraC = letraC;
        this.ocupado = false;
    }

    //OCUPADO
    public boolean estaOcupado() {
        return ocupado;
    }
    //OCUPAR ASIENTO
    public void ocuparAsiento(Espectador espectador) {
        this.espectador = espectador;
        this.ocupado = true;
        System.out.println("El espectador " + espectador.nombre + " se ha sentado en el asiento " + numeroF + letraC);
    }


    // CREAR SET Y GET
    public char getLetraC() {
        return letraC;
    }

    public void setLetraC(char letraC) {
        this.letraC = letraC;
    }

    public int getNumeroF() {
        return numeroF;
    }

    public void setNumeroF(int numeroF) {
        this.numeroF = numeroF;
    }

    public boolean isDisponible() {
        return ocupado;
    }

    public void setDisponible(boolean disponible) {
        this.ocupado = disponible;
    }
}
