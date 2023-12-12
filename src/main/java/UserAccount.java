public class UserAccount {
    
    private String email;
    private String password;
    private String phoneNumber;
    private String bankID;
    private boolean rememberMe;


    public boolean verifyCredentials(String username,String password){
        boolean isVerified = false;

        return isVerified;
    }
    public String startBankID(String personnummer) {
        String bankID = "";

        return bankID;
    }

    public boolean startPhoneVerification(){
        boolean isVerified = false;

        return isVerified;

    }

    public boolean requestSMSCode(String provider) {
        boolean isRequested  = false;

        return isRequested;
    }

    public boolean verifySMSCode(String code) {
        boolean isVerified = false;
        

        return isVerified;
    }

    public boolean changePassword(String newPwd){
        boolean isChanged = false;

        return isChanged;
    }

    public boolean changeEmail(String newEmail){
        boolean isChanged = false;

        return isChanged;
    }

    public boolean deleteAccount() {
        boolean isDeleted = false;
        
        return isDeleted;
    }
}
