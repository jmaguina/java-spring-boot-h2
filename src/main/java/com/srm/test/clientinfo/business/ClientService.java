package com.srm.test.clientinfo.business;

import com.srm.test.clientinfo.model.ClientInfoRequest;
import com.srm.test.clientinfo.model.ClientInfoResponse;

/**
 * <br/> Clase Interfaz del Servicio para la logica de negocio que consumira
 * la clase REST ClientService<br/>
 */

public interface ClientService {

  ClientInfoResponse consult(ClientInfoRequest clientInfoRequest);
}
