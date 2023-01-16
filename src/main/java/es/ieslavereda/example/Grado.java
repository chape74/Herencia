package es.ieslavereda.example;

public enum Grado {
    ASIR_PRIMERO(1,"ASIR"),
    ASIR_SEGUNDO(2,"ASIR"),
    DAM_PRIMERO(1,"DAM"),
    DAM_SEGUNDO(2,"DAM"),
    DAW_PRIMERO(1,"DAW"),
    DAW_SEGUNDO(2,"DAW"),
    SMR_PRIMERO(1,"SMR"),
    SMR_SEGUNDO(2,"SMR");

    private final int curso;
    private final String tipoGrado;

    Grado(int curso, String tipoGrado) {
        this.curso = curso;
        this.tipoGrado = tipoGrado;
    }

    public int getCurso() {
        return curso;
    }

    public String getTipoGrado() {
        return tipoGrado;
    }

    @Override
    public String toString() {
        return curso +"º "+ tipoGrado;
    }
}
