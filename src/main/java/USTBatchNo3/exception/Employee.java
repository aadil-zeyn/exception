package USTBatchNo3.exception;

public class Employee {
	private int eid;
	private String name;
	private String phoneno;
	private String email;
	private String address;
	private String location;
	private int salary;
	public Employee(int eid, String name, String phoneno, String email, String address, String location, int salary) {
		
		this.eid = eid;
		this.name = name;
		this.phoneno = phoneno;
		this.email = email;
		this.address = address;
		this.location = location;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", phoneno=" + phoneno + ", email=" + email + ", address="
				+ address + ", location=" + location + ", salary=" + salary + "]";
	}
	
	
}

