package polymorphism3;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TVUser {
	public static void main(String[] args) {
		// 1. Spring �����̳ʸ� ����(����)�Ѵ�. 
		XmlBeanFactory container = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		// 2. Spring �����̳ʷκ��� �׽�Ʈ�� ��ü�� �˻�(Lookup)�Ѵ�.
		TV tv = (TV) container.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
