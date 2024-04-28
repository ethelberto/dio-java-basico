package edu.ethelberto.anatomiaclasses;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Ethelberto";
        String sobrenome = "Mello";

        String nomeCompleto = nomeCompleto (primeiroNome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String sobrenome) {
        return "Resultado do Método: " + primeiroNome.concat(" " ).concat(sobrenome);
    }
}
