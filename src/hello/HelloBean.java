package hello;

import java.util.Date;

public class HelloBean implements Hello {
	private int age;
	private String id;
	private String address;
	private boolean useYn;
	private Date regDate;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isUseYn() {
		return useYn;
	}

	public void setUseYn(boolean useYn) {
		this.useYn = useYn;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public HelloBean(int age, String id, String address, boolean useYn, Date regDate) {
		super();
		this.age = age;
		this.id = id;
		this.address = address;
		this.useYn = useYn;
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "HelloBean [age=" + age + ", id=" + id + ", address=" + address + ", useYn=" + useYn + ", regDate="
				+ regDate + "]";
	}

	public static void main(String[] args) {

	}
}
