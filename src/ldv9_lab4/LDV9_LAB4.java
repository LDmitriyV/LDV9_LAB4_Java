/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ldv9_lab4;

/**
 *
 * @author dmitriy
 */

import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;

public class LDV9_LAB4 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
                
        CriteriaQuery<Phones> criteriaPhones = builder.createQuery(Phones.class);
        Root<Phones> rootPhones = criteriaPhones.from(Phones.class);
        criteriaPhones.select(rootPhones);
        
        CriteriaQuery<PhonesSpecs> criteriaPhonesSpecs = builder.createQuery(PhonesSpecs.class);
        Root<PhonesSpecs> rootPhonesSpecs = criteriaPhonesSpecs.from(PhonesSpecs.class);
        criteriaPhonesSpecs.select(rootPhonesSpecs);
        
        PhonesSpecs phones1 = new PhonesSpecs();
        phones1.setRam(8);
        phones1.setCapacity(64);
        phones1.setCpu("Snapdragon 825");
        session.save(phones1);

        PhonesSpecs phones2 = new PhonesSpecs();
        phones2.setRam(16);
        phones2.setCapacity(128);
        phones2.setCpu("Dimensity 5");
        session.save(phones2);
        
        org.hibernate.Transaction tr = session.beginTransaction();
        session.delete(phones1);
        session.delete(phones2);
        tr.commit();

        Phones phones = new Phones();
        phones.setBrand("Google");
        phones.setModel("Pixel 5");
        phones.setPrice(500);
        phones.setPhonesSpecs(new PhonesSpecs(8, 100, "Snapdragon 733"));
        session.save(phones);
        
        phones = (Phones) session.get(Phones.class, phones.getId());
        session.save(phones);
        
        TypedQuery<Phones> queryPhones = session.createQuery(criteriaPhones);
        List<Phones> resultsTv = queryPhones.getResultList();
        resultsTv.forEach((item) -> {
            System.out.println(item);
        });
        
        TypedQuery<PhonesSpecs> queryPhonesSpecs = session.createQuery(criteriaPhonesSpecs);
        List<PhonesSpecs> resultsPhonesSpecs = queryPhonesSpecs.getResultList();
        resultsPhonesSpecs.forEach((item) -> {
            System.out.println(item);
        });
        
        session.close();

        System.exit(0);
    }
    
}
