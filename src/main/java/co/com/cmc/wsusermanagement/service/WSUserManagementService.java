package co.com.cmc.wsusermanagement.service;

import co.com.cmc.wsusermanagement.generated.AuthInformation;
import co.com.cmc.wsusermanagement.generated.User;
import co.com.cmc.wsusermanagement.generated.UserRequest;
import co.com.cmc.wsusermanagement.generated.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class WSUserManagementService {

    public UserResponse getUsers(UserRequest userRequest){
        //Envía petición a http://IOAuthenticationSystem/UserManagement/rest/UserService/users
        List<User> userList = new ArrayList<User>();
        UserResponse userResponse = new UserResponse();
        AuthInformation authInformation = new AuthInformation();
        authInformation.setAuthDate(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
        authInformation.setAuthHour("08:00");
        authInformation.setAuthAttempts(2);
        User user = new User();
        user.setName("Jorge Vargas");
        user.setEmail("jorge@mail.com");
        user.setTel("1234567");
        user.setCode("123");
        user.setAuth(authInformation);
        userList.add(user);
        userResponse.setUserList(userList);
        if(userList.size() > 3){
            log.error("Error en la longitud de userList");
            return null;
        }
        return userResponse;

    }
}
