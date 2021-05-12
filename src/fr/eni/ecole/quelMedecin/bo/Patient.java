package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Creation de la classe Patient
 *
 */
public class Patient {
 private String nom;
 private String prenom;
 private String numeroDeTelephone;
 private char sexe;
 private long numeroDeSecuriteSociale;
 private LocalDate dateDenaissance;
 private String commentaires;

  public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numeroDeSecuriteSociale, LocalDate dateDenaissance, String commentaires){
   this.nom = nom;
   this.prenom = prenom;
   this.numeroDeTelephone = numeroDeTelephone;
   this.sexe = sexe;
   this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
   this.dateDenaissance = dateDenaissance;
   this.commentaires = commentaires;
  }

  public void afficher(){
     System.out.println(this.nom.toUpperCase() + " " + this.prenom);
     System.out.println("Téléphone : " + this.numeroDeTelephone);
     System.out.println(this.sexe == 'F' ? "\"Sexe : \"Féminin" : "\"Sexe : \"Masculin");
     System.out.println("Numéro de Sécurité sociale : " + this.numeroDeSecuriteSociale);
     System.out.println("Date de naissance : " + this.dateDenaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG))); //Formatage de la date (appel de methodes objets qui éxistent déjà dans java)
     if(this.commentaires!=null)    {
        System.out.println("Commentaires : " + this.commentaires);
     } else {
         System.out.println("Commentaires : [aucun commentaire]");
     }
  }

  // affichage terniaire de commentaires : this.commentaires == null ? "[Aucun commentaires]" : this.commentaires;

}

