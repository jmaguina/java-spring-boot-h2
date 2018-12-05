package com.srm.test.clientinfo.business.impl;

import static com.srm.test.clientinfo.util.Constants.tipoA;
import com.srm.test.clientinfo.business.ClientService;
import com.srm.test.clientinfo.model.ClientInfoRequest;
import com.srm.test.clientinfo.model.ClientInfoResponse;
import org.springframework.stereotype.Service;

/**
 * @author Cesar.
 * @version 1.0
 */

@Service
class ClientServiceImpl implements ClientService {

  @Override
  public ClientInfoResponse consult(ClientInfoRequest clientInfoRequest) {


    ClientInfoResponse clientInfoResponse = new ClientInfoResponse();

    if (clientInfoRequest.getInterestList().equals(tipoA))
      clientInfoResponse.setResult("El resultado se mantiene igual");
    else
      clientInfoResponse.setResult("Tasa de interes variable");
    return clientInfoResponse;
  }
}
