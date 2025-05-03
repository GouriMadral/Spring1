package com.food.Daoimp;
import java.util.List;
import java.util.Scanner;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.Util.HibernateUtil;
import com.food.Dao.AdminDao;
import com.food.entity.Admin;

public class AdminDaoimpl implements AdminDao{
	Scanner sc=new Scanner(System.in);
	@Override
	public Admin createAdmin(Admin admin) {
		try(Session session=HibernateUtil.getSession()) {
			
			session.beginTransaction();
			session.save(admin); // Save admin entity to the database
			session.getTransaction().commit();  // Commit transaction
			return admin;
			
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
	public List<Admin> getAllAdmin() {
		try(Session session=HibernateUtil.getSession()) {
			
			//execute HQL query to retrieve all students data
			Query<Admin> query=session.createQuery("FROM Admin");
			List<Admin> adminList=query.list();
			return adminList;
			
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
	public Admin getAdmin(String adminID) {
		
			try(Session session=HibernateUtil.getSession()) {
					
				Admin admin=session.get(Admin.class, adminID); // Fetch admin by ID
					return admin;
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
	public Admin updateAdmin(String adminID,Admin updatedAdmin) {
		try(Session session=HibernateUtil.getSession()) {
			Admin admin=session.get(Admin.class, adminID);
				session.beginTransaction();
				// Set updated fields
				admin.setAdminID(adminID);
				admin.setContactNo(updatedAdmin.getContactNo());
				admin.setName(updatedAdmin.getName());
				admin.setEmailAddress(updatedAdmin.getEmailAddress());
				
				session.saveOrUpdate(admin); //Update admin in DB
				session.getTransaction().commit();  // Commit changes
				return admin;
			
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
	public String deleteAdmin(String adminID) {
		String message=null;
		try(Session session=HibernateUtil.getSession()) {
			Admin admin=session.get(Admin.class, adminID);
				session.beginTransaction();
				System.out.println("Are you sure  you want to delete?");
				String status=sc.next();
				if(status.equalsIgnoreCase("yes"))
				{
					session.delete(admin);//data will be deleted from DB
					session.getTransaction().commit();
					session.evict(admin);//data will remove from session Cache
					message="Object is deleted";
					
				}else
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
