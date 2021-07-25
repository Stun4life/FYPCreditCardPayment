package com.example.fypcreditcardpayment;

import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;

public class Client {
    String clientId = "sb-qvnz76724315@business.example.com";
    String clientSecret = "AT-Z0Q5rr2dovOKdJ0M8r-i9mz-XcoSDrE2idBX9zyPOjABdhcJRWxVXfg75ycM_vb93WRcadSTntzf2";

    APIContext context = new APIContext(clientId, clientSecret, "sandbox");
}
