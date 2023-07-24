public class Main {
    public static void main(String[] args) {
        Student leader = new Student(1, "Іван", "Петров");
        StudentsGroup group = new StudentsGroup(leader);

        Student student1 = new Student(2, "Олександр", "Сидоров");
        Student student2 = new Student(3, "Марія", "Коваленко");

        group.addStudent(student1);
        group.addStudent(student2);

        group.addTask("Завдання 1");
        group.addTask("Завдання 2");

        // Позначаємо завдання "Завдання 1" як виконане для студента student1
        group.markTaskAsDone(student1);

        System.out.println("Староста: " + group.getLeader().getFullName());
        System.out.println("Список студентів:");
        for (Student student : group.getStudents()) {
            System.out.println(student.getFullName());
        }
        System.out.println("Список завдань:");
        for (String task : group.getTasks()) {
            System.out.println(task);
        }
    }
}