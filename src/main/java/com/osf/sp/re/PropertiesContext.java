package com.osf.sp.re;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class PropertiesContext {
	static Map<String,Object> ac = new HashMap<String,Object>();

	public static void main(String[] args) {
		InputStream is = PropertiesContext.class.getResourceAsStream("/re/ioc.properties");
		Properties p = new Properties();
		try {
			p.load(is);
			Iterator<Object> it = p.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next().toString();
				String className = p.getProperty(key);
				System.out.println("key : " + className);
				Class clazz = Class.forName(className);
				ac.put(key,clazz.newInstance());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
