package validator;

/**
 * Created by rzzayed on 5/28/17.
 */
import java.util.ArrayList;
import java.util.List;
import model.Entities.UserForm;

public class UserValidator {

    public List<String> validate(UserForm userForm) {
        List<String> errors = new ArrayList<String>();
        String name = userForm.getUsername();
        if (name == null || name.trim().isEmpty()) {
            errors.add("User must have a name");
        }
        String password = userForm.getPassword();
        if (password == null || password.trim().isEmpty()) {
            errors.add("User must have a password");
        }
        return errors;
    }
}
