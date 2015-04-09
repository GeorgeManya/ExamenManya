
package Practica2;

public class ClsCliente {
    Cliente cl;
  
    public ClsCliente(Cliente cl) {
        this.cl = cl;
    }
 public void datos(){        
    System.out.println(cl.getNombre()+"\t"+"con DNI:"+cl.getDNI()+"\t"+"EDAD:"+cl.getEdad());
    }
 public void comprarPAN(){
 System.out.println("ESTOY COMPRANDO PAN");
 }
 public void comprarARROZ(){
 System.out.println("COMPRANDO ARROZ");
 }
 public void comprarACEITE(){
 System.out.println("COMPRANDO ACEITE");
 }
 public void Gracias(){
 System.out.println("Gracias Por Su Compra");
 }
 }
 

