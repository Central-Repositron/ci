package com.sayantan.action;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import com.sayantan.model.MessageHibModel;
import com.sayantan.model.RegisterModel;
import com.sayantan.utils.AppSupport;

public class Delegate_registerAction extends AppSupport{
	/**
	 * Login action page. 
	 */
	private static final long serialVersionUID = 178303731947801496L;
	Logger logger = Logger.getLogger(Delegate_registerAction.class);
	
	@Override
    public String execute() throws Exception{
        logger.info("Entering Register Action");
		/* Input Validation */
		if (isInvalid(appForm.getUid())) return I;
        if (isInvalid(appForm.getUpass())) return I;
        if (!appForm.getUpass().equals(appForm.getRegRPass())){
        	addActionError("The passwords should match!");
        	return I;
        }
        
        /* Insert data into database */
        /* for now inserting md5 hash, later crypt (aes[des,md5])blob */
		// Start EntityManagerFactory
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("black");  //,new com.zajntan.util.DBConnector().mysql);

		// First unit of work
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		String uid = appForm.getUid();
		String upass = appForm.getUpass();
		
		logger.info("beginning transaction");
		try{
			logger.info("inside transaction");
			tx.begin();
	
			// Persist data
			RegisterModel register = new RegisterModel();
			register.setUid(uid);
			register.setUpass(upass);
			
			em.persist(register);
			tx.commit();
		} catch (Exception e) {
			logger.info("#Hibernate Exception: " + e);
			return E;
		} finally {
			em.close();
		}
		
		logger.info("completed transaction");
        return S;
    }

    private boolean isInvalid(String value) {
        return (value == null || value.length() == 0);
    }
}
