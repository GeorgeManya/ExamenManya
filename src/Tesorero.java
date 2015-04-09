
public class Tesorero extends Administrativo{

    public Tesorero(int codigo, String nombre, String apllidos) {
        super(codigo, nombre, apllidos);
    }


    @Override
    public void Asistencia() {
        System.out.println("SOY PUNTUAL CON MIS BALANCES");
    }

    @Override
    public void Hacer() {
        System.out.println("ESTOY SACANDO MI BALANCE");
    }

    @Override
    public void Etudiar() {
        System.out.println("YO ESTUDIO LA BIBLIA");
    }

    
    
}
