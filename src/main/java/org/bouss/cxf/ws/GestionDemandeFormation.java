package org.bouss.cxf.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.bouss.cxf.ws.domaine.DemandeFormation;

@WebService
public interface GestionDemandeFormation {
	@WebMethod
	String traitementDemande(DemandeFormation demande);
}
