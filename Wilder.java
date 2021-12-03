
public class Wilder {
	String firstname;
	boolean aware;
	
	public Wilder(String firstname, boolean aware) {
		this.firstname = firstname;
		this.aware = aware;
	}
	
	

	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public boolean isAware() {
		return aware;
	}
	public void setAware(boolean aware) {
		this.aware = aware;}

	public String whoAmI() {
		if (aware == true) {
		return this.getFirstname()+ "je  suis pas  aware" ;
	}else {
		return  this+ getFirstname() + "je ne  suis pas awre";}}
	

}
