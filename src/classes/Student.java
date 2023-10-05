package classes;

public class Student extends Person {
    private String registration;
    private Subject[] subjects;

    public Student(String name, String registration, Subject[] subjects) {
        super(name);
        this.registration = registration;
        this.subjects = subjects;
    }

    public void getPresentation() {
        System.out.printf("Aluno: %s - Matrícula %s \n", this.getName(), this.registration);
        System.out.println("*************** Disciplinas Cursadas ***************");

        for (Subject currentSubject : this.subjects) {
            currentSubject.generateAverage();
            System.out.printf("Nome: %s - Professor: %s \nNotas\nN1: %.2f, N2: %.2f, Média: %.2f\n%s\n",
                    currentSubject.getName(),
                    currentSubject.getTeacher().getName(),
                    currentSubject.getN1(),
                    currentSubject.getN2(),
                    currentSubject.getAverage(),
                    currentSubject.isApproval() ? "Aprovado" : "Reprovado"
            );
            System.out.println("-----------------------------------------");
        }

        Teacher teacher = subjects[0].getTeacher();
        System.out.println("**** Dados de Professor ****");

        teacher.getPresentation();
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

}
