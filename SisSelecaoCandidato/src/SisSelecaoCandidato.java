import java.util.Scanner;

public class SisSelecaoCandidato {
    public static void main(String[] args) {
        // Criando uma instância de Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitação do salário pretendido ao candidato
        System.out.print("Informe o salário pretendido: ");
        double salarioPretendido = scanner.nextDouble();
        
        // Criando uma instância de SisSelecaoCandidato
        SisSelecaoCandidato sis = new SisSelecaoCandidato();
        
        // Chamando o método avaliaCandidato com o salário pretendido informado pelo candidato
        sis.avaliaCandidato(salarioPretendido);
        
        // Fechando o Scanner
        scanner.close();
    }
    
    // Método para avaliar o candidato com base no salário pretendido
    public void avaliaCandidato(double salarioPretendido) {
        // Salário base definido (exemplo)
        double salarioBase = 3500;

        // Condição para avaliar o candidato
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com uma contra proposta.");
        } else {
            System.out.println("Aguardar seleção de novo candidato.");
        }
    }
}
