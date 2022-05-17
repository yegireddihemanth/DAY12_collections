package ai.jobiak.collectionsComparability;

public class Cource implements Comparable {

	private String courceNmae;
	private int courceId;
	private String courceFees;
	private double courceDuriation;
	
	
	public Cource() {
		// TODO Auto-generated constructor stub
	}


	public Cource(String courceNmae, int courceId, String courceFees, double courceDuriation) {
		super();
		this.courceNmae = courceNmae;
		this.courceId = courceId;
		this.courceFees = courceFees;
		this.courceDuriation = courceDuriation;
	}


	public String getCourceNmae() {
		return courceNmae;
	}


	public void setCourceNmae(String courceNmae) {
		this.courceNmae = courceNmae;
	}


	public int getCourceId() {
		return courceId;
	}


	public void setCourceId(int courceId) {
		this.courceId = courceId;
	}


	public String getCourceFees() {
		return courceFees;
	}


	public void setCourceFees(String courceFees) {
		this.courceFees = courceFees;
	}


	public double getCourceDuriation() {
		return courceDuriation;
	}


	public void setCourceDuriation(double courceDuriation) {
		this.courceDuriation = courceDuriation;
	}


	@Override
	public String toString() {
		return "Cource [courceNmae=" + courceNmae + ", courceId=" + courceId + ", courceFees=" + courceFees
				+ ", courceDuriation=" + courceDuriation + "]";
	}
	@Override
	public int compareTo(Object o) {
		Cource ref = (Cource)o;
		if(this.courceNmae.compareTo(courceFees)<0) {	
			return -1;
			}
		
		else if((this.courceNmae.compareTo(courceFees)==0)) {
			return 0;
		}
		else if((this.courceNmae.compareTo(courceFees)>0)) {
			return 1;
		}
		return 0;
		
	}
	
	
	
	
}
