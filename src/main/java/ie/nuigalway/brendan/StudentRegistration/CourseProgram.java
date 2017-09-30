package ie.nuigalway.brendan.StudentRegistration;

import java.util.ArrayList;

import org.joda.time.*;

public class CourseProgram {

	private String courseName;
	private ArrayList<Module> moduleList = new ArrayList<Module>();
	private LocalDate startDate, endDate;
	
	public CourseProgram (String name, ArrayList<Module> modules, LocalDate start, LocalDate end) {
		this.setCourseName(name);
		this.setModuleList(modules);
		this.setStartDate(start);
		this.setEndDate(end);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public ArrayList<Module> getModuleList() {
		return moduleList;
	}

	public void setModuleList(ArrayList<Module> modules) {
		this.moduleList = modules;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}
