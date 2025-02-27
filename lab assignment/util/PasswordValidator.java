package util;

public class PasswordValidator {
    
    public boolean validate(String password) {
        Rules rules = new Rules();
        return rules.isValid(password);
    }

    private class Rules {
        public boolean isValid(String password) {
           if(password!=""){
		return true;
		}
	   else{
		return false;
		}
        }
    }
}
