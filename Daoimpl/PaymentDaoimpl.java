package com.food.Daoimp;
import java.util.List;
import java.util.Scanner;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.Util.HibernateUtil;
import com.food.Dao.PaymentDao;
import com.food.entity.Payment;

public class PaymentDaoimpl implements PaymentDao{
	Scanner sc=new Scanner(System.in);
	@Override
	public Payment createPayment(Payment payment) {
	
			try(Session session=HibernateUtil.getSession()) {
				
				session.beginTransaction();
				session.save(payment); // Save payment entity to the database
				session.getTransaction().commit(); // Commit transaction
				return payment;
				
			}
			catch (HibernateException e) {
				System.out.println(e);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			
			return null;
		}

	@Override
	public Payment getPayment(String paymentID) {
		try(Session session=HibernateUtil.getSession()) {
			
			Payment payment=session.get(Payment.class, paymentID);
				return payment;
				
			}
			catch (HibernateException e) {
				System.out.println(e);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		return null;
	}
	@Override
	public List<Payment> getAllPayments() {
		try(Session session=HibernateUtil.getSession()) {
			
			//execute HQL query to retrieve all students data
			Query<Payment> query=session.createQuery("FROM Payment");
			List<Payment> payList=query.list();
			return payList;
			
		}
		catch (HibernateException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}
	
	@Override
	public Payment updatePayment(String pId, Payment pay) {
		try(Session session=HibernateUtil.getSession()) {
			Payment payment=session.get(Payment.class, pId);
				session.beginTransaction();
				
				payment.setPaymentID(pId);
				payment.setPaymentDate(pay.getPaymentDate());
				payment.setPaymentAmount(pay.getPaymentAmount());
				payment.setPaymentStatus(pay.getPaymentStatus());
				payment.setPaymentMethod(pay.getPaymentMethod());
				
				session.saveOrUpdate(payment); //Update payment in DB
				session.getTransaction().commit(); //commit changes
				return payment;
			
		}
		catch (HibernateException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public String deletePayment(String id) {
		String message=null;
		try(Session session=HibernateUtil.getSession()) {
			Payment payment=session.get(Payment.class, id);
				session.beginTransaction();
				System.out.println("Are you sure  you want to delete?");
				String status=sc.next();
				if(status.equalsIgnoreCase("yes"))
				{
					session.delete(payment);//data will be deleted from DB
					session.getTransaction().commit();
					session.evict(payment);//data will remove from session Cache
					message="Object is deleted";
					
				}
				else
				{
					message="User wants to retain this object!!";
				}
				
		}
		catch (HibernateException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return message;

}
}
