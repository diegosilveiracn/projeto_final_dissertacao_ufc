package br.com.ufc.banco.jsf.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Classe para valida��o de reais
 * 
 * @author Diego Silveira / Jos� Maria
 * @version 1.0.0
 * @since 13/02/2007
 */
public class DoubleValidador implements Validator {

	/**
	 * M�todo para validar um n�mero real
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
			message.setSummary("O n�mero n�o � um real.");
			throw new ValidatorException(message);
		}
	}
}