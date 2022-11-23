package TestLabSP;

public class Student extends Subgrupa{
    protected final String nume;
    protected final String email;

    public Student(String numeAn, String numeGrupa, String numeSubgrupa, String nume, String email) {
        super(numeAn, numeGrupa, numeSubgrupa);
        this.nume = nume;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void afiseazaElementul() {
        super.afiseazaElementul();

        System.out.println("\t"+"\t"+"\t" + nume + ", " + email);
    }
}
