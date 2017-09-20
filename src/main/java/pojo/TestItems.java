package pojo;



public class TestItems {
	private int id;
	private String pline;
	private String mname;
	private String ordernumber;
	private String mstandard;
    private String testm;
    private int pnumber;
    private String time;
    private int good;
    private int ng;
    private Double goodrate;
    private Double ngrate;
    private int spc;
    private int thd;
    private int oth;
	public TestItems(int id,String pline,String mname,String ordernumber,String mstandard, String testm, int pnumber, String time, int good, int ng, Double goodrate,
			Double ngrate, int spc, int thd, int oth) {
		super();
		this.id=id;
		this.pline=pline;
		this.mname=mname;
		this.ordernumber=ordernumber;
		this.mstandard=mstandard;
		this.testm = testm;
		this.pnumber = pnumber;
		this.time = time;
		this.good = good;
		this.ng = ng;
		this.goodrate = goodrate;
		this.ngrate = ngrate;
		this.spc = spc;
		this.thd = thd;
		this.oth = oth;
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
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
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
	public TestItems() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTestm() {
		return testm;
	}
	public void setTestm(String testm) {
		this.testm = testm;
	}
	public int getPnumber() {
		return pnumber;
	}
	public void setPnumber(int pnumber) {
		this.pnumber = pnumber;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
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
	public Double getGoodrate() {
		return goodrate;
	}
	public void setGoodrate(Double goodrate) {
		this.goodrate = goodrate;
	}
	public Double getNgrate() {
		return ngrate;
	}
	public void setNgrate(Double ngrate) {
		this.ngrate = ngrate;
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
    
    

