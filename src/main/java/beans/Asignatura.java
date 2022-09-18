package beans;
public class Asignatura {
    private int ID_ASIGNATURA;
    private String NOMBRE;

    public Asignatura(int ID_ASIGNATURA, String NOMBRE) {
        this.ID_ASIGNATURA = ID_ASIGNATURA;
        this.NOMBRE = NOMBRE;
    }

    public int getID_ASIGNATURA() {
        return ID_ASIGNATURA;
    }

    public void setID_ASIGNATURA(int ID_ASIGNATURA) {
        this.ID_ASIGNATURA = ID_ASIGNATURA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "ID_ASIGNATURA=" + ID_ASIGNATURA + ", NOMBRE=" + NOMBRE + '}';
    }
    
}
