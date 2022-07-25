public class BilheteUnico {

    String nome;
    Double saldo;

    void carregar(Double recarga){
        saldo += recarga;
    }
    void usar(){
        saldo -= 4.40;
    }
    void exibirStatus(){
        System.out.printf("Olá %s, seu saldo atual é de: R$%.2f \n", nome, saldo);
    }
}
