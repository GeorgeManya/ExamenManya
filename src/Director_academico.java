
public class Director_academico extends Academico{

    public Director_academico(int codigo, String nombre, String apllidos) {
        super(codigo, nombre, apllidos);
    }

  
   
    @Override
    public void Asistencia() {
        System.out.println("SOY PUNTUAL A LAS REUNIONES");
    }

    @Override
    public void Hacer() {
        System.out.println("ESTOY EN FACEBOOK");
    }

    @Override
    public void Etudiar() {
        System.out.println("YO ESTUDIO LA BIBLIA");
    }

    
    
}
