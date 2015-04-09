
public class Gerente extends Administrativo{

    public Gerente(int codigo, String nombre, String apllidos) {
        super(codigo, nombre, apllidos);
    }

    @Override
    public void Asistencia() {
        System.out.println("ASISTO A REUNIONES");
    }

    @Override
    public void Hacer() {
      System.out.println("DOY ORDENES A MIS COLABORADORES");  
    }

    @Override
    public void Etudiar() {
       System.out.println("YO ESTUDIO LA BIBLIA"); 
    }

    
    
}
