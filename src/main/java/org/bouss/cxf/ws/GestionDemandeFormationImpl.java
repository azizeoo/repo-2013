package org.bouss.cxf.ws;

import org.bouss.cxf.ws.domaine.DemandeFormation;

public class GestionDemandeFormationImpl implements GestionDemandeFormation {

	public String traitementDemande(DemandeFormation demande) {
		String demandeId = valider(demande);
		return demandeId;
	}

	private String valider(DemandeFormation demande) {
		String clientID = demande.getName();
		String formationID = demande.getTheme();
		if (clientID != null && formationID != null && !clientID.equals("")) {
			return "CMDOBJIS1234";
		}
		return null;
	}
}
