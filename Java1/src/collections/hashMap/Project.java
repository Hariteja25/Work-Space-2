package collections.hashMap;
public class Project {

	private int pId;
	private String pName;
	
	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + "]";
	}

	public Project(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

}



