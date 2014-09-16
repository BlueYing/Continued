package com.he;

import java.io.Serializable;

public class HmacInfo implements Serializable {

  private static final long serialVersionUID = -6073455157100507008L;
  private String hmac_type;
  private String hmac_value;
  public String getHmac_type() {
    return hmac_type;
  }
  public void setHmac_type(String hmac_type) {
    this.hmac_type = hmac_type;
  }
  public String getHmac_value() {
    return hmac_value;
  }
  public void setHmac_value(String hmac_value) {
    this.hmac_value = hmac_value;
  }
  
  
}
