package com.srm.test.clientinfo.business.impl;

import static com.srm.test.clientinfo.util.Constants.tipoA;
import static com.srm.test.clientinfo.util.Constants.tipoB;
import static com.srm.test.clientinfo.util.Constants.tipoC;
import com.srm.test.clientinfo.business.ClientService;
import com.srm.test.clientinfo.model.ClientInfoRequest;
import com.srm.test.clientinfo.model.ClientInfoResponse;
import com.srm.test.clientinfo.persistence.Client;
import com.srm.test.clientinfo.persistence.ClientRepository;
import com.srm.test.clientinfo.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Cesar.
 * @version 1.0
 */

@Service
class ClientServiceImpl implements ClientService {

  @Autowired
  ClientRepository clientRepository;

  @Override
  public ClientInfoResponse consult(ClientInfoRequest clientInfoRequest) {

    ClientInfoResponse clientInfoResponse = new ClientInfoResponse();

    if (clientInfoRequest.getInterestList().equalsIgnoreCase(tipoA))
      clientInfoResponse.setResult("El resultado se mantiene igual Nombre de cliente: "
              + clientInfoRequest.getClienteName() + " Limite de credito: "
              + clientInfoRequest.getLimitedCredit());

    if (clientInfoRequest.getInterestList().equalsIgnoreCase(tipoB))
      clientInfoResponse.setResult("El riesgo para : "
              + clientInfoRequest.getClienteName() + " es "
              + Utils.interestRate(clientInfoRequest.getInterestList(), clientInfoRequest.getLimitedCredit()));
    if (clientInfoRequest.getInterestList().equalsIgnoreCase(tipoC))
      clientInfoResponse.setResult("El riesgo para : "
              + clientInfoRequest.getClienteName() + " es "
              + Utils.interestRate(clientInfoRequest.getInterestList(), clientInfoRequest.getLimitedCredit()));

    clientRepository.save(new Client(10001L, clientInfoRequest.getClienteName(),
            clientInfoRequest.getLimitedCredit().toString(), clientInfoRequest.getInterestList(),
            Utils.interestRate(clientInfoRequest.getInterestList(), clientInfoRequest.getLimitedCredit()).toString()));

    return clientInfoResponse;
  }
}
