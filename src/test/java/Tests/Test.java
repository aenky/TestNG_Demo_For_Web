package Tests;

import Commons.*;

public class Test extends InitBrowser {


    @org.testng.annotations.Test
    public void loginwithIdPassword()
    {

         login.loginwithValidCredentials();
         pause(3);
         dashBoard.verifyTitle();






    }




}
