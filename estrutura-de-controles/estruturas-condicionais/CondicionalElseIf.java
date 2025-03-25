public class CondicionalElseIf {
    public static void main(String[] args) {
        int nota = 85;

        if (nota >= 90) {
            System.out.println("Aprovado com excelência!");
        } else if (nota >= 70) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
