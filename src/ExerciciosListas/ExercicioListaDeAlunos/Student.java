package ExerciciosListas.ExercicioListaDeAlunos;

public class Student {
    private String name;
    private double note;

    Student(String name, double note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public double getNota() {
        return note;
    }

    @Override
    public String toString() {
        return "\"" + name + "\" - note: " + note;
    }

}
