import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sorting2 {
    static Scanner sc = new Scanner(System.in);

    public static  class Student implements Comparable<Student> {
        String name;
        Integer score;

        public Student(String name, Integer score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        @Override
        public int compareTo(Student student) {
            if (this.score < student.score) {
                return -1;
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        int n=sc.nextInt();
        sc.nextLine();
        List<Student> students = new ArrayList<>();
        for(int i=0; i<n;i++){
            String[] inputs = sc.nextLine().split(" ");
            students.add(new Student(inputs[0], Integer.parseInt(inputs[1])));
        }
        Collections.sort(students);
        for (Student student: students) {
            System.out.printf(student.getName()+" ");
        }
        System.out.println();
    }
}
