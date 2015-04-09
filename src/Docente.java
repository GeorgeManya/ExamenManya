
public class Docente extends Academico{

    public Docente(int codigo, String nombre, String apllidos) {
        super(codigo, nombre, apllidos);
    }

 

    @Override
    public void Asistencia() {
      System.out.println("ES PUNTUAL A CLASES");
    }

    @Override
    public void Hacer() {
        System.out.println("ESTOY HACIENDO MI CLASE");
    }

    @Override
    public void Etudiar() {
        System.out.println("ESTUDIO LA BIBLIA");
    }

  
   
    
}
