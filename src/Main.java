import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Help me pls");

		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		empresa u=new empresa("1325767984Z","Pepe","Maincra",12);
		session.save(u);
		session.getTransaction().commit();
		session.beginTransaction();
		item i=new item("Alcachofa",80000);
		i.setId(0);
		session.save(i);
		session.getTransaction().commit();
		session.beginTransaction();
		empresa e=session.get(empresa.class, "1325767984Z");
		System.out.println(e.toString());
		session.getTransaction().commit();
		session.close();
		HibernateUtilities.getSessionFactory().close();
	}

}
