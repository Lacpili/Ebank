package entities;

import entities.Compte;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-30T12:28:32")
@StaticMetamodel(Agence.class)
public class Agence_ { 

    public static volatile SingularAttribute<Agence, String> nomAgance;
    public static volatile ListAttribute<Agence, Compte> comptes;
    public static volatile SingularAttribute<Agence, String> telephone;
    public static volatile SingularAttribute<Agence, Long> idAgence;

}