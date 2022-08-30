/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.local.CompteDaoBeanLocal;
import entities.Compte;

/**
 *
 * @author Lacpili
 */
public class CompteDaoBean extends GenericDaoBean<Compte, Long> implements CompteDaoBeanLocal {

    public CompteDaoBean() {
        super(Compte.class);
    }
}