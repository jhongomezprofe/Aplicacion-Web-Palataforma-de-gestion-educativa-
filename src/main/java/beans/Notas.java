package beans;
public class Notas {
    private int ID_NOTA;
    private String ID_ASIGNATURA;
    private String NOTA_DEFINITIVA;
    private int ID_ESTUDIANTE;

    public Notas(int ID_NOTA, String ID_ASIGNATURA, String NOTA_DEFINITIVA, int ID_ESTUDIANTE) {
        this.ID_NOTA = ID_NOTA;
        this.ID_ASIGNATURA = ID_ASIGNATURA;
        this.NOTA_DEFINITIVA = NOTA_DEFINITIVA;
        this.ID_ESTUDIANTE = ID_ESTUDIANTE;
    }

    public int getID_NOTA() {
        return ID_NOTA;
    }

    public void setID_NOTA(int ID_NOTA) {
        this.ID_NOTA = ID_NOTA;
    }

    public String getID_ASIGNATURA() {
        return ID_ASIGNATURA;
    }

    public void setID_ASIGNATURA(String ID_ASIGNATURA) {
        this.ID_ASIGNATURA = ID_ASIGNATURA;
    }

    public String getNOTA_DEFINITIVA() {
        return NOTA_DEFINITIVA;
    }

    public void setNOTA_DEFINITIVA(String NOTA_DEFINITIVA) {
        this.NOTA_DEFINITIVA = NOTA_DEFINITIVA;
    }

    public int getID_ESTUDIANTE() {
        return ID_ESTUDIANTE;
    }

    public void setID_ESTUDIANTE(int ID_ESTUDIANTE) {
        this.ID_ESTUDIANTE = ID_ESTUDIANTE;
    }

    @Override
    public String toString() {
        return "Notas{" + "ID_NOTA=" + ID_NOTA + ", ID_ASIGNATURA=" + ID_ASIGNATURA + ", NOTA_DEFINITIVA=" + NOTA_DEFINITIVA + ", ID_ESTUDIANTE=" + ID_ESTUDIANTE + '}';
    }
    
    
}
