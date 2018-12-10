package polymorphism3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// 1. Spring 컨테이너를 생성(구동)한다. 
		ClassPathXmlApplicationContext container = 
			new ClassPathXmlApplicationContext("springConfig.xml");
		
//		// 2. Spring 컨테이너로부터 테스트할 객체를 검색(Lookup)한다.
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
