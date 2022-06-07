package co.com.cmc.wsusermanagement.endpoint;

import co.com.cmc.wsusermanagement.generated.User;
import co.com.cmc.wsusermanagement.generated.UserRequest;
import co.com.cmc.wsusermanagement.generated.UserResponse;
import co.com.cmc.wsusermanagement.service.WSUserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class UserManagementEndpoint {

    private  static final String NAMESPACE = "http://spring.io/soap/UserManagement";

    @Autowired
    private WSUserManagementService service;

    @PayloadRoot(namespace = NAMESPACE, localPart = "UserRequest")
    @ResponsePayload
    public UserResponse getUsers(@RequestPayload UserRequest user){
        return service.getUsers(user);
    }
}
