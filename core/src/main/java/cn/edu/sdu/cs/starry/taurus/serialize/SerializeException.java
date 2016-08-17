package cn.edu.sdu.cs.starry.taurus.serialize;

import cn.edu.sdu.cs.starry.taurus.common.exception.BusinessException;

public class SerializeException extends BusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 144347608694271057L;

	public SerializeException() {
		super();
	}

	public SerializeException(String message, Throwable cause) {
		super(message, cause);
	}

	public SerializeException(String message) {
		super(message);
	}

	public SerializeException(Throwable cause) {
		super(cause);
	}

	
}
