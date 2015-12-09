/**
 * 
 */
package cl.leonsoftware.municipio.core.person;

import java.io.Serializable;
import java.util.Date;

/**
 * ---------------------------------------------------------------------------
 * León Software - Factoria de desarrollo de Software 
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 03-11-2015
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class Person implements Serializable 
{
	private static final long serialVersionUID = 253676706045957648L;
	private String oid;
	private String name;
	private String middleName;
	private String lastName;
	private Date birthdate;
	private String gender;
	
	/**
	 * 
	 */
	public Person()
	{
		
	}
	
	
	
	/**
	 * @return the oid
	 */
	public String getOid() {
		return oid;
	}
	/**
	 * @param oid the oid to set
	 */
	public void setOid(String oid) {
		this.oid = oid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the birthdate
	 */
	public Date getBirthdate() {
		return birthdate;
	}
	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
