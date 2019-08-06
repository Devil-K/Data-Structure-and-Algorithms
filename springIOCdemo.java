package com.test.DCAA;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class springIOCdemo {
public static void main(String[] args)throws  Exception{
	ApplicationResouceReader arr=new ApplicationResouceReader("usertest.xml");
	User user =(User) arr.getBean("user1");
	
	System.out.println(user.toString());
}
}
class ApplicationResouceReader{
	private String url;
	public ApplicationResouceReader(String url){
		this.url=url;
	}
	public Object getBean(String id) throws  Exception{
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(url);
		SAXReader reader = new SAXReader();
		Document doc = reader.read(inputStream);
		
		//解析XML获取到bean Id的节点
		Element beans = doc.getRootElement();
		List<Element> beanList = beans.elements();
		Element ele;
		for (int i = 0; i <beanList.size(); i++) {
			ele=beanList.get(i);
			if(!ele.attributeValue("id").equals(id)){
				continue;
			}
			String beanClass = ele.attributeValue("class");
			Class<?> forName = Class.forName(beanClass);
			List<Element> attrslist = ele.elements();
			Object userInstance = forName.newInstance();
			//对属性进行赋值
			for (int j = 0; j < attrslist.size(); j++) {
				String key_zhi = attrslist.get(j).attributeValue("key");
				//获取到KEY里面的name和sex
				Field field = forName.getDeclaredField(key_zhi);
				String value_zhi=attrslist.get(j).attributeValue("value");
				field.setAccessible(true);//设置成可以为私有属性赋值
				field.set(userInstance,value_zhi );			
			}
			return userInstance;
			
		}
		
		
		
		return null;
	}
	
	
}