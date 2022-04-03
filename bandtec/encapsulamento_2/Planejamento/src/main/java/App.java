public class App {

    public static void main(String[] args) {

        Planejamento plan1 = new Planejamento("Edifício", "eu", 200, 145);

        plan1.terminarAtividade(145);
        plan1.calcularTempo();
    }
}
