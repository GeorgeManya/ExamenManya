
public class Contador extends Administrativo{

    public Contador(int codigo, String nombre, String apllidos) {
        super(codigo, nombre, apllidos);
    }

 

    @Override
    public void Asistencia() {
     System.out.println("SOY PUTUAL CON MIS BALANCES");   
    }

    @Override
    public void Hacer() {
      System.out.println("ESTOY CONTANDO BILLETES");  
    }

    @Override
    public void Etudiar() {
      System.out.println("YO ESTUDIO LA BIBLIA");  
    }

   
    
}
