package TestLabSP;

public class Grupa extends AnUniversitar{
    protected final String numeGrupa;

    public Grupa(String numeAn, String numeGrupa) {
        super(numeAn);
        this.numeGrupa = numeGrupa;
    }

    public Grupa(String numeGrupa, ElementComp... listaElemente) {
        super(listaElemente);
        this.numeGrupa = numeGrupa;
    }

    public String getNumeGrupa() {
        return numeGrupa;
    }

    @Override
    public void afiseazaElementul() {
        super.afiseazaElementul();

        System.out.println("\t"+ numeGrupa);
    }
}
