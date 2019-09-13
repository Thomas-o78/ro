package fr.smabtp.ro.dto.ldap;

public class Person {
	private String uid;
	private String displayName;
	private String mail;
	private String ldapUserDn;

	public Person() {
	}

	public Person(String uid, String displayName, String mail, String ldapUserDn) {
		this.uid = uid;
		this.displayName = displayName;
		this.mail = mail;
		this.ldapUserDn = ldapUserDn;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLdapUserDn() {
		return ldapUserDn;
	}

	public void setLdapUserDn(String ldapUserDn) {
		this.ldapUserDn = ldapUserDn;
	}
}
