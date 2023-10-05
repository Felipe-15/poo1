package classes;

public class Teacher extends Person {
    private String siape;
    private String formation;

    public Teacher (String name, String siape, String formation) {
        super(name);
        this.siape = siape;
        this.formation = formation;
    }

    public void getPresentation() {
        System.out.printf("Nome: %s \nSIAPE: %s \nNível: %s", this.getName(), this.siape, this.formation);
    }

    public String getSiape() {
        return siape;
    }
    public void setSiape(String siape) {
        this.siape = siape;
    }
    public String getFormation() {
        return formation;
    }
    public void setFormation(String formation) {
        this.formation = formation;
    }
}
