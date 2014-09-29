
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Javier
 */
public class Ejercicio2 {
  
  
    static Scanner scanner = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
    static Vector <Integer> v;
    static int nentrevistas;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    do{
    System.out.println("cuantas personas vamos a entrevistar");
    nentrevistas=leerInt();
    if (nentrevistas>50 || nentrevistas<=0)
         System.out.println("El numero maximo es 50");
    }while(nentrevistas>50 || nentrevistas<=0);
    v=new Vector<Integer> (100);
   v=introducirdatos(nentrevistas);
   porcentaje(v);
   
  
    
    }
   
  static  Vector <Integer> introducirdatos(int nentrevistas){
    Vector entrevista=new Vector<Integer> (2*nentrevistas);
      int tipo=0;
      int trabajas=0;
    for(int i=0;i<nentrevistas;i++){
        do {
        System.out.println("Eres 1-hombre o 2-mujer");
        tipo=leerInt();
        if ((tipo > 3) || (tipo<=0))
            System.out.println("solo puedes elegir 1-2");
                   
        }while (tipo > 3 || tipo<=0);
        do{
        System.out.println("1 Si trabajas o 2 No trabajas");
        trabajas=leerInt();
         if ((trabajas > 3) || (trabajas<=0))
            System.out.println("solo puedes elegir 1-2");
                   
        }while (trabajas > 3 || trabajas<=0);
        entrevista.add(tipo);
        entrevista.add(trabajas);
    }
  return(entrevista) ; 
  }
 static void porcentaje (Vector<Integer> v)
 { int h=0;
   int f=0;
   for (int i=0; i<v.size();i=i+2)
   {  if (v.elementAt(i)==1)
      h=h+1;
       else
       f=f+1;
   }
   float ch=100*h/(v.size()/2);
   float cm=100*f/(v.size()/2);
   System.out.println("% de hombres="+ch);
   System.out.println("% de mujeres="+cm);
 h=0;
 f=0;
  for (int j=1; j<v.size();j=j+2)
   {  if (1==(int)v.elementAt(j))
      h=h+1;
       else
       f=f+1;
   }
   float ht=100*h/(v.size()/2);
   float mt=100*f/(v.size()/2);
   System.out.println("% de hombres trabajan="+ht);
   System.out.println("% de mujeres que trabajan="+mt);
 }
 
 static int leerInt(){
    
       boolean error=false;
       int numero=0;
       do{
        try{
            error=false;
       
        numero= Integer.valueOf(entrada.readLine()).intValue();}
        catch( NumberFormatException  ex){
            System.out.println("valor incorrecto"+ex);
            error=true;
        } catch(IOException e)
        {
            System.out.println("Error de E/S"+e);
        }
      }while(error);
       return(numero);
 }
 

 }
