package com.java.learning.driver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.java.learning.model.Product;
import com.learning.dao.ProductDAO;
import com.learning.dao.impl.ProductDAOImpl;

public class ProductDriver {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ProductDAO productDAO = new ProductDAOImpl();
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(in);
		
		do {
			System.out.println("");
			System.out.println("MENU");
			System.out.println("1. Insert");
			System.out.println("2. Read by Priduct id");
			System.out.println("3. Update");
			System.out.println("4. Delete");
//			System.out.println("5. Fetch All data");
			System.out.println("5. Exit ");
			System.out.println("");
		
			int input = Integer.parseInt(br.readLine());
		
			switch (input) {
			case 1:
					System.out.println("Enter your Product Id");
					int pId=Integer.parseInt(br.readLine());
					System.out.println("Enter your Product Name");
					String pName=br.readLine();
					System.out.println("Enter your Product Price");
					int pPrice=Integer.parseInt(br.readLine());
					System.out.println("Enter your Product Supplier");
					String pSupplier=br.readLine();
					
					Product product1 = new Product(pId,pName, pPrice,pSupplier);
					
					productDAO.saveProduct(product1);
					System.out.println("Data of Product Id "+pId+" inserted Sucessfully");
					
				break;
			case 2:
				System.out.println("Enter your Product Id");
				int pId2=Integer.parseInt(br.readLine());
				System.out.println(productDAO.getProduct(pId2));
				
				break;
			case 3:
				System.out.println("Enter your Product Id");
				int pId3=Integer.parseInt(br.readLine());
				System.out.println("Do you want to update your Product name (Y/N)");
				String pName3=br.readLine();
				
				Product product3=productDAO.getProduct(pId3);
				if(pName3.equals("Y")||pName3.equals("y")) {
					System.out.println("Enter your new Product Name");
					String p_Name=br.readLine();
					product3.setProductName(p_Name);
				}
				System.out.println("Do you want to update your Product Supplier (Y/N)");
				String pSupplier3=br.readLine();
				if(pSupplier3.equals("Y")||pSupplier3.equals("y")) {
					System.out.println("Enter your new  Product Supplier");
					String p_Supplier=br.readLine();
					product3.setProdictSupplier(p_Supplier);
				}
				System.out.println("Do you want to update your Course Fees (Y/N)");
				String pPrice3=br.readLine();
				if(pPrice3.equals("Y")||pPrice3.equals("y")) {
					System.out.println("Enter your new Product Price");
					int p_Price= Integer.parseInt(br.readLine());
					product3.setProductPrice(p_Price);
				}
				productDAO.updateProduct(product3);
				System.out.println("Data of Product Id "+pId3+" is Updated Sucessfully");
				break;
			case 4:
				System.out.println("Enter you Course ID");
				int pId4 = Integer.parseInt(br.readLine());
				Product product4 = productDAO.getProduct(pId4);
				productDAO.deleteProduct(product4);
				System.out.println("Data of Product Id "+pId4+" is deleted Sucessfully");
				break;
//			case 5:
//				List<Product> product4=productDAO.createQuery("from Product").list();
//				break;
			case 5:
				System.exit(0);
				break;
			default: 
				System.out.println("Do you want to continue (Y/N)");
				String output= br.readLine();
				if(output.equals("N") || output.equals("n")) {
					System.exit(0);	
			}
		}
			
		}while(true);

	}

}
