
import java.util.Collection;
import java.util.List;

import org.padmini.springjdbc.dao.EmployeeDetailsDao;
import org.padmini.springjdbc.impl.EmployeeDetailsDaoImpl;
import org.padmini.springjdbc.model.EmployeeDetails;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMgmt {
	
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDetailsDao empDetailsDao =(EmployeeDetailsDao) context.getBean("empDetailsDao");
		//List<EmployeeDetails> empDet=empDetailsDao.getAllEmployees();
		//EmployeeDetails empDetails=empDetailsDao.findEmployeeDetailsById(8324);
		//int count=empDetailsDao.findTotalEmployees();
		//System.out.println("Total number of rows in EmployeeDetails table are :"+count);
		//EmployeeDetails empDetails=empDetailsDao.getEmployeeDetails(3721); 
		//int change=empDetailsDao.updateEmployeeDetailsOnEmpId("Content Writer",545,"David Edwards",5613);
		//boolean isExist =empDetailsDao.ifEmployeeExists("Patricia Adkins");
		//System.out.println("Does an employee with name Patricia Adkins exist: "+isExist);
		//List<EmployeeDetails> empDet=empDetailsDao.getEmployeeDetailsRowMapper();
		List<EmployeeDetails> emplist = empDetailsDao.getEmployeeDetailsRowMapper();
        for (EmployeeDetails employee : emplist) {
            System.out.println(employee.toString());
        }
	}
}
