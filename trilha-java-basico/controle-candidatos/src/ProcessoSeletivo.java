import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);

        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Forma interação com for: ");
        imprimirSelecionados(candidatos);

        System.out.println("Forma abreviada de interação for each: ");
        for(String candidato: candidatos) {
            imprimirSelecionados(candidato);
            entrandoEmContato(candidato);
        }
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido ) {
            System.out.println("Ligar para o Candidato");
        } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com uma contraproposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }

    static void imprimirSelecionados(String[] candidatos) {
  
        System.out.println("Imprimindo a lista de candidados selecionados:");
        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é o " + candidatos[indice]);
        }
    }

    static void imprimirSelecionados(String candidato) {
         System.out.println("O candidato selecionado foi: " + candidato);
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentativasRealizadas++;
            } else {
                 System.out.println("Contato realizado com sucesso");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "ª tentativa.");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", numero maximo de tentativa " + tentativasRealizadas + " realizada.");
        }
    }

    // método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
}
