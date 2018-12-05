package com.srm.test.clientinfo.expose.web;

import com.srm.test.clientinfo.business.ClientService;
import com.srm.test.clientinfo.model.ClientInfoRequest;
import com.srm.test.clientinfo.model.ClientInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author Cesar.
 * @version 1.0
 */
@RestController
@RequestMapping("/clienteinfo/client")
public class ClientController {

    @Autowired
    public ClientService clientService;

    /**
     *
     * @param clientInfoRequest
     * @return
     * @throws IOException
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> clientController(@RequestBody ClientInfoRequest clientInfoRequest)
            throws IOException {

        ClientInfoResponse clientInfoResponse = clientService.consult(clientInfoRequest);

        return new ResponseEntity<>(clientInfoResponse,HttpStatus.ACCEPTED);
    }

}
