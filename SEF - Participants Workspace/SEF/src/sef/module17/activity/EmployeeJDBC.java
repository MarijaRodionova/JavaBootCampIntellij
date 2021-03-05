package activity;
//Needs to be completed
import org.junit.Assert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeJDBC {
//	Employee emp  = new Employee();

	public static void main(String[] args) {
		Employee employee = findEmployeeById(1);
		System.out.println(employee.getId());
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getSalary());
		Employee employee1 = new Employee(2,"John","Doe",200);
		insertEmployee(employee1);
//		Connection con = createConnection();
//		Employee e1 = new Employee();
//		e1 = findEmployeeById(2);
//		Assert.assertEquals("Marija", e1.getFirstName());
//		System.out.println(e1.getFirstName());
	}

	public static Connection createConnection()
	{
		Connection con=null;
		String url = "jdbc:mysql://localhost/activity";
		String user = "root";
		String pass = "adbd1234";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static Employee findEmployeeById(int id)
	{
		Connection con = createConnection();
		Employee emp=null;
		try {
		// 1 - Create a PreparedStatement with a query
		PreparedStatement pStmt = con.prepareStatement("select * employee where id = ? and salary = ?");
			statement.setInt(1, id);

		// 2 - Search for the given id
			ResultSet rs = statement.executeQuery();


		// 3 - Execute this query
//		ResultSet rs = pStmt.executeQuery();
		
		// 4 - If resultset is not null, then initialize emp object with data
			if(rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setSalary(rs.getInt(4));
			}
		
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}

	public ArrayList<Employee> findEmployeesByName(String name)

//	public static Employee insertEmployee(Employee emp)
//	{
		Connection con = createConnection();
	public ArrayList<Employee> findEmployeesByName(int name)

		try {
		// 1 - Create a PreparedStatement with a query
			con.setAutoCommit(false);
			PreparedStatement statement = con.prepareStatement("select * employee where name = ?");
			statement.setString(1, emp.getFirstName());
			statement.setString(2, emp.getLastName());
			statement.setInt(3, emp.getSalary());
			int rs = statement.executeUpdate();

		// 2 - Search for the given id
		// 3 - Execute this query

		
		
		// 4 - While there are some records, continue
			if(rs==1) {
				System.out.println("Succesful inserted value");
			} else {
				System.out.println("Error");
			}
		
			con.commit();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public ArrayList<Employee> findEmployeesBySalary(int salary)
	{
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try {
		// 1 - Create a PreparedStatement with a query
			PreparedStatement pStmt = con.prepareStatement("select * employee where Salary = ?");

		// 2 - Search for the given salary
			pStmt.setString(4, salary);

		// 3 - Execute this query
			ResultSet rs = pStmt.executeQuery();

		// 4 - While there are records, continue
			if(rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setSalary(rs.getInt(4));
			}

		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public void insertEmployee(Employee emp)
	{
		Connection con = createConnection();
		
		//1 - Create a PreparedStatement with a query "insert into employee values(?,?,?,?)" 
		
//		con.setAutoCommit(false);

		//	Substitute the ? now.
		
		//2 - Execute this query using executeUpdate()
		con.setAutoCommit(false);
		PreparedStatement statement = con.prepareStatement("INSERT INTO employee (firstname, lastname, salary) VALUES (?,?,?)");
		statement.setString(1,emp.getFirstName());
		statement.setString(2,emp.getLastName());
		statement.setInt(3,emp.getSalary());
		int result = statement.executeUpdate();
		if(result==1) {
			System.out.println("Successfully inserted values");
		} else {
			System.out.println("Error, something went wrong");
		}
			

		con.commit();
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}


