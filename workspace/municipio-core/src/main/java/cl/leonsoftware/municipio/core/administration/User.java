/**
 * 
 */
package cl.leonsoftware.municipio.core.administration;

import java.io.Serializable;

import cl.leonsoftware.municipio.core.person.Person;

/**
 * ---------------------------------------------------------------------------
 * León Software - Factoria de desarrollo de Software 
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 01-11-2015
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class User implements Serializable
{

	private static final long serialVersionUID = 8465836139733609824L;
	private String oid;
	private String username;
	private String password;
	private String email;
	private Profile profile;
	private Person person;
	
	/**
	 * 
	 */
	public User()
	{
		
	}
	
	
	/**
	 * 
	 * @param oid
	 */
	public User(String oid)
	{
		this.oid = oid;
	}
	
	
	/**
	 * 
	 * @param username
	 * @param password
	 */
	public User(String username, String password)
	{
		this.username = username;
		this.password = password;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the profile
	 */
	public Profile getProfile() 
	{
		return profile;
	}


	/**
	 * @param profile the profile to set
	 */
	public void setProfile(Profile profile) 
	{
		this.profile = profile;
	}
	
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}


	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

}
