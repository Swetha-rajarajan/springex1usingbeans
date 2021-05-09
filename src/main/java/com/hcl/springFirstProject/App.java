package com.hcl.springFirstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
    	
    	ApplicationContext ac;
    	
    	ac = new ClassPathXmlApplicationContext("product.xml");
    	
    	//Product product = ac.getBean(Product.class);
    	
    	Product product = (Product) ac.getBean("p2");
    	
    	//System.out.println("product id : " + product.getProductId());
    	//System.out.println("product name : " + product.getProductName());
    	
    	/*System.out.println(product.getProductId());
    	System.out.println(product.getProductName());
    	System.out.println(product.getProductPrice());
    	System.out.println(product.getProductQty()); */
    	
    	product.display();
    	
    }
}
