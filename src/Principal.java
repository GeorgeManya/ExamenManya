
import java.util.ArrayList;


public class Principal {
public static ArrayList<Academico> univer = new ArrayList<Academico>();
public static ArrayList<Administrativo> admi = new ArrayList<Administrativo>();
public static void main(String[] args) {
  Academico doc= new Docente(1,"Juan","Jimenez");    
  Academico coo= new Coordinador(2,"Pedro","Garcia");  
  Academico dir= new Director_academico(3,"Julio","Mendoza");
  
  univer.add(doc);
  univer.add(coo);
  univer.add(dir);
  System.out.println("Personal Academico de la Universidad");
  System.out.println();
  for(Academico univer: univer)
  {
    System.out.println(univer.getCodigo()+" "+univer.getNombre()+" "+univer.getApllidos());
    univer.Asistencia();
    univer.Hacer();
    univer.Etudiar();
    System.out.println(" ");
    System.out.println();
  }
  
      
  Administrativo ger=new Gerente(123,"Jorge","Paredes");
  Administrativo teso=new Tesorero(456,"Josias","Alcantara");
  Administrativo cont=new Contador(789,"Edwin","Pinedo");
  Administrativo jefe=new Jefe_area(898,"George","Manya");
  
  admi.add(ger);
  admi.add(teso);
  admi.add(cont);
  admi.add(jefe);
  
  System.out.println("Personal Administrativo de la Universidad");
  System.out.println();
  for(Administrativo admi: admi)
    {
        System.out.println(admi.getCodigo()+" "+admi.getNombre()+" "+admi.getApllidos());
        admi.Asistencia();
        admi.Hacer();
        admi.Etudiar();
        System.out.println(" ");
  
  
    }
   }
}


