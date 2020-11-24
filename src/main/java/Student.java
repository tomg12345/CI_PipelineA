/**
 *
 * @author tgord
 */


import org.joda.time.DateTime;
import java.util.List;
import java.util.ArrayList;
import org.joda.time.DateTime;

public class Student {
    private String name;
    private int age;
    private String dob;
    private int id;
    private Course course;
    private List<Module> modules;
    private ArrayList<Module> m;

    
    public Student(String name, int age, String dob, int id){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        modules = new ArrayList<Module>();
        m = new ArrayList<Module>();
        
        
        }
    //getters and setters
    
        public String getUsername(){
        String username = name + id;
            return username;
            
    }
    
    public String getName(){
            return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public int getAge(){
            return age;
    }
    
    public void setAge(int a){
        age= a;
    }
    
    
    public String getDob(){
            return dob;
    }
    
    public void setDob(String dob){
        this.dob = dob;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
        public int getId(){
            return id;
    }
    
    public Course getCourse(){
            return course;
    }
    
    public void setCourses(Course course){
        this.course = course;
    }
    
    public List getModules(){
            return modules;
    }
    
    public ArrayList<Module> getArrayListModules(){
        return m;
    }
    
    
    public void addModules(Module module){
        modules.add(module);
    }
    
    public String getModuleInfo() {
		StringBuilder word = new StringBuilder();
		for (Module m : modules) {
			word.append(m.getId());
		}
		String id = word.toString();
		return id;
    }
    
    
    @Override
    public String toString(){
        String str = "Username: " + getUsername() + "\n" + 
                    "Name: " + name + "\n" + 
                    "Age: " + getAge() +"\n" + 
                    "DOB: " + getDob() + "\n" + 
                    "ID: " + getId() + "\n" +  
                    "Modules: " + getArrayListModules() + "\n" +
                    "Course: " + getCourse() + "\n";
        return str;
    }
    
}
