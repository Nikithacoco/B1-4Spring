package c2tcbatch.Placement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Placement 
{
	private long id;
	private String name;
	private String college;
	private Integer date;
	private String qualification;
	private Integer year;
	
	//default constructor
	public Placement() {
	}
	//parameterized constructor
	public Placement(Integer id, Integer year, String college) {
		super();
		this.id = long;
		this.name = String;
		this.college = college;
		this.date = Localdate;
		this.qualification = String;
		this.year = int;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setYear(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Integer getdate() {
		return date;
	}
	public void setdate(String date) {
		this.date = date;
	}
	public String getqualification() {
		return qualification;
	}
	public void setqualification(String qualification ) {
		this.qualification = qualification;
	}
	public Integer getyear() {
		return year;
	}
	public void setyear(String year ) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", name=" + name + ", college=" + college + ", date=" + date+", qualification=" + qualification+", year=" +year+" ]";
	}
	
}

