package ua.com.profile;

public class UserProfile {
    int birth;
    int currentYear;

    public static boolean isPositive(int birth){
        return birth > 0;
    }

    public String rememberTheName(String name){
        return name;
    }

    public int personAge(int currentYear, int birth){
        return currentYear - birth;
    }

    public static void main(String[] args) {
        start();
    }

    public static void start() {

        System.out.println("JAR FILE RUNNING!");

    }
}
