package co.DevelHopeHelloWorld.DeployEnvironmentsVariables1.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Value("${myCustomProps.authCode}")
    String authCode;

    @Value("${myCustomProps.devName}")
    String devName;

    @GetMapping("/")
    public String getDevName(){
        return "welcomeeee"+" "+ devName+" "+authCode ;
    }
    /*GetMapping("/authCode")
    public String getAuthCode(){
        return authCode;
    }*/


}
