/**
 * 
 */
package cl.leonsoftware.municipio.core.exception;

/**
 * ---------------------------------------------------------------------------
 * Maldonado León - Factoria de desarrollo de Software 
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 04-11-2015
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class NotFoundObjectException extends Exception 
{
	private static final long serialVersionUID = -1306300623028411536L;
	
	/***
	 * 
	 */
	public NotFoundObjectException() 
	{
	}
	
	/**
	 * 
	 * @param string
	 */
	public NotFoundObjectException(String message) 
	{
		super(message);
	}
	
	/**
	 * 
	 * @param message
	 * @param throwable
	 */
	public NotFoundObjectException( String message, Throwable throwable ) 
	{
		super(message, throwable);
	}

	

}
