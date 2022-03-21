import java.util.ArrayList;
import java.util.List;

public class Result2 {
        static int students;

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
            students = (grades.size())-1;
            List<Integer> results = new ArrayList<Integer>(students);

            if (Result2.studentCountValid(students)){

                for (int i = 1; i < grades.size(); i++){

                    if (Result2.gradeValid(grades.get(i))){

                        if (Result2.gradeToBeRounded(grades.get(i))){
                            int grade = grades.get(i);
                            grade = grade+(5-(grade%5));
                            results.add(grade);
                        }
                        else{
                            results.add(grades.get(i));
                        }
                    }
                }
            }
            return results;
        }
    }
