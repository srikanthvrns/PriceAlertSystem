package com.pkg.beans;

import java.io.Serializable;

/**
 * Model class of alert.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
//Sysout
public class Alert implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** alertId. */
	private Integer alertid;

	/** email. */
	private String email;

	/** phoneNumber. */
	private Integer phonenumber;

		/** UserId. */
	private Integer userid;
	
	private Integer itemId;
	
	private String carrier;
	
	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	/**
	 * Constructor.
	 */
	public Alert() {
	}

	/**
	 * Set the alertId.
	 * 
	 * @param alertid
	 *            alertId
	 */
	public void setAlertid(Integer alertid) {
		this.alertid = alertid;
	}

	/**
	 * Get the alertId.
	 * 
	 * @return alertId
	 */
	public Integer getAlertid() {
		return this.alertid;
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
	 * Set the phoneNumber.
	 * 
	 * @param phonenumber
	 *            phoneNumber
	 */
	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * Get the phoneNumber.
	 * 
	 * @return phoneNumber
	 */
	public Integer getPhonenumber() {
		return this.phonenumber;
	}

	

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alertid == null) ? 0 : alertid.hashCode());
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
		Alert other = (Alert) obj;
		if (alertid == null) {
			if (other.alertid != null) {
				return false;
			}
		} else if (!alertid.equals(other.alertid)) {
			return false;
		}
		return true;
	}

}
