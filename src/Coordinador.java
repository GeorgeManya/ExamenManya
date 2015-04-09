
public class Coordinador extends Academico {

    public Coordinador(int codigo, String nombre, String apllidos) {
        super(codigo, nombre, apllidos);
    }

 


    @Override
    public void Asistencia() {
        System.out.println("SOY PUNTUAL A MIS REUNIONES");
    }

    @Override
    public void Hacer() {
        System.out.println("ESTOY EN REUNION");
    }

    @Override
    public void Etudiar() {
        System.out.println("ESTUDIO LA BIBLIA");
    }

   
}
