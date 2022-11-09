package classic.web.app;

import java.sql.*;
import java.util.*;

public class CompanyBean implements java.io.Serializable {

	private int id;
	private String password;
	private int deptId;

	public final int getId() { return id; }
	public final void setId(int value) { id = value; }

	public final String getPassword() { return password; }
	public final void setPassword(String value) { password = value; }
	
	public final int getDeptId() { return deptId; }
	public final void setDeptId(int value) { deptId = value; }

	public boolean authenticate() throws SQLException {
		try(var con = DB.connect()){
			var pstmt = con.prepareStatement("select count(user_id) from admin where user_id=? and admin_pass=?");
			pstmt.setInt(1, id);
			pstmt.setString(2, password);
			var rs = pstmt.executeQuery();
			rs.next();
			int count = rs.getInt(1);
			rs.close();
			pstmt.close();
			if(count == 1)
				return true;
			id = 0;
			password = null;
			return false;
		}
	}

	public List<DeptEntry> getDeptDetails() throws SQLException {
		var dept = new ArrayList<DeptEntry>();
		try(var con = DB.connect()){
			var pstmt = con.createStatement();
			//pstmt.setString(1, id);
			var rs = pstmt.executeQuery("select dept_id, dept_name, dept_location from department");
			while(rs.next())
				dept.add(new DeptEntry(rs));
			rs.close();
			pstmt.close();
		}
		return dept;
	}


	public static class DeptEntry {
		
		private int did;
		private String dname;
		private String dlocation;

		DeptEntry(ResultSet rs) throws SQLException {
			did = rs.getInt("dept_id");
			dname = rs.getString("dept_name");
			dlocation = rs.getString("dept_location");
		}

		public final int getDeptId() { return did; }

		public final String getDeptName() { return dname; }

		public final String getDeptLocation() { return dlocation; }
	}


	public List<EmpEntry> getEmpDetails() throws SQLException {
	var emp = new ArrayList<EmpEntry>();
	try(var con = DB.connect()){
		var pstmt = con.prepareStatement("select emp_id, emp_name, emp_salary, emp_comm from employees where dept_id=?");
		pstmt.setInt(1, deptId);
		var rs = pstmt.executeQuery();
		while(rs.next()){
		System.out.println(emp.add(new EmpEntry(rs)));
		}
		rs.close();
		pstmt.close();
		}
		return emp;
	}


	public static class EmpEntry {
		
		private int EmpId;
		private String EmpName;
		private double EmpSalary;
		private double EmpComm;

		EmpEntry(ResultSet rs) throws SQLException {
			EmpId = rs.getInt("emp_id");
			EmpName = rs.getString("emp_name");
			EmpSalary = rs.getDouble("emp_salary");
			EmpComm = rs.getDouble("emp_comm");
		}

		public final int getEmpId() { return EmpId; }

		public final String getEmpName() { return EmpName; }

		public final double getEmpSalary() { return EmpSalary; }

		public final double getEmpComm() { return EmpComm; }
	}
}

