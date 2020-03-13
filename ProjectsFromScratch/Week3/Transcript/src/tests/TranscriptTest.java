package tests;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TranscriptTest {
    private Transcript testTranscript;

    @Before
    public void setUp(){
        testTranscript = new Transcript("Student Name", 1000);
        //TODO: write new values in testTranscript constructor
    }

    @Test
    public void testGetStudentName(){
        assertEquals(testTranscript.getStudentName(), "Student Name");
    }

    @Test
    public void testGetStudentID(){
        assertTrue(testTranscript.getStudentID() == 1000);
    }

    //@Test
    public void testGetCourses(){
        testTranscript.addGrade("Spaceships", 3.5);
        testTranscript.addGrade("Basketball", 3.5);
        //assertEquals(testTranscript.getCourses(), "SpaceshipsBasketball");
    }

    @Test
    public void testSetStudentName(){
        testTranscript.setStudentName("Jack");
        assertEquals(testTranscript.getStudentName(), "Jack");
    }

    @Test
    public void testSetStudentID(){
        testTranscript.setStudentID(2000);
        assertTrue(testTranscript.getStudentID() == 2000);
    }

    @Test
    public void testAddGrade(){
        testTranscript.addGrade("Spaceships", 3.5);
        assertEquals(testTranscript.getCourseAndGrade("Spaceships"), "Spaceships: 3.5");
    }

    @Test
    public void testGPA(){
        testTranscript.addGrade("Spaceships", 3.5);
        testTranscript.addGrade("Basketball", 3.0);
        assertTrue(testTranscript.getGPA() == 3.25);
    }

}
