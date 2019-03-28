package ejemplo05beans.beans6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ejemplo05beans.beans3.Coche;

public class LanzadorSpring {
	public static ApplicationContext context;

	static {
		context = new ClassPathXmlApplicationContext("beans6.xml");
	}

	public static void main(String[] args) {
		// Coche coche = context.getBean("toyotaYaris",Coche.class);
		// System.out.println(coche.getMotor());
		Coche coche = context.getBean("pepinoYaris", Coche.class);
		System.out.println(coche.getMotor());
	}
}
