package pack;

import java.io.Serializable;

public class Company implements Serializable {    
    
    private static final long serialVersionUID = 1L;
    
    private String name;
    private String address;
    private int employees;
    private Long capital;
    private transient int sn;
    
    public Company(String name, String address, int employees, Long capital, int sn) {	
	this.name = name;
	this.address = address;
	this.employees = employees;
	this.capital = capital;
	this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public Long getCapital() {
        return capital;
    }

    public void setCapital(Long capital) {
        this.capital = capital;
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    @Override
    public String toString() {
	return "name = " + name + "\naddress = " + address + "\nemployees = " + employees + "\ncapital = " + capital
		+ "\nsn = " + sn;
    }      
    

}
