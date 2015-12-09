/**
 * 
 */
package cl.leonsoftware.municipio.core.exception;

/**
 * ---------------------------------------------------------------------------
 * Maldonado León - Factoria de desarrollo de Software 
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 21-11-2015
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class GenericWebException extends Exception 
{
	private static final long serialVersionUID = 3306651909934174703L;
	private String code;
	
	/***
	 * 
	 */
	public GenericWebException() 
	{
	}
	
	/**
	 * 
	 * @param string
	 */
	public GenericWebException(String code, String message) 
	{
		super(message);
		this.setCode(code);
	}
	
	/**
	 * 
	 * @param message
	 * @param throwable
	 */
	public GenericWebException( String message, Throwable throwable ) 
	{
		super(message, throwable);
	}
	
	/**
	 * 
	 * @param message
	 * @param throwable
	 */
	public GenericWebException( String code, String message, Throwable throwable ) 
	{
		super(message, throwable);
		this.setCode(code);
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}


}
