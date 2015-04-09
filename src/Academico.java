
public abstract class Academico implements Persona {
     int codigo;
     String nombre,apllidos;

    public Academico(int codigo, String nombre, String apllidos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apllidos = apllidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApllidos() {
        return apllidos;
    }

    public void setApllidos(String apllidos) {
        this.apllidos = apllidos;
    }

    
   
    

    }
    
    

