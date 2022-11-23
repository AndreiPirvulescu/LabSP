package TestLabSP;

public class Main {
    public static void main(String[] args) {
        ElementComp info3 = new AnUniversitar("Informatica 3")
                .add(new Grupa("Grupa 1")
                        .add(new Subgrupa("Semigrupa 1.1")
                                .add(new Student("Popescu I", "popescu@acme.edu"))
                                .add(new Student("Ionescu E", "ionescu@acme.edu")))
                        .add(new Subgrupa("Semigrupa 1.2")
                                .add(new Student("Vasilescu I", "vasilescu@acme.edu"))
                                .add(new Student("Georgescu E", "georgescu@acme.edu"))))
                .add(new Grupa("Grupa 2"));

        AnUniversitar numeAnUniversitar = new AnUniversitar("Informatica 3");
    }
}
