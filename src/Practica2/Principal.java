
package Practica2;

public class Principal {

    public static void main(String[] args) {
     Cliente cli=new Cliente();
     cli.setNombre("ALONDRA");
     cli.setEdad(18);
     cli.setDNI("7056345");
     
     ClsCliente cls=new ClsCliente(cli);
     cls.datos();
     cls.comprarPAN();
     cls.comprarARROZ();
     cls.comprarACEITE();
     cls.Gracias();
     
    
    
}
}

