/**
 *
 * @author tgord
 */


import java.util.List;
import java.util.ArrayList;

public class Module {
    private String moduleName;
    private String moduleId;
    private List<Student> students;
    private List<Course> listCourses;

    
    public Module(String name, String iD){
        this.moduleName = name;
        moduleId = iD;
        this.students = new ArrayList<Student>();
        this.listCourses = new ArrayList<Course>();
       
    }
    //getters and setters
    public String getName(){
            return moduleName;
    }
    
    public void setName(String n){
        moduleName = n;
    }
    
    public String getId(){
            return moduleId;
    }
    
    public void setId(String iD){
        moduleId = iD;
    }
    
    public List<Student> getListStudents(){
            return students;
    }
    
    public void addStudents(Student student1){
            students.add(student1);
    
    }

    public List<Course> getListCourse(){
            return listCourses;
    }
    
    public void addCourses(Course courses){
        listCourses.add(courses);
        
    }
    public String getCourseInfo() {
		StringBuilder word = new StringBuilder();
		for (Course c : listCourses) {
			word.append(c.getName());
		}
		String name = word.toString();
		return name;
    }
    
    public String getStudentInfo() {
		StringBuilder word = new StringBuilder();
		for (Student s : students) {
			word.append(s.getDob());
		}
		String dob = word.toString();
		return dob;
    }
    
    @Override
    public String toString(){
        String str = "Name: " + moduleName + "\n" + "ID:  " + getId();
        return str;
    }
}
