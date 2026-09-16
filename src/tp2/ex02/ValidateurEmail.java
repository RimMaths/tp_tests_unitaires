package ex02;

public class ValidateurEmail {
    public boolean estValide(String email) {

        if (email == null || email.isEmpty()) {
            return false;
        }

        return email.contains("@") && email.contains(".");
    }
}
