package org.dafe.tripTix.controller.validators;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class UserPasswordValidator implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return true;
    }
}
