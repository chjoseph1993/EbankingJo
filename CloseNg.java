package com.ebanking.master;

import org.testng.annotations.Test;

public class CloseNg extends Base{
  @Test
  public void close() {
	  LB.close();
  }
}
