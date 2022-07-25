public class Empregado {

    String nome;
    String cargo;
    Double salario;

    void reajustarSalario(int porcentagem) {
        salario = ((salario * porcentagem) / 100) + salario;
    }

    void exibirReajuste() {
        System.out.printf("%s, cujo cargo é de %s teve um reajuste salarial" +
                " e agora recebe R$ %.2f \n", nome, cargo, salario);
    }
}
