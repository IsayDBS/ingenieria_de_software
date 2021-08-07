package is.pims.MercadoManazo.service;

import is.pims.MercadoManazo.dto.Email;

public interface EmailService {
	
	public boolean sendEmail(Email emailBody);
}
