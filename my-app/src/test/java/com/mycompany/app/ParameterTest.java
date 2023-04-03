package com.mycompany.app;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
  @Test
  @Parameters({"val1","val2"})
  public void sum(int v1,int v2) {
	  int finalsum=v1+v2;
	  System.out.println("Final Sum is "+finalsum);
  }
  @Test
  @Parameters({"val1","val2"})
  public void diff(int v1,int v2) {
	  int finaldiff=v1-v2;
	  System.out.println("Final diffrence is "+finaldiff);
  }
  @Test
  @Parameters("message")
  public void OP(@Optional("Optional Parameter selected") String s1) {     //...if we call @Optional then no need to declare value in XML file
	  System.out.println(s1);
}
  @Test
  @Parameters({"value1","value2"})
  public void div(@Optional("40")int v1,@Optional("20")int v2) {            //...if we call @Optional then no need to declare value in XML file
	  int finaldiv=v1/v2;
	  System.out.println("Final division is "+finaldiv);
	  
  }
}
