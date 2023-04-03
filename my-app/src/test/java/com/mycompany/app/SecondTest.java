package com.mycompany.app;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SecondTest {
  @Test
  public void f() {
	  System.out.println("First Test");
  }
  @Test
  public void s() {
	  System.out.println("Second Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Execute Before Every Test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Execute After Every Test");
  }

}
