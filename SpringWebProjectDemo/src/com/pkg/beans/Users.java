package com.pkg.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of users.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Users implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** firstName. */
	private String firstname;

	/** lastName. */
	private String lastname;

	/** email. */
	private String email;

	/** userId. */
	private Integer userid;

	/** password. */
	private String password;

	/** phoneNumber. */
	private String phonenumber;

	/** The set of alert. */
	
	
	private String carrier;

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	/**
	 * Constructor.
	 */
	

	/**
	 * Set the firstName.
	 * 
	 * @param firstname
	 *            firstName
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * Get the firstName.
	 * 
	 * @return firstName
	 */
	public String getFirstname() {
		return this.firstname;
	}

	/**
	 * Set the lastName.
	 * 
	 * @param lastname
	 *            lastName
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * Get the lastName.
	 * 
	 * @return lastName
	 */
	public String getLastname() {
		return this.lastname;
	}

	/**
	 * Set the email.
	 * 
	 * @param email
	 *            email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Get the email.
	 * 
	 * @return email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Set the userId.
	 * 
	 * @param userid
	 *            userId
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	/**
	 * Get the userId.
	 * 
	 * @return userId
	 */
	public Integer getUserid() {
		return this.userid;
	}

	/**
	 * Set the password.
	 * 
	 * @param password
	 *            password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Get the password.
	 * 
	 * @return password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Set the phoneNumber.
	 * 
	 * @param phonenumber
	 *            phoneNumber
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * Get the phoneNumber.
	 * 
	 * @return phoneNumber
	 */
	public String getPhonenumber() {
		return this.phonenumber;
	}

	/**
	 * Set the set of the alert.
	 * 
	 * @param alertSet
	 *            The set of alert
	 */
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Users other = (Users) obj;
		if (userid == null) {
			if (other.userid != null) {
				return false;
			}
		} else if (!userid.equals(other.userid)) {
			return false;
		}
		return true;
	}

}
