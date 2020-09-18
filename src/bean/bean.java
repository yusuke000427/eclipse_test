package bean;

public class bean {
	private String id;
	private String name;
	private String mail;
	private String kakitime;
	private String hentime;
	private String coment;

	public bean(String id, String name, String mail, String kakitime, String hentime, String coment) {
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.kakitime = kakitime;
		this.hentime = hentime;
		this.coment = coment;


	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String Mail) {
		this.mail = mail;
	}

	public String getKakitime() {
		return kakitime;
	}

	public void setKakitime(String kakitime) {
		this.kakitime = kakitime;
	}

	public String getHentime() {
		return hentime;
	}

	public void setHentime(String hentime) {
		this.hentime = hentime;
	}
	public String getComent() {
		return coment;
	}

	public void setComent(String coment) {
		this.coment = coment;
	}

}
