package Task3_ATM_Interface;

public class UserVerfication {
    boolean Verification (String id, String pin) {
        String userAccountNumber = "2787017279";
        String userPin = "1234";

        if(id.compareTo(userAccountNumber)==0 && pin.compareTo(userPin)==0){
            return true;
        }
        else{
            return false;
        }
    }
}
