package com.ebanking.master;

import org.testng.annotations.Test;

public class logoutNg extends Base{
  @Test
  public void logout() {
	  LB.logout();
  }
}
