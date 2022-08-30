/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Lacpili
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Compte")
//@Table(name = "Compte")
public abstract  class Compte implements Serializable{

    @Id
    private Long numero;
    
    @Column(name= "solde")
    private double solde;
    
    @Column(name= "date_creation")
    private String dateCreation;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idAgence")
    private Agence agence;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idClient")
    private Client client;
    
    //@OneToMany(targetEntity = Transaction.class, mappedBy = "tansaction")
    private List<Transaction> tansactions = new ArrayList<>();

    public Compte() {
    }

    public Compte(Long numero, double solde, String dateCreation, Agence agence, Client client) {
        this.numero = numero;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.agence = agence;
        this.client = client;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
