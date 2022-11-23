package TestLabSP;

public class Subgrupa extends Grupa{

    protected final String numeSubgrupa;

    public Subgrupa(String numeAn, String numeGrupa, String numeSubgrupa) {
        super(numeAn, numeGrupa);
        this.numeSubgrupa = numeSubgrupa;
    }

    public Subgrupa(String numeGrupa, String numeSubgrupa, ElementComp... listaElemente) {
        super(numeGrupa, listaElemente);
        this.numeSubgrupa = numeSubgrupa;
    }

    public String getNumeSubgrupa() {
        return numeSubgrupa;
    }

    @Override
    public void afiseazaElementul() {
        super.afiseazaElementul();

        System.out.println("\t"+"\t"+ numeSubgrupa);
    }
}
