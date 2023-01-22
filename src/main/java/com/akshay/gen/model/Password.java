package com.akshay.gen.model;

/**
 * 
 *
 */
public class Password {

   private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
   private static final String NUMBERS = "1234567890";
   private static final String SYMBOLS = ")(*&%$#@!-_?~";

   private String allowedChars = "";

   private String password;

   public Password() {

   }

   public Password(String password) {
       this.password = password;
   }

   public Password(boolean upperCaseAllowed, boolean lowerCaseAllowed, boolean numberAllowed, boolean specialCharsAllowed) {
       if (upperCaseAllowed)
           allowedChars += UPPERCASE_CHARS;
       if (lowerCaseAllowed)
           allowedChars += LOWERCASE_CHARS;
       if (numberAllowed)
           allowedChars += NUMBERS;
       if (specialCharsAllowed)
           allowedChars += SYMBOLS;
   }

   private int getStrengthScore() {
       boolean upperCase = false, lowerCase = false, numbers = false, specialChars = false;
       int score = 0;
       String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}";

       for (char ch: password.toCharArray()) {
           if (Character.isUpperCase(ch))
               upperCase = true;
           else if (Character.isLowerCase(ch))
               lowerCase = true;
           else if (Character.isDigit(ch))
               numbers = true;
           else if (specialCharacters.contains(Character.toString(ch)))
               specialChars = true;
       }
       if (upperCase)
           score += 1;
       if (lowerCase)
           score += 1;
       if (numbers)
           score += 1;
       if (specialChars)
           score += 1;
       if (password.length() >= 8)
           score += 1;
       if (password.length() >= 12)
           score += 1;
       return score;
   }

   public String getStrength() {
       String strength = "";
       int score = getStrengthScore();
       if (score == 6)
           return "Excellent Password";
       if (score == 5)
           return "Good Password";
       if (score == 4)
           return "Medium Password";
       return "Weak Password";
   }

   public String getPassword() {
       return password;
   }

   public void setPassword(String password) {
       this.password = password;
   }

   public String getAllowedChars() {
       return allowedChars;
   }

}
