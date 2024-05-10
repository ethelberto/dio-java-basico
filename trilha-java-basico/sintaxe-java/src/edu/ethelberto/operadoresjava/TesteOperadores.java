package edu.ethelberto.operadoresjava;

public class TesteOperadores {

    public static void main(String[] args) {
        String concatenacao = "?";
        // O Java a partir do momento que identifica um caracter ele para de efetuar soma e passa a concatenar
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        // A exceção é quando existe operações em evidêcias
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}
