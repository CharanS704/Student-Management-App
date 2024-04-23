package in.application.servicefactory;

import in.application.service.IStudentService;
import in.application.service.StudentServiceImpl;

//Abstraction logic of implementation
public class StudentServiceFactory {

	private StudentServiceFactory() {

	}

	private static IStudentService studentService = null;

	public static IStudentService getStudentService() {
		
		//singleton pattern code
		if (studentService == null) {
			studentService = new StudentServiceImpl();
		}
		return studentService;
	}

}
