/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Carlos Eduardo
 */
@WebService(serviceName = "Ler_Nome")
@Stateless()
public class Ler_Nome {



    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "Nome")
    public String Nome(@WebParam(name = "nome") String nome) {
        
        int idade = 10;
        
        return "nome: "+ nome + " idade: " + idade;
    }
}
