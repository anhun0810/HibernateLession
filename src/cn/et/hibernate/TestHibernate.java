package cn.et.hibernate;


import org.hibernate.Session;

import cn.et.hibernate.dao.Food;

public class TestHibernate {
	public static void main(String[] args) {
		updateFood();
	}
	public static void saveFood(){
		Session session = HibernateSessionFactory.getSession();
		Food food = new Food();
		food.setFoodname("Æ¡¾ÆÑ¼");
		food.setImagepath("/aaa");
		food.setPrice(10);
		session.getTransaction().begin();
		session.save(food);
		session.getTransaction().commit();
	}
	public static void deleteFood(){
		Session session = HibernateSessionFactory.getSession();
		Food food = new Food();
		food.setFoodid(9);
		session.getTransaction().begin();
		session.delete(food);
		session.getTransaction().commit();
	}
	public static void updateFood(){
		Session session = HibernateSessionFactory.getSession();
		Food food = new Food();
		food.setFoodid(5);
		food.setFoodname("222");
		food.setImagepath("/aaa");
		food.setPrice(100);
		session.getTransaction().begin();
		session.update(food);
		session.getTransaction().commit();
	}
	public static void queryFood(){
		Session session = HibernateSessionFactory.getSession();
		Food food = (Food)session.load(Food.class, 1);
		System.out.println(food.getFoodname());
	}
}
