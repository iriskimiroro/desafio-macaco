
public class Macaco<bucho, bucho> {
     //atributos
    private String name; //criacao do nome e metodo lista
    private List<String> bucho = new ArrayList <>();

    //Metodos, apl void pois n tem retorno e String pis so pode comer isso
public void comer(String comida) {
  // Size para saber a quat de comida no bucho, limite 3
    if (bucho.size() == 3) {
        System.out.println("Bucho Cheio!");
// senao
  }  else { 
      bucho.add(comida); // metodo da list
  }
 System.out.println(bucho); // imprimir qt no bucho

}
    public void digerir(){
        if (bucho.isEmpty()) {
            System.out.println("Bucho Vazio!");

        } else {
            bucho.remove();
        }
    }
}

