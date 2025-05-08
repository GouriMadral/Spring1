package com.food.Daoimp;

import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.Util.HibernateUtil;
import com.food.entity.Categories;

public class CategoriesDaoimpl {
	Scanner sc=new Scanner(System.in);
	public Categories createCategories(Categories categories) {
		try(Session session=HibernateUtil.getSession()) {
			
			session.beginTransaction();
			session.save(categories); // Save category entity to the database
			session.getTransaction().commit(); // Commit transaction
			return categories;
			
		}
		catch (HibernateException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}

	public List<Categories> getAllCategories() {
		try(Session session=HibernateUtil.getSession()) {
			
			//execute HQL query to retrieve all students data
			Query<Categories> query=session.createQuery("FROM Categories");
			List<Categories> categoriesList=query.list();
			return categoriesList;
			
		}
		catch (HibernateException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}


	public Categories getCategories(String catID) {
		
			try(Session session=HibernateUtil.getSession()) {
					
				Categories categories=session.get(Categories.class, catID);
					return categories;
				}
				catch (HibernateException e) {
					System.out.println(e);
				}
				catch (Exception e) {
					System.out.println(e);
				}
				
				return null;
			}

	

	public Categories updateCategories(String catId, Categories categories) {
		try(Session session=HibernateUtil.getSession()) {
			Categories category=session.get(Categories.class, catId);
				session.beginTransaction();
				
				category.setID(catId);
				category.setVeg(categories.getVeg());
				category.setPrice(categories.getPrice());
				
				
				session.saveOrUpdate(category); //Update category in DB
				session.getTransaction().commit();  // Commit changes
				return category;
			
		}
		catch (HibernateException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public String deleteCategories(String id) {
		String message=null;
		try(Session session=HibernateUtil.getSession()) {
			Categories categories=session.get(Categories.class, id);
				session.beginTransaction();
				System.out.println("Are you sure  you want to delete?");
				String status=sc.next();
				if(status.equalsIgnoreCase("yes"))
				{
					session.delete(categories);//data will be deleted from DB
					session.getTransaction().commit();
					session.evict(categories);//data will remove from session Cache
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
