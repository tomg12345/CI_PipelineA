/**
 *
 * @author tgord
 */

import java.util.List;
import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {
    private String name;
    private List<Module> modules;
    private List<Student> students;
    private DateTime startDate, endDate;
    
    public Course(String n, DateTime s, DateTime e){
        name = n;
        modules = new ArrayList<Module>();
        students = new ArrayList<Student>();
        startDate = s;
        endDate = e;
    }
    
    //getters and setters
    public String getName(){
            return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public List<Student> getListStudents(){
            return students;
    }
    
    public void addStudents(Student student){
        students.add(student);
        
    }
    
    public List getModules(){
            return modules;
    }
    
    public void addModules(Module module){
        modules.add(module);
    }
    
    public DateTime getStartDate(){
        return startDate;
    }
    
    public DateTime getEndDate(){
        return endDate;
    }
    
    public String getModuleInfo() {
		StringBuilder word = new StringBuilder();
		for (Module m : modules) {
			word.append(m.getId());
		}
		String id = word.toString();
		return id;
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
        String str = "Name: " + name +"\n" 
                    + "Starts: " + getStartDate() + "\n" 
                    + "Ends: " + getEndDate() + "\n"
                    + "Modules: "+ "\n" + getModules();
        return str;
    }
    
}
