package exercise;

import java.util.ArrayList;
import java.util.List;

public class Tributo {
    private List<ITribruto> tributes;

    public Tributo() {
        this.tributes = new ArrayList<>();
    }

    public void addTributavel(ITribruto tribute){
        tributes.add(tribute);
    }

    public Double caclTributo(){
        Double totalValue = 0.0;
        for (ITribruto it : tributes) {
            totalValue += it.getValorTributo();
        }
        return totalValue;
    }

    public void exibeTodos(){
        for (ITribruto it : tributes) {
            System.out.println(it.toString());
        }
    }

    @Override
    public String toString() {
        return "Tributos:" +tributes;
    }

    public List<ITribruto> getTributes() {
        return tributes;
    }

    public void setTributes(List<ITribruto> tributes) {
        this.tributes = tributes;
    }
}
