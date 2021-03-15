package com.company.models;

public class Note {
    private Long id;
    private Module module;
    private Etudiant etudiant;
    private double noteE;

    public Note(Long id, Module module, Etudiant etudiant, double noteE) {
        this.id = id;
        this.module = module;
        this.etudiant = etudiant;
        this.noteE = noteE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public double getNoteE() {
        return noteE;
    }

    public void setNoteE(double noteE) {
        this.noteE = noteE;
    }
}
