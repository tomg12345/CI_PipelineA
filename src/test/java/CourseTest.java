/**
 *
 * @author tgord
 */

import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

public class CourseTest {
	private Student student1;
	private Student student2;
	private Module module1;
        private Module module2;
	private Course course1;
	
	@Before
	public void setUp() throws Exception {
		student1 = new Student("BobMarley", 22, "01-01-98", 12345678);
		student2 = new Student("KeithRichards", 21, "03-03-99", 87654321);
		module1 = new Module("Software Engineering 3", "CT417");
                module2 = new Module("Machine Learning", "CT418");
		course1 = new Course("4BP", new DateTime("2016-09-01T00:00:00Z"), new DateTime("2020-06-30T00:00:00Z"));
	}
        
	@Test
	public void testCourseStudents(){
		course1.addStudents(student1);
                Student testStudent1 = new Student("BobMarley", 22, "01-01-98", 12345678);
		assertEquals("pass", course1.getStudentInfo(), testStudent1.getDob());
	}

	@Test
	public void testCourseModules(){
		course1.addModules(module1);
                Module testModule1 = new Module("Software Engineering 3", "CT417");
		assertEquals("pass", course1.getModuleInfo(), testModule1.getId());
	}
}
