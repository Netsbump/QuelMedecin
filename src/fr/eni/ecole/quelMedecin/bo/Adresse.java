package fr.eni.ecole.quelMedecin.bo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Locale;

/**
 * JAVADOC CREATION DE LA CLASSE ADRESSE
 */
public class Adresse {
    private String mentionsComplementaires;
    private int numeroDeVoie;
    private String complementNumero;
    private String typeDeVoie;
    private int codePostal;
    private String nomDeLaCommune;

    public Adresse(String mentionsComplementaires, int numeroDeVoie, String complementNumero, String typeDeVoie,
                   int codePostal, String nomDeLaCommune){
        this.mentionsComplementaires = mentionsComplementaires;
        this.numeroDeVoie = numeroDeVoie;
        this.complementNumero = complementNumero;
        this.typeDeVoie = typeDeVoie;
        this.codePostal = codePostal;
        this.nomDeLaCommune = nomDeLaCommune;
    }

    public Adresse(int numeroDeVoie, String complementNumero, String typeDeVoie,
                   int codePostal, String nomDeLaCommune){
        this.mentionsComplementaires = null;
        this.numeroDeVoie = numeroDeVoie;
        this.complementNumero = complementNumero;
        this.typeDeVoie = typeDeVoie;
        this.codePostal = codePostal;
        this.nomDeLaCommune = nomDeLaCommune;
    }

    public void afficher() {
        if(this.mentionsComplementaires!=null) {
        System.out.println(this.mentionsComplementaires);
        }
        if(this.complementNumero!=null) {
            System.out.println(this.numeroDeVoie + this.complementNumero + " " + this.typeDeVoie);
        } else {
            System.out.println(this.numeroDeVoie + " " + this.typeDeVoie);
        }
        System.out.println(this.codePostal + " " + (this.nomDeLaCommune.toUpperCase()));
    }


}
