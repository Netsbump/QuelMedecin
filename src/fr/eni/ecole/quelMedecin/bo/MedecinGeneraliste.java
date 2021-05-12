package fr.eni.ecole.quelMedecin.bo;

import java.util.Locale;

/**
 * Classe MedecinGeneraliste
 * Défini 3 attributs d'instance de type chaine de caractère pour le nom, prénom et le
 * numéro de téléphone.
 * Un attribut de classe de type entier pour le tarif d'une consultation
 * Un constructeur prenant en paramètre l'ensemble des informations nécessaires à
 * l'initialisation d'une instance (nom, prénom et numéro de téléphone)
 * Des méthodes getters et setters pour les attributs numéro de téléphone et pour
 * le tarif de consultation et une pour le nom.
 * Une méthode afficher
 * Date : 11/05/2021
 * @version : Version 1.0
 * @author  : Sten Levasseur
 */
public class MedecinGeneraliste {
    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private static int tarif = 25;


    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone){
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public String getNom(){
        return this.nom;
    }

    public String getNumeroDeTelephone(){
        return this.numeroDeTelephone;
    }

    public static int getTarif() {
        return MedecinGeneraliste.tarif;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public static void setTarif(int tarif){
        MedecinGeneraliste.tarif = tarif;
    }

    /**
     * Affiche sous la forme :
     * NOM Prenom
     * Téléphone : XXXXXXXX
     * Tarif : XX€
     */
    public void afficher() {
        System.out.println(this.nom.toUpperCase() + " " + this.prenom);
        System.out.println("Téléphone : " + this.numeroDeTelephone);
        System.out.println("Tarif : " + MedecinGeneraliste.tarif);
    }

}
