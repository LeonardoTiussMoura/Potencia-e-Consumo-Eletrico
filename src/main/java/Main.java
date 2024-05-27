public class Main {
  public static void main(String[] args) {
    System.out.println("1) Uma TV de 200 watts fica ligada aproximadamente 5h diariamente. Determine o consumo elétrico mensal da TV.");
    System.out.println("");
    System.out.println("Coloque a potência do aparelho (em Watts):");
    int potencia = 200;
    System.out.print(potencia);
    System.out.println(" Watts");
    System.out.println("");
    System.out.println("Coloque o tempo que foi/será utilizado o aparelho (em horas):");
   int tempo = 5;
    System.out.print(tempo);
    System.out.println("h");
    System.out.println("");
    System.out.println("Fórmula= Potência . Tempo ÷ 1000");
    int mes = 30;
    System.out.println("");
    System.out.print(potencia);
    System.out.print(" . ");
    System.out.print(tempo);
    System.out.print(" . ");
    System.out.println(mes);
    System.out.println("------------");
    System.out.println("    1000");
    System.out.println("");
    System.out.println("O resultado da fórmula para esse exercício será:");
    int multiplicar = potencia*tempo*mes;
    int dividir = multiplicar/1000;
    System.out.print("O consumo da TV por mês será ");
    System.out.print(dividir);
    System.out.print("Kw");
  }
}