package beans;
public class Estudiantes {
    private int ID_ESTUDIANTE;
    private String NOMBRE;
    private String APELLIDO;
    private int ID_CURSO;
    private boolean ACTIVO;

    public Estudiantes(int ID_ESTUDIANTE, String NOMBRE, String APELLIDO, int ID_CURSO, boolean ACTIVO) {
        this.ID_ESTUDIANTE = ID_ESTUDIANTE;
        this.NOMBRE = NOMBRE;
        this.APELLIDO = APELLIDO;
        this.ID_CURSO = ID_CURSO;
        this.ACTIVO = ACTIVO;
    }

    public int getID_ESTUDIANTE() {
        return ID_ESTUDIANTE;
    }

    public void setID_ESTUDIANTE(int ID_ESTUDIANTE) {
        this.ID_ESTUDIANTE = ID_ESTUDIANTE;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }

    public int getID_CURSO() {
        return ID_CURSO;
    }

    public void setID_CURSO(int ID_CURSO) {
        this.ID_CURSO = ID_CURSO;
    }

    public boolean isACTIVO() {
        return ACTIVO;
    }

    public void setACTIVO(boolean ACTIVO) {
        this.ACTIVO = ACTIVO;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "ID_ESTUDIANTE=" + ID_ESTUDIANTE + ", NOMBRE=" + NOMBRE + ", APELLIDO=" + APELLIDO + ", ID_CURSO=" + ID_CURSO + ", ACTIVO=" + ACTIVO + '}';
    }
    
    
}
