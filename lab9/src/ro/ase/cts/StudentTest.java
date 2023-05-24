package ro.ase.cts;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/*
arrange -> setup your fixtures (your objects that need to be tested)
act -> call the method that you want to test
assert -> check that the behaviour is as expected
 */

/*
Right BICEP
B -> boundary
I -> inverse relation
C -> cross-check
E -> error condition
P -> performance
 */


public class StudentTest {

    private Student student;

    @Before
    public void setUp() {
        this.student = new Student("test", 11, 11,
                List.of(10d, 10d));
    }

    // right test => for right input, expect right result
    @Test
    public void testComputeAverageGradeRight() {
        var actualResult = student.computeAverageGrade();
        var expectedResult = 10d;

        assertEquals(expectedResult, actualResult, 0.05f);
    }

    // boundary test => for lower boundary, test that exception is thrown
    @Test(expected = IllegalArgumentException.class)
    public void testAddGradeBoundary() {
        student.addGrade(-1d);
    }

    // boundary test => for upper boundary, test that exception is thrown
    @Test(expected = IllegalArgumentException.class)
    public void testAddGradeBoundary2() {
        student.addGrade(11d);
    }

    // inverse relation test => for sqrt, check that pow is equal to the initial sum
    @Test
    public void testComputeSqrtInverseRelation() {
        var actualResult = student.computeSqrt();
        var inverseResult = Math.pow(actualResult, 2);

        var computedInverseResult = student.getGrades()
                .stream()
                .reduce(0d, Double::sum);

        assertEquals(inverseResult, computedInverseResult, 0.05f);
    }

    // cross-check => compute the result yourself in another way
    @Test
    public void testComputeAverageGradeCrossCheck() {
        var actualResult = student.computeAverageGrade();

        var computedResult = 0d;
        var grades = student.getGrades();
        for(var grade : grades) {
            computedResult += grade / grades.size();
        }

        assertEquals(computedResult, actualResult, 0.05f);
    }

    // error condition => check errors and environmental constraints
    @Test
    public void testComputeAverageGradeErrorCondition() {
        var student = new Student("test", 12, 12, null); // shadow field
        var actualResult = student.computeAverageGrade();

        assertEquals(0d, actualResult, 0.05f);   // when grades are null
                                                                // it should return sensible default
    }

    // performance => check that running time is manageable
    @Test
    public void testComputeAverageGradePerformance() {
        var start = new Date().getTime();
        student.computeAverageGrade();
        var end = new Date().getTime();

        var elapsed = end - start;
        var expected = 30;

        assertTrue(elapsed < expected);
    }
}