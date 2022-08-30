
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.local.AgenceDaoBeanLocal;
import entities.Agence;

/**
 *
 * @author  Lacpili
 */
public class AgenceDaoBean extends GenericDaoBean<Agence, Long> implements AgenceDaoBeanLocal {

    public AgenceDaoBean() {
        super(Agence.class);
    }
}
