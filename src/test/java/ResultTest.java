import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ResultTest {
    private Result2 result;

    // repository link: https://github.com/lizardiam/prog2-ss21-exercise1

    @Test
    void isStudentCountValid1() {
        boolean actual = result.studentCountValid(66);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    void isStudentCountValid2() {
        boolean actual = result.studentCountValid(50);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    void isGradeValid1(){
        boolean actual = result.gradeValid(120);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    void isGradeValid2(){
        boolean actual = result.gradeValid(38);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    void isGradeToBeRounded(){
        boolean actual = result.gradeToBeRounded(38);
        boolean expected = true;
        assertEquals(actual, expected);
    }
    @Test
    void isGradeToBeRounded1(){
        boolean actual = result.gradeToBeRounded(1);
        boolean expected = false;
        assertEquals(actual, expected);
    }
    @Test
    void isGradeToBeRounded2(){
        boolean actual = result.gradeToBeRounded(80);
        boolean expected = false;
        assertEquals(actual, expected);
    }

}