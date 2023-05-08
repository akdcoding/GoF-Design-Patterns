public class Client {

    public static User createUser(){
        User user = new User.Builder(1, "akshadathube")
        .password("akshada23")
        .email("akshada.thube@gmail.com")
        .phoneNumber(1234567890)
        .address("Long Beach, CA, 90815")
        .build();

        return user;
    }

    public static void main(String[] args){
        User user = createUser();
        System.out.println("User Created.");
        System.out.println("--------------------------------");
        System.out.println("User ID: "+ user.uid);
        System.out.println("Username: "+ user.username);
        System.out.println("Email: "+ user.email);
        System.out.println("Address: "+ user.address);
        System.out.println("Phone No.: "+ user.phoneNumber);
    }
}
