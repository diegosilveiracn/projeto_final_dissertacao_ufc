package br.com.ufc.banco.jsf.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Classe para validação de reais
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 13/02/2007
 */
public class DoubleValidador implements Validator {

	/**
	 * Método para validar um número real
	 * 
	 * @version 1.0.0
	 * @since 13/02/2007
	 */
	public void validate(FacesContext context, UIComponent comp, Object object)
			throws ValidatorException {

		try {
			Double.parseDouble(object.toString());
		} catch (RuntimeException e) {
			FacesMessage message = new FacesMessage();
			message.setSummary("O número não é um real.");
			throw new ValidatorException(message);
		}
	}
}