package ie.nuigalway.brendan.StudentRegistration;

import java.util.ArrayList;

public class Module {

	private String moduleName, id;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	public Module (String name, ArrayList<Student> list, String id) {
		this.setModuleName(name);
		this.setStudentList(list);
		this.setId(id);
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> list) {
		this.studentList = list;
	}
	
	public void addStudent(Student s) {
		this.studentList.add(s);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
