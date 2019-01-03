package LogIn;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;



public class LoggingIn extends CommonAPI {

    public void LogInPage (){
        SignInClick ("body > div:nth-child(1) > div > div.nfHeader.signupBasicHeader > a.authLinks.signupBasicHeader");
        TypeElementAndEnter("userLoginId", "fikriyearda@hotmail.com");
        SignInPass("password", "abcd1234");
        SignInButton("#appMountPoint > div > div.login-body > div > div > div.hybrid-login-form-main > form > button");
        clearFeild("#id_userLoginId");

        TypeElementAndEnter("userLoginId", "raynshila14@gmail.com");
        SignInPass("password", "abcd1234");
        SignInButton("#appMountPoint > div > div.login-body > div > div > div.hybrid-login-form-main > form > button");
    }



}


