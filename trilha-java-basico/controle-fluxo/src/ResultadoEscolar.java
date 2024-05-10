public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        int nota = 10;

        // Controle de Fluxo através de Condição Encadeada
        if(nota >= 7) {
            System.out.println("Aprovado");
        }
        else if (nota >= 5 && nota < 7){
            System.out.println("Prova Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
        
        // Controle Através de Condição Ternária
        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado"; 
        System.out.println(resultado);

        // Controle Através de Switch Case
        String sigla = "M";
        switch (sigla) {
            case "P": {
                    System.out.println("Pequeno");
                    break;
                }
            case "M": {
                System.out.println("Médio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default:
                break;
        }
    }

}
