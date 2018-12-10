package polymorphism3;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TVUser {
	public static void main(String[] args) {
		// 1. Spring 컨테이너를 생성(구동)한다. 
		XmlBeanFactory container = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		// 2. Spring 컨테이너로부터 테스트할 객체를 검색(Lookup)한다.
		TV tv = (TV) container.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
