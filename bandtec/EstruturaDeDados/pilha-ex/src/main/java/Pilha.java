public class Pilha {

    private int[] pilha;
    private int topo;

    public Pilha(int cap) {
        pilha = new int[cap];
        topo = -1;
    }

    public Boolean isEmpty() {
        return this.topo == -1;
    }

    public Boolean isFull() {

        return topo == pilha.length - 1;
    }

    public void push(int info) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        pilha[++topo] = info;
    }

    public int pop() {
        return pilha[topo--];
    }

    public int peek() {
        if (this.isEmpty()) {
            return -1;
        }
        return pilha[topo];
    }

    public void exibir() {
        if (!this.isEmpty()) {
            for (int i = topo; i > 0; i--) {
                System.out.println(pilha[i]);
            }
        }
    }

    public int getTopo() {
        return topo;
    }
}
