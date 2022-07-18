package exercise13;

public class EmployeeDAO {

	public static Employee findEmployeeById(int id) {
		// db query select * from employee where emp_id=id
		boolean found = true;
		if(found) {
			return (new Employee(1));
		}else {
			return null;
		}
	}
}
