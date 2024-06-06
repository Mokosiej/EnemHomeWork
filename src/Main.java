public class Main {
    public static void main(String[] args) {
        Person admin = new Person("Анна", 30, UserType.ADMIN);
        Person user = new Person("Иван", 25, UserType.USER);

        String[] testUrls = {
                "http://web-for-user.com",
                "http://web-for-user.com/resource",
                "http://restricted-site.com"
        };

        for (String url : testUrls) {
            System.out.println(admin.getName() + " (" + admin.getUserType().getRoleName() + ") доступ к " + url + ": " + AccessChecker.isAllowed(url, admin.getUserType()));
            System.out.println(user.getName() + " (" + user.getUserType().getRoleName() + ") доступ к " + url + ": " + AccessChecker.isAllowed(url, user.getUserType()));
        }
    }
}
