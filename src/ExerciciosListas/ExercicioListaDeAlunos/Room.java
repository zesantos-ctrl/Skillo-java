package ExerciciosListas.ExercicioListaDeAlunos;

import java.util.ArrayList;

public class Room {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        Student student1 = new Student("Zé", 10.0);
        Student student2 = new Student("Gabriel K.", 10.0);
        Student student3 = new Student("Ingrid B.", 2.0);


        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);


        for (Student student : studentList) {
            if(student.getNota() >= 7) {
                System.out.println("Alunos aprovado: ");
                System.out.println(student);
            } else {
                System.out.println("Alunos reprovados: ");
            }
        }

    }
}
