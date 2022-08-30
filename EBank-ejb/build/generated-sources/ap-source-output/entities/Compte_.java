package entities;

import entities.Agence;
import entities.Client;
import entities.Transaction;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-30T12:28:32")
@StaticMetamodel(Compte.class)
public abstract class Compte_ { 

    public static volatile SingularAttribute<Compte, Agence> agence;
    public static volatile SingularAttribute<Compte, String> dateCreation;
    public static volatile SingularAttribute<Compte, Long> numero;
    public static volatile ListAttribute<Compte, Transaction> tansactions;
    public static volatile SingularAttribute<Compte, Double> solde;
    public static volatile SingularAttribute<Compte, Client> client;

}