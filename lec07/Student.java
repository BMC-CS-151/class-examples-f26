import java.util.Arrays;

public class Student implements Comparable {
        String name;
        int age;
        Student bff;
        double gpa;

        public Student(String n, int a, double g) {
            name = n;
            age = a;
            gpa = g;
        }

        public void setBff(Student s) {
            bff = s;
        }

        public String toString() {
            return this.name + " " + this.gpa;
        }
        public Student getBff() {
            return bff;
        }

        public double getGPA() {
            return this.gpa;
        }

        public int compareTo(Object o) {
            if (o instanceof Student) {
                Student s = (Student) o;
                return ((Double) gpa).compareTo(s.getGPA());
            } else {
                throw new RuntimeException("NOT A STUDENT");
            }
        }

        public static void main(String[] args) {
            Student cinna = new Student("Cinna", 5, 4.0);
            Student bad = new Student("not good", 10, 0.5);
            Student s2 = new Student("s2", 0, 1.0);
            Student s3= new Student("s3", 3, 3.7);
            
            System.out.println(cinna.compareTo(bad));

    
            Student[] students = {cinna, bad, s2, s3};
            Arrays.sort(students); //calls compareTo
            for (int i=0; i<students.length; i++) {
                System.out.println(students[i]);
            }

        }




}
