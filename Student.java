public class Student {
        private String name;
        private int id;
        private double[] grades;
        public Student(String name, int id, double[] grades) {
            this.name = name;
            this.id = id;
            this.grades = grades;
        }
        public double calculateAverageGrade() {
            double sum = 0;
            for (double e : grades) {
                sum += e;
            }
           return sum / grades.length;
        }
        public double findHighestGrade() {
            double highest = grades[0];
            for (double e : grades) {
                if (e > highest) {
                    highest = e;
                }
            }
            return highest;
        }
        public double findLowestGrade() {
            double lowest = grades[0];
            for (double e : grades) {
                if (e < lowest) {
                    lowest = e;
                }
            }
            return lowest;
        }
        public void displayGradeReport() {
            System.out.println("Grade Report for Student:");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);

            System.out.println("grades = ");
            for (double e : grades){
               System.out.println(e);
           }
            System.out.println("Average Grade: " + calculateAverageGrade());
            System.out.println("Highest Grade: " + findHighestGrade());
            System.out.println("Lowest Grade: " + findLowestGrade());
        }

        public static void main(String[] args) {
            double[]  grades1= {85.5, 90.0, 78.5, 88.0, 92.5};
            Student s1 = new Student("shahid", 19, grades1);
            s1.displayGradeReport();
            double[]  grades2= {81.5, 87.0, 78.5, 98.0, 82.5};
            Student s2 = new Student("faisal", 53, grades2);
            s2.displayGradeReport();
        }
    }


