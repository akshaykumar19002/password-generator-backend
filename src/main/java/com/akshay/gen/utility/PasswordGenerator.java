package com.akshay.gen.utility;

import com.akshay.gen.model.Password;

public class PasswordGenerator {

    private Password password;

    public PasswordGenerator(boolean upperCaseAllowed, boolean lowerCaseAllowed, boolean numberAllowed, boolean specialCharsAllowed) {
        password = new Password(upperCaseAllowed, lowerCaseAllowed, numberAllowed, specialCharsAllowed);
    }

    public String generatePassword(int length) {
        StringBuilder builder = new StringBuilder();
        int min = 0, max = password.getAllowedChars().length() - 1;
        for (int i = 0; i < length; i++) {
            builder.append(password.getAllowedChars().charAt((int) (Math.random() * (max - min + 1))));
        }

        return builder.toString();
    }
}
