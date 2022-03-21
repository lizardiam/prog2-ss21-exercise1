import java.util.ArrayList;
import java.util.List;

public class Result2 {
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
            students = grades.size();
            List<Integer> results = new ArrayList<Integer>(students);

            if (result.studentCountValid(students)){
                for (int i = 1; i < grades.size(); i++){
                    if (result.gradeValid(grades.get(i))){
                        for (int j =1; j < grades.size(); j++){
                            if (result.gradeToBeRounded(grades.get(j))){
                                int grade = grades.get(j);
                                grade = grade+(5-(grade%5));
                                results.add(grade);
                            }
                            else{
                                results.add(grades.get(j));
                            }
                        }
                    }
                }
            }
            return results;
        }

        public static void main(String[] args){
            List<Integer> grades = new ArrayList<Integer>();
            grades.add(75);
            grades.add(67);
            grades.add(38);
            grades.add(33);
            result.gradingStudents(grades);
        }
    }
