import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    // repository link: https://github.com/lizardiam/prog2-ss21-exercise1

    @Test
    void isStudentCountValid1() {
        boolean actual = Result2.studentCountValid(66);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    void isStudentCountValid2() {
        boolean actual = Result2.studentCountValid(50);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    void isGradeValid1(){
        boolean actual = Result2.gradeValid(120);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    void isGradeValid2(){
        boolean actual = Result2.gradeValid(38);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    void isGradeToBeRounded(){
        boolean actual = Result2.gradeToBeRounded(38);
        boolean expected = true;
        assertEquals(actual, expected);
    }
    @Test
    void isGradeToBeRounded1(){
        boolean actual = Result2.gradeToBeRounded(1);
        boolean expected = false;
        assertEquals(actual, expected);
    }
    @Test
    void isGradeToBeRounded2(){
        boolean actual = Result2.gradeToBeRounded(80);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    void gradingStudentsTest(){
        List<Integer> expected = Arrays.asList(75, 67, 40, 33);
        List<Integer> grades = Arrays.asList(4, 73, 67, 38, 33);
        List<Integer> actual = Result2.gradingStudents(grades);
        assertEquals(expected, actual);
    }

}