package pojo;

public class CsrInfo {
	private int id;
	private String khzah;
	private String mstandard;
       private String mname;
       public CsrInfo() {
    	   
       }
	public String getKhzah() {
		return khzah;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setKhzah(String khzah) {
		this.khzah = khzah;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMstandard() {
		return mstandard;
	}
	public void setMstandard(String mstandard) {
		this.mstandard = mstandard;
	}
       
}
