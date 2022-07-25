public class TesteEmpregado {

    public static void main(String[] args) {

        Empregado e1 = new Empregado();
        e1.nome = "João";
        e1.salario = 5400.00;
        e1.cargo = "Analista de Sistemas";

        Empregado e2 = new Empregado();
        e2.nome = "Julian";
        e2.cargo = "ajudante de papai-noel";
        e2.salario = 7752.00;

        e1.reajustarSalario(15);
        e1.exibirReajuste();

        e2.reajustarSalario(42);
        e2.exibirReajuste();

    }
}
