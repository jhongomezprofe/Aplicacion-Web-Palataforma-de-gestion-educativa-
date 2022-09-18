package beans;
public class Usuarios {
    private int ID_USUARIOS;
    private String NOMBRE;
    private String APELLIDO;
    private String ROL;
    private String ID_ASIGNATURA;
    private int ID_CURSO;
    private String EMAIL;
    private String CONTRASENA;
    private boolean ACTIVO;   

    public Usuarios(int ID_USUARIOS, String NOMBRE, String APELLIDO, String ROL, String ID_ASIGNATURA, int ID_CURSO, String EMAIL, String CONTRASENA, boolean ACTIVO) {
        this.ID_USUARIOS = ID_USUARIOS;
        this.NOMBRE = NOMBRE;
        this.APELLIDO = APELLIDO;
        this.ROL = ROL;
        this.ID_ASIGNATURA = ID_ASIGNATURA;
        this.ID_CURSO = ID_CURSO;
        this.EMAIL = EMAIL;
        this.CONTRASENA = CONTRASENA;
        this.ACTIVO = ACTIVO;
    }

    public int getID_USUARIOS() {
        return ID_USUARIOS;
    }

    public void setID_USUARIOS(int ID_USUARIOS) {
        this.ID_USUARIOS = ID_USUARIOS;
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

    public String getROL() {
        return ROL;
    }

    public void setROL(String ROL) {
        this.ROL = ROL;
    }

    public String getID_ASIGNATURA() {
        return ID_ASIGNATURA;
    }

    public void setID_ASIGNATURA(String ID_ASIGNATURA) {
        this.ID_ASIGNATURA = ID_ASIGNATURA;
    }

    public int getID_CURSO() {
        return ID_CURSO;
    }

    public void setID_CURSO(int ID_CURSO) {
        this.ID_CURSO = ID_CURSO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getCONTRASENA() {
        return CONTRASENA;
    }

    public void setCONTRASENA(String CONTRASENA) {
        this.CONTRASENA = CONTRASENA;
    }

    public boolean isACTIVO() {
        return ACTIVO;
    }

    public void setACTIVO(boolean ACTIVO) {
        this.ACTIVO = ACTIVO;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "ID_USUARIOS=" + ID_USUARIOS + ", NOMBRE=" + NOMBRE + ", APELLIDO=" + APELLIDO + ", ROL=" + ROL + ", ID_ASIGNATURA=" + ID_ASIGNATURA + ", ID_CURSO=" + ID_CURSO + ", EMAIL=" + EMAIL + ", CONTRASENA=" + CONTRASENA + ", ACTIVO=" + ACTIVO + '}';
    }
    
    
}
