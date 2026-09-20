//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//import com.dcl.mvc.controller.EmployeeController;
//import com.dcl.mvc.entity.Employee;
//
//@Configuration
//@ComponentScan(basePackages = "com.dcl.mvc")
//public class App {
//	public static void main(String[] args) 
//	{
//		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
//		
//		EmployeeController ec = context.getBean(EmployeeController.class);
//		
//		Employee e1 = new Employee();
//		e1.setEmpId(102);
//		e1.setEmpName("two");
//		e1.setEmpSal(2002);
//		e1.setEmpDept("B");
//		
//		String employeeSave = ec.saveEmployee(e1);
//		System.out.println(employeeSave);
//	}
//}


