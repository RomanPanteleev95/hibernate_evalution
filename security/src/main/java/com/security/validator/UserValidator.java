package com.security.validator;

import com.security.model.User;
import com.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "required");
        if (user.getUserName().length() < 8 || user.getUserName().length() > 32) {
            errors.rejectValue("username", "MNOGO_MALO");
        }

        if (userService.findByUserName(user.getUserName()) != null) {
            errors.rejectValue("username", "Uze Est'");
        }
    }
}
