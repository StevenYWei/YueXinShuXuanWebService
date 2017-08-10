package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {

	@Id
	@Column(name="dept_no")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int deptNo;
	@Column(name = "dept_name", length = 30, nullable = false)
	private String deptName;
	
	public int getDeptNo() {
		return deptNo;
	}
	
	
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public String toString() {
		return deptNo + " : " + deptName;
	}
	
}
