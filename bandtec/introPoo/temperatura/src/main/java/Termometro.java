public class Termometro {

    int temperaturaAtual;
    int temperaturaMax;
    int temperaturaMin;

    void diminuiTemperatura(int diminuiTemp) {
        temperaturaAtual -= diminuiTemp;
        if (temperaturaAtual < temperaturaMin) {
            temperaturaAtual = temperaturaMin;
        }
    }

    void exibirFahreihheit(int temperaturaNova) {
        temperaturaNova = (int) ((temperaturaAtual * 1.8) + 32);
        System.out.printf("Temperatura atual: %d °F \n", temperaturaNova);
    }

    void temperatura() {
        System.out.printf("Atual: %d °C \n Min: %d °C \n Max: %d °C", temperaturaAtual, temperaturaMin, temperaturaMax);
    }

}
