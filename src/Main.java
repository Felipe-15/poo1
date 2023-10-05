import classes.*;


public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Leonardo", "777", "Doutor");
        Subject portuguese = new Subject("Português", teacher, 8, 6, new ArithmeticAverage());
        Subject mathematics = new Subject("Matemática", teacher, 7, 9, new WeightedAverage());

        Subject[] subjects = { portuguese, mathematics };

        Student student = new Student("Julio Cesar", "687651485698", subjects);

        student.getPresentation();
    }
}