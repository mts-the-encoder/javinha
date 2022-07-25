import java.util.Scanner;

public class ExerciciosFis {

    public static void main(String[] args) {

        System.out.println("Digite seu nome \n");
        Scanner nomeLeitor = new Scanner(System.in);
        String nome = nomeLeitor.nextLine();

        System.out.println("Informe o tempo (minutos) que passou aquecendo \n");
        Scanner aquecimento = new Scanner(System.in);
        int aquecimentoC = aquecimento.nextInt();

        System.out.println("Informe o tempo (minutos) que passou fznd exercícios aeróbicos (correr, andar, pedalar etc) \n");
        Scanner aerobicos = new Scanner(System.in);
        int aerobicosC = aerobicos.nextInt();

        System.out.println("Informe o tempo (minutos) que passou fznd exercícios de musculação \n");
        Scanner musc = new Scanner(System.in);
        int muscC = musc.nextInt();

        int totalMin = aquecimentoC + aerobicosC + muscC;

        int caloriasAq = aquecimentoC * 12;
        int caloriasAe = aerobicosC * 20;
        int caloriasMu = muscC * 25;

        int totalCal = caloriasAe + caloriasMu + caloriasAq;

        String resultado = String.format("Olá, %s. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias", nome, totalMin, totalCal);

        System.out.println(resultado);
    }
}
