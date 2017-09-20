package pojo;

public class TestInfo {
	private int id;
	private String pline;
     private String testm;
	public TestInfo(String pline, String testm) {
		super();
		this.pline = pline;
		this.testm = testm;
	}
     public TestInfo() {
    	 
     }
     public int getId() {
    	 return id;
     }
     public void setId(int id) {
    	 this.id = id;
     }
	public String getPline() {
		return pline;
	}
	public void setPline(String pline) {
		this.pline = pline;
	}
	public String getTestm() {
		return testm;
	}
	public void setTestm(String testm) {
		this.testm = testm;
	}
     
     
}
