
public class Jefe_area extends Administrativo{

    public Jefe_area(int codigo, String nombre, String apllidos) {
        super(codigo, nombre, apllidos);
    }



    @Override
    public void Asistencia() {
     System.out.println("SOY PUNTUAL A TODOS MIS AREAS");   
    }

    @Override
    public void Hacer() {
     System.out.println("ESTOY EN EL AREA DE BECA 18");   
    }

    @Override
    public void Etudiar() {
      System.out.println("YO ESTUDIO LA BIBLIA");  
    }

   
}
