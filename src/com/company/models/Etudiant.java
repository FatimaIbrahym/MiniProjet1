package com.company.models;

public class Etudiant {
        private Long id;
        private String cne;
        private String nom;
        private String prenom;
        private String diplome;
        private String email;
        public Etudiant() {
        }

    public Etudiant(Long id, String cne, String nom, String prenom, String diplome, String email) {
        this.id = id;
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
        this.diplome = diplome;
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Long getId() {
        return id;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
