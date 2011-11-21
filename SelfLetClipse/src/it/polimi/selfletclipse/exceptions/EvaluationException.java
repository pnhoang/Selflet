package it.polimi.selfletclipse.exceptions;

public class EvaluationException extends Exception {

	private static final long serialVersionUID = 1L;

	public EvaluationException(String message) {

		super(message);
	}

	public EvaluationException(String message, Throwable cause) {

		super(message, cause);
	}

}
