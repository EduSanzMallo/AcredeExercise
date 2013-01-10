package acrede

import org.grails.cxf.utils.EndpointType
import javax.jws.WebMethod
import javax.jws.WebResult
import javax.jws.WebService

@WebService
class UserService {

    static expose = EndpointType.JAX_WS

    @WebResult(name = 'users')
    @WebMethod(operationName = 'getUsers')
    List<User> exposeXML(){
        return User.list()
    }
}
