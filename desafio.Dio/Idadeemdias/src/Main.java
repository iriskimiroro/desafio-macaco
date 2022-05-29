import desafios.funcionarios.Consultor;
import desafios.funcionarios.Vendedor;

public class Main {
  public static void main(String[] args) {
    private static final Consultor CONSULTOR = new Consultor (  "Consultor",   112428774L,    100.5d, 10);
    Vendedor vendedor = new Vendedor("Camila Vendedora", 123456789L, 10d, 5);
    System.out.println(vendedor.calcularSalario());
    Consultor consultor = new Consultor("Consultor", 789456123L, 100.5d, 10);
    System.out.println(consultor.calcularSalario());
}
}
