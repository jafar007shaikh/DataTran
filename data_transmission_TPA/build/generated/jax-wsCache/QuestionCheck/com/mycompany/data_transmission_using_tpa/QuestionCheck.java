
package com.mycompany.data_transmission_using_tpa;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "QuestionCheck", targetNamespace = "http://data_transmission_using_tpa.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface QuestionCheck {


    /**
     * 
     * @param ans
     * @param qid
     * @param email
     * @return
     *     returns int
     */
    @WebMethod(operationName = "AuthenticateService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AuthenticateService", targetNamespace = "http://data_transmission_using_tpa.mycompany.com/", className = "com.mycompany.data_transmission_using_tpa.AuthenticateService")
    @ResponseWrapper(localName = "AuthenticateServiceResponse", targetNamespace = "http://data_transmission_using_tpa.mycompany.com/", className = "com.mycompany.data_transmission_using_tpa.AuthenticateServiceResponse")
    @Action(input = "http://data_transmission_using_tpa.mycompany.com/QuestionCheck/AuthenticateServiceRequest", output = "http://data_transmission_using_tpa.mycompany.com/QuestionCheck/AuthenticateServiceResponse")
    public int authenticateService(
        @WebParam(name = "Email", targetNamespace = "")
        String email,
        @WebParam(name = "Qid", targetNamespace = "")
        String qid,
        @WebParam(name = "Ans", targetNamespace = "")
        String ans);

}