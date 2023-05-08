import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    final Integer uid;
    final String username;
    final String password;
    final String email;
    final Integer phoneNumber;
    final String address;
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
    private static final String PHONE_REGEX = "^\\d{10}$";

    private User(Builder builder) {
        this.uid = builder.uid;
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    public Integer getUid() {
        return uid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }


    public static class Builder {
        private final Integer uid;
        private final String username;
        private String password;
        private String email;
        private Integer phoneNumber;
        private String address;
        public Builder(Integer uid, String username) {
            this.uid = uid;
            this.username = username;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumber(Integer phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        private final boolean isEmailValid(String email) {
            Pattern pattern = Pattern.compile(EMAIL_REGEX);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }

        public static boolean isPhoneNumberValid(Integer phone) {
            Pattern pattern = Pattern.compile(PHONE_REGEX);
            Matcher matcher = pattern.matcher(String.valueOf(phone));
            return matcher.matches();
        }
        

        public User build() throws IllegalStateException {
            validate();
            return new User(this);
        }

        private void validate() throws IllegalStateException {
            if (username == null) {
                System.out.println("Username must not be null.");
            } else if (username.length() < 6) {
                System.out.println("Username must have at least 6 characters.");
            } else if (username.length() > 100) {
                System.out.println("Username cannot have more than 100 characters.");
            }
            if (password == null) {
                System.out.println("Password must not be null.");
            } else if (password.length() < 6) {
                System.out.println("Password must have at least 6 characters.");
            } else if (password.length() > 100) {
                System.out.println("Password cannot have more than 100 characters.");
            }
            if (email != null && !isEmailValid(email)) {
                System.out.println("Email id is invalid.");
            }
            if (address == null) {
                System.out.println("Address must not be null.");
            }
            if (phoneNumber != null && !isPhoneNumberValid(phoneNumber)) {
                System.out.println("Phone number is invalid.");
            }
        }

    }
}