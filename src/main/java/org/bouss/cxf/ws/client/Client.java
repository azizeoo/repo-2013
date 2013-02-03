package org.bouss.cxf.ws.client;

import org.bouss.cxf.ws.GestionDemandeFormation;
import org.bouss.cxf.ws.domaine.DemandeFormation;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class Client {

	public Client() {
	}

	public static void main(String args[]) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "client-beans.xml" });

		GestionDemandeFormation client = (GestionDemandeFormation) context
				.getBean("commandeClient");
		DemandeFormation demande = new DemandeFormation();
		demande.setName("Paul DURAND");
		demande.setTheme("WEB SERVICES");

		String demandeID = client.traitementDemande(demande);
		String message = (demandeID == null) ? "Demande refus�e"
				: "Demande accept�e; Identifiant de demande " + demandeID;
		System.out.println(message);

	}
}