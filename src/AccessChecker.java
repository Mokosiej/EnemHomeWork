public interface AccessChecker {
    boolean isAllowed(String url, UserType userType);
}