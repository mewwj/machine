package pojo;

public class DayItems {
       private String ordernumber;
       private String mstandard;
       private int good;
       private int ng;
       private int spc;
       private int thd;
       private int oth;
       
	public DayItems(String ordernumber, String mstandard, int good, int ng, int spc, int thd, int oth) {
		super();
		this.ordernumber = ordernumber;
		this.mstandard = mstandard;
		this.good = good;
		this.ng = ng;
		this.spc = spc;
		this.thd = thd;
		this.oth = oth;
	}
	public DayItems() {
		
	}
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	public String getMstandard() {
		return mstandard;
	}
	public void setMstandard(String mstandard) {
		this.mstandard = mstandard;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public int getNg() {
		return ng;
	}
	public void setNg(int ng) {
		this.ng = ng;
	}
	public int getSpc() {
		return spc;
	}
	public void setSpc(int spc) {
		this.spc = spc;
	}
	public int getThd() {
		return thd;
	}
	public void setThd(int thd) {
		this.thd = thd;
	}
	public int getOth() {
		return oth;
	}
	public void setOth(int oth) {
		this.oth = oth;
	}
	
}
