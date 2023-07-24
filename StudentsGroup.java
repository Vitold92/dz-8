import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsGroup {
    private Student leader;
    private List<Student> students;
    private List<String> tasks;
    private Map<Student, Boolean> tasksStatus;

    public StudentsGroup(Student leader) {
        this.leader = leader;
        this.students = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.tasksStatus = new HashMap<>();
    }

    public Student getLeader() {
        return leader;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students); // Повертаємо копію списку студентів, щоб не дозволити змінювати список зовнішнім кодом
    }

    public List<String> getTasks() {
        return new ArrayList<>(tasks); // Повертаємо копію списку завдань, щоб не дозволити змінювати список зовнішнім кодом
    }
    public void changeLeader(Student newLeader) {
        this.leader = newLeader;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        tasksStatus.remove(student); // Видаляємо запис про завдання для видаленого студента
    }
    public void addTask(String task) {
        tasks.add(task);
        // Встановлюємо всім студентам початковий статус "не виконано" для цього завдання
        for (Student student : students) {
            tasksStatus.put(student, false);
        }
    }

    public void markTaskAsDone(Student student) {
        if (tasksStatus.containsKey(student)) {
            tasksStatus.put(student, true);
        } else {
            System.out.println("Студент не входить до групи або завдання не існує для студента.");
        }
    }
}









