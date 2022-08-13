package exercise;

public class TesteTributo {
    public static void main(String[] args) {
        Alimento a = new Alimento(10,"doce",90.00,100);
        Perfume p = new Perfume(11,"famoso",95.00,"póros");
        Servico s = new Servico("funciona", 1500.00);
        Tributo t = new Tributo();

        t.addTributavel(p);
        t.addTributavel(a);
        t.addTributavel(s);

        t.exibeTodos();
        System.out.printf("Total dos tributos: %.2f", t.caclTributo());
    }
}
