import desafios.Macaco;

public class Main {
   public static void main(String[] args) {
     
 
     Macaco macaco1 = new Macaco();
     Macaco macaco2 = new Macaco();
     macaco1.comer("banana");
     macaco1.comer("banana");
     macaco1.comer("banana");
     macaco2.comer("pêra");
     macaco2.comer("uva");
     macaco2.comer("maçã");

     System.out.println("------");
     
     macaco1.digerir();
     macaco1.digerir();
     macaco1.digerir();
     macaco2.digerir();
     macaco2.digerir();
     macaco2.digerir();
     macaco2.digerir();
 
    
   }
