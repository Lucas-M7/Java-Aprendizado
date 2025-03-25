public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Bem-vindo(a)! Você está explorando as Anatomias das Classes!");

        final String BR = "Brasil"; // final: usado para que o valor de uma variável nunca seja modificada

        String primeiroNome = "Lucas";
        String segundoNome = "Mateus";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
            return "O nome do usuário é: " + primeiroNome.concat(" ").concat(segundoNome);

    }
}