package com.mycompany.app;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiplicationTest {
  @Test
  @Parameters({"val1","val2"})
  public void mul(int v1,int v2) {
	  int finalmul=v1*v2;
	  System.out.println("Final Multiplication is "+finalmul);
  }
}
