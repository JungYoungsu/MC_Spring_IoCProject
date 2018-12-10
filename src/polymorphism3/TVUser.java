package polymorphism3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// 1. Spring �����̳ʸ� ����(����)�Ѵ�. 
		ClassPathXmlApplicationContext container = 
			new ClassPathXmlApplicationContext("springConfig.xml");
		
//		// 2. Spring �����̳ʷκ��� �׽�Ʈ�� ��ü�� �˻�(Lookup)�Ѵ�.
		TV tv1 = (TV) container.getBean("tv");
		TV tv2 = (TV) container.getBean("tv");
		TV tv3 = (TV) container.getBean("tv");
		System.out.println(tv1.toString());
		System.out.println(tv2.toString());
		System.out.println(tv3.toString());
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
	}
}
