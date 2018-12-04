package com.srm.test.clientinfo.expose.web;

import com.srm.test.clientinfo.model.ClientInfoRequest;
import com.srm.test.clientinfo.model.ClientInfoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/clienteinfo/client")
public class ClientController {

    /**
     * Servicio que permite crear una nueva asistencia en skola
     * @return Boolean true
     * @throws IOException
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> assistanceCreate(@RequestBody ClientInfoRequest clientInfoRequest)
            throws IOException {

        ClientInfoResponse clientInfoResponse = new ClientInfoResponse();

        clientInfoResponse.setResult("Prueba conexion");

//        MessageDto messageDto;
//        if(matterComunitySectionId == null){
//            messageDto = new MessageDto();
//            messageDto.setSuccess(false);
//            messageDto.setErrorCode("SK-002");
//            messageDto.setMessage(systemMessage.getMessage("SK-002"));
//            return new ResponseEntity<>(messageDto, HttpStatus.BAD_REQUEST);
//        }
//
//        messageDto = assistanceBF.createAssistance(matterComunitySectionId, assistanceDto);
//        if(messageDto.getSuccess()){
//            return ResponseEntity.ok(messageDto);
//        }

        return new ResponseEntity<>(clientInfoResponse,HttpStatus.ACCEPTED);
    }

}
