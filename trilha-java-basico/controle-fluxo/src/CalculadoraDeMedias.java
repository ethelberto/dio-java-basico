import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        Double media = calcularMediaDaTurma(alunos, scan);

        System.out.printf("Média da Turma %d", media);
    }

    public static Double calcularMediaDaTurma(String[] alunos, Scanner scanner) {
        Double soma = 0.0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            Double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }

}
