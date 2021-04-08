package org.padmini.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLife1 implements InitializingBean , DisposableBean {
	
		public void afterPropertiesSet() throws Exception {
			System.out.println("Initializing bean using interfaces");
		}	
		public void destroy() throws Exception {
			System.out.println("Destroying the bean using interfaces");
		}

		public void life(){
			System.out.println("Bean life cycle mtds using initializing and disposable bean ");
		}
	}
