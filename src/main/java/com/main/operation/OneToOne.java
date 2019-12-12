package com.main.operation;
import javax.persistence.*;
import com.main.java.Dept1;
import com.main.java.Emp1;
public class OneToOne {
	
		public static void main(String[] args)
		{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("PERSISTENCE_UNIT_NAME");
			EntityManager em=emf.createEntityManager();
			Emp1 e1=new Emp1();
			Dept1 d1=new Dept1();
			d1.setDname("slaes");
			e1.setEname("ravindra");
			e1.setSalary(20000);
			e1.setDeg("employee");
			e1.setD(d1);
			//transaction begin
			em.getTransaction().begin();
			
			em.persist(d1);
			em.persist(e1);
			
			
			//transaction end
			em.getTransaction().commit();
			em.close();
			emf.close();
		}
}
