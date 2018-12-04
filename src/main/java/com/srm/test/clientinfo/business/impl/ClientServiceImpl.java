package com.srm.test.clientinfo.business.impl;

import com.srm.test.clientinfo.business.ClientService;
import com.srm.test.clientinfo.model.ClientInfoRequest;
import com.srm.test.clientinfo.model.ClientInfoResponse;
import org.springframework.stereotype.Service;

/**
 * <br/> Clase service que contiene los metodos necesarios para tramitar la data
 * y logica de negocio que consumira la clase REST PollServiceImpl<br/>
 * <b>Class</b>: PollServiceImpl<br/>
 * Copyright: &copy; 2018 Banco de Cr&eacute;dito del Per&uacute;.<br/>
 * Company: Banco de Cr&eacute;dito del Per&uacute;.<br/>
 *
 * @author Banco de Cr&eacute;dito del Per&uacute; (BCP) <br/>
 * <u>Service Provider</u>: Everis <br/>
 * <u>Developed by</u>: <br/>
 * <ul>
 * <li>Jean Quero</li>
 * </ul>
 * <u>Changes</u>:<br/>
 * <ul>
 * <li>Feb 14, 2018 Creaci&oacute;n de Clase.</li>
 * </ul>
 * @version 1.0
 */

@Service
class ClientServicImpl implements ClientService {

  @Override
  public ClientInfoResponse save(ClientInfoRequest clientInfoRequest) {

    return null;
  }
}
