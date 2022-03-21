import java.util.ArrayList;
import java.util.List;

    public class Result2 {
        static int grade;
        static int students;
        static Result2 result = new Result2();

        protected static boolean studentCountValid(int students){
            return(0 < students && students <= 60);
        }
        protected static boolean gradeValid(int grade){
            return(0<= grade && grade <= 100);
        }
        protected static boolean gradeToBeRounded(int grade){
            return((grade >= 38) && (grade%5 == 3 || grade%5 == 4));
        }

        public static List<Integer> gradingStudents(List<Integer> grades){
            grades = new ArrayList<>(students);

            if (result.studentCountValid(students)){

                for (int i = 0; i < grades.size(); i++){

                    if (result.gradeValid(grade)){
                        grades.add(grade);

                        for (int j =0; j < grades.size(); j++){

                            if (result.gradeToBeRounded(grade)){
                                grade = grade+(5-(grade%5));
                            }
                        }
                    }
                }
            }
            return grades;
        }

        public static void main(String[] args){
            Result2 e = new Result2();
            List<Integer> grades = new ArrayList<>(3);
            grades.add(38);
            grades.add(64);
            grades.add(80);
            e.gradingStudents(grades);
        }
    }
