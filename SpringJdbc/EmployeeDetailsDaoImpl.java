package org.padmini.springjdbc.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.padmini.springcore.mapper.EmployeeDetailsRowMapper;
import org.padmini.springjdbc.dao.EmployeeDetailsDao;
import org.padmini.springjdbc.model.EmployeeDetails;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDetailsDaoImpl extends JdbcDaoSupport implements EmployeeDetailsDao
{
	
	 //1...For jdbcDaoSupport
		/*
		 * public void insert(EmployeeDetails empDetails) { String query =
		 * " INSERT INTO EmployeeDetails " +
		 * "(Emp_id,Name,Age,Designation,Dept_Code,Manager) VALUES(?,?,?,?,?,?)";
		 * 
		 * getJdbcTemplate().update(query, new Object[] {
		 * empDetails.getEmp_id(),empDetails.getName(),
		 * empDetails.getAge(),empDetails.getDesignation(),
		 * empDetails.getDept_Code(),empDetails.getManager() }); }
		 */
	
	
	/* 2..For Named Parameters
	 * public void insert(EmployeeDetails empDetails) { String query =
	 * " INSERT INTO EmployeeDetails " +
	 * "(Emp_id,Name,Age,Designation,Dept_Code,Manager) VALUES(:empid, :name, :age, :designation, :deptcode,:manager)"
	 * ;
	 * 
	 * Map<String,Object> param = new HashMap<String,Object>(); param.put("empid",
	 * empDetails.getEmp_id()); param.put("name", empDetails.getName());
	 * param.put("age", empDetails.getAge());
	 * param.put("designation",empDetails.getDesignation()); param.put("deptcode",
	 * empDetails.getDept_Code()); param.put("manager", empDetails.getManager());
	 * 
	 * getNamedParameterJdbcTemplate().update(query, param); }
	 */
	
	//3.get all employee details using row mapper
	public List<EmployeeDetails> getEmployeeDetailsRowMapper()
	{
		String query="SELECT * FROM EmployeeDetails";
		List<EmployeeDetails> empDet=getJdbcTemplate().query(query, new EmployeeDetailsRowMapper());
		return empDet;
	}
	
	/*
	 * // 4..get all employees using beanpropertyrowmapper public
	 * List<EmployeeDetails> findAll() { String query =
	 * "SELECT * FROM EmployeeDetails"; List<EmployeeDetails> empDetailsList =
	 * getJdbcTemplate().query(query, new
	 * BeanPropertyRowMapper(EmployeeDetails.class)); return empDetailsList; }
	 */
	
	
	/*
	 * //5..get a record with empid:8324 using beanpropertyrowmapper public
	 * EmployeeDetails findEmployeeDetailsById(int empid) { String query =
	 * " SELECT * FROM EmployeeDetails where Emp_id= ?"; EmployeeDetails empDet =
	 * (EmployeeDetails) getJdbcTemplate().queryForObject(query, new Object[] {
	 * empid }, new BeanPropertyRowMapper(EmployeeDetails.class)); return empDet; }
	 */
	
	
	//6..get all employee details using resultsetExtractor
	
	/*
	 * public List<EmployeeDetails> findAll() { return
	 * getJdbcTemplate().query("SELECT * FROM EmployeeDetails", new
	 * ResultSetExtractor<List<EmployeeDetails>>() { public List<EmployeeDetails>
	 * extractData(ResultSet rs) throws SQLException , DataAccessException {
	 * List<EmployeeDetails> empDetailsList = new ArrayList<EmployeeDetails>();
	 * while(rs.next()) { EmployeeDetails ed=new EmployeeDetails();
	 * ed.setEmp_id(rs.getInt(1)); ed.setName(rs.getString(2));
	 * ed.setAge(rs.getInt(3)); ed.setDesignation(rs.getString(4));
	 * ed.setDept_Code(rs.getInt(5)); ed.setManager(rs.getString(6));
	 * empDetailsList.add(ed); } return empDetailsList; } }); }
	 */
	
	/*
	 * //7..find total no of employees in table(row count) public int
	 * findTotalEmployees() { String query = "SELECT COUNT(*) FROM EmployeeDetails";
	 * int rowCount=getJdbcTemplate().queryForObject(query,Integer.class); return
	 * rowCount; }
	 */
	
	/*
	 * //8..Insert into table using simplejdbcinsert private SimpleJdbcInsert
	 * simpleJdbcInsert; public void setDataSource(DataSource dataSource) {
	 * this.simpleJdbcInsert=new
	 * SimpleJdbcInsert(dataSource).withTableName("EmployeeDetails"); } public void
	 * insert(EmployeeDetails empDetails) { Map<String,Object> param=new
	 * HashMap<String,Object>(1); param.put("Emp_id", empDetails.getEmp_id());
	 * param.put("Name", empDetails.getName()); param.put("Age",
	 * empDetails.getAge()); param.put("Designation", empDetails.getDesignation());
	 * param.put("Dept_Code", empDetails.getDept_Code()); param.put("Manager",
	 * empDetails.getManager()); simpleJdbcInsert.execute(param); }
	 */
	
	/*
	 * //9..retrieve record with empid=3721 private SimpleJdbcCall simpleJdbcCall;
	 * public void setDataSource(DataSource dataSource) { this.simpleJdbcCall=new
	 * SimpleJdbcCall(dataSource).withProcedureName("read_employee_withid"); }
	 * public EmployeeDetails getEmployeeDetails(int empid) { SqlParameterSource in
	 * = new MapSqlParameterSource().addValue("in_empid", empid); Map<String,Object>
	 * out=simpleJdbcCall.execute(in); EmployeeDetails empDet = new
	 * EmployeeDetails(); empDet.setEmp_id(empid);
	 * empDet.setName((String)out.get("out_name"));
	 * empDet.setAge((Integer)out.get("out_age"));
	 * empDet.setDesignation((String)out.get("out_designation"));
	 * empDet.setDept_Code((Integer)out.get("out_deptcode"));
	 * empDet.setManager((String)out.get("out_manager")); return empDet; }
	 */
	
	/*
	 * //10..print all records using simplejdbccallclass private SimpleJdbcCall
	 * simpleJdbcCall; public void setDataSource(DataSource dataSource) {
	 * this.simpleJdbcCall=new
	 * SimpleJdbcCall(dataSource).withProcedureName("read_all_employee")
	 * .returningResultSet("employeeDetails",
	 * BeanPropertyRowMapper.newInstance(EmployeeDetails.class)); } public
	 * List<EmployeeDetails> getAllEmployees() { Map m=simpleJdbcCall.execute(new
	 * HashMap<String,Object>(0)); return (List<EmployeeDetails>)
	 * m.get("employeeDetails"); }
	 * */
	
	/*
	 * //11..update a row using object args public int
	 * updateEmployeeDetailsOnEmpId(int age,String descr,String manager,int empid) {
	 * String query =
	 * " UPDATE EmployeeDetails SET AGE=?, DESIGNATION=?,MANAGER=? WHERE EMP_ID=?";
	 * int rowsAffected=getJdbcTemplate().update(query, age, descr, manager, empid);
	 * return rowsAffected; }
	 */
	

	/*
	 * //12..update a row using object array public int
	 * updateEmployeeDetailsOnEmpId(String descr,int deptcode,String manager,int
	 * empid) { String query =
	 * " UPDATE EmployeeDetails SET  DESIGNATION=?, DEPT_CODE=?, MANAGER=? WHERE EMP_ID=?"
	 * ; int rowsAffected=getJdbcTemplate().update(query, new Object[] {
	 * descr,deptcode, manager, empid}); return rowsAffected; }
	 */
	
	/*
	 * //13.chk whether employee exists with name public boolean
	 * ifEmployeeExists(String name) { String query =
	 * "SELECT COUNT(*) FROM EmployeeDetails WHERE NAME=?"; int count =
	 * getJdbcTemplate().queryForObject(query,new Object[] {name},Integer.class);
	 * if(count>=1) { return true; } return false; }
	 */
}
