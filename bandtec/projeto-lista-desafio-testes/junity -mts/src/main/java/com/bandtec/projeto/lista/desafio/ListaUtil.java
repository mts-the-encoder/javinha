package com.bandtec.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        this.inteiros = new ArrayList<>();
    }

    public void add(Integer valor) {
        if (valor == null) {
            //fznd nada;
        } else {
            inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        if (valor == null) {
            //fznd nada;
        } else {
            inteiros.remove(valor);
        }
    }

    public Integer count() {
        return inteiros.size();
    }

    public Integer countPares() {
        List<Integer> pares = new ArrayList();
        for(Integer par : inteiros){
            if(par % 2 == 0) {
                pares.add(par);
            }
        }
        if (pares.isEmpty()){
            return 0;
        } else {
            return pares.size();
        }
    }

    public Integer countImpares() {
        List<Integer> impares = new ArrayList();
        for(Integer impar : inteiros){
            if(impar % 2 == 1) {
                impares.add(impar);
            }
        }
        if (impares.isEmpty()){
            return 0;
        } else {
            return impares.size();
        }
    }

    public Integer somar() {
        Integer total = 0;
        for (Integer sum : inteiros) {
            total += sum;
        }
        if (inteiros.isEmpty()) {
            return 0;
        } else {
            return total;
        }
    }

    public Integer getMaior() {
        Integer maior = Integer.MIN_VALUE;
        for (Integer listAll : inteiros) {
            if (listAll > maior) {
                maior = listAll;
            }
        }
        if (inteiros.isEmpty()) {
            return 0;
        } else {
            return maior;
        }
    }

    public Integer getMenor() {
        Integer menor = Integer.MAX_VALUE;
        for (Integer listAll : inteiros) {
            if (listAll < menor) {
                menor = listAll;
            }
        }
        if (inteiros.isEmpty()) {
            return 0;
        } else {
            return menor;
        }
    }

    public Boolean hasDuplicidade() {
        for (int i = 0; i < inteiros.size(); i++) {
            for (int j = 0; j < inteiros.size(); j++) {
                if (i != j) {
                    if (inteiros.get(i).equals(inteiros.get(j))) {
                        return true;
                    } 
                }
            }
        }
        return false;
    }
}
