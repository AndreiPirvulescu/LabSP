package TestLabSP;

import java.util.ArrayList;
import java.util.List;

public class AnUniversitar implements ElementComp{

    protected final String numeAn;

    public AnUniversitar(String numeAn) {
        this.numeAn = numeAn;
    }

    public String getNumeAn() {
        return numeAn;
    }

    private final List<ElementComp> listaElemente = new ArrayList<>();

    public AnUniversitar(ElementComp... listaElemente){
        this.listaElemente.addAll(List.of(listaElemente));
    }

    public void afiseazaElementul(){
        System.out.println();
        listaElemente.forEach(ElementComp::afiseazaElementul);
    }

}
