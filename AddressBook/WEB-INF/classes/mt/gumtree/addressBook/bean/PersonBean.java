package mt.gumtree.addressBook.bean;

import java.util.Date;

public class PersonBean  implements Comparable<PersonBean>{
	
	private String name;
	private String surname;
	private String sex;
	private Date birthday;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public int compareTo(PersonBean o) {
		return this.getBirthday().compareTo(o.getBirthday());
	}
	
}
