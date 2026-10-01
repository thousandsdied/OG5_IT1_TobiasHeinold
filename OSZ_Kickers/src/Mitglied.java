abstract public class Mitglied {
	
	protected String name;
	protected String telefonnr;
	protected Boolean jahresbeitragBezahlt;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelefonnr() {
		return telefonnr;
	}
	public void setTelefonnr(String telefonnr) {
		this.telefonnr = telefonnr;
	}
	public Boolean getJahresbeitragBezahlt() {
		return jahresbeitragBezahlt;
	}
	public void setJahresbeitragBezahlt(Boolean jahresbeitragBezahlt) {
		this.jahresbeitragBezahlt = jahresbeitragBezahlt;
	}
	
	public Mitglied() {
		name="John/Jane Doe";
		telefonnr="111111111";
		jahresbeitragBezahlt=false;
	}

}
