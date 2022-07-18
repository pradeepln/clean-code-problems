package exercise13;

import java.util.Optional;

public class PayRollApp {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		Employee defaEmployee = new Employee(-1);
		
		Employee e = dao.findEmployeeById(10);
		
		if(e.getId() == 1) {
			System.out.println("Something ....");
		}
		

	}

}
