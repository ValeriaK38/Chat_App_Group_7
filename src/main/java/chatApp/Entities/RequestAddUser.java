package chatApp.Entities;

public class RequestAddUser {

    private String nickName;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String description;
    private String url;

    private String privacyStatus;

    public RequestAddUser() {
    }

    /**
     * Request class to add user from client
     *
     * @param nickName
     * @param email
     * @param password
     * @param firstName
     * @param lastName
     * @param dateOfBirth
     * @param description
     * @param url           link to verification page
     * @param privacyStatus
     */
    public RequestAddUser(String nickName, String email, String password, String firstName, String lastName, String dateOfBirth, String description, String url, String privacyStatus) {
        this.nickName = nickName;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.description = description;
        this.url = url;
        this.privacyStatus = privacyStatus;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPrivacyStatus() {
        return privacyStatus;
    }

    public void setPrivacyStatus(String privacyStatus) {
        this.privacyStatus = privacyStatus;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "RequestAddUser{" +
                "nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", privacyStatus='" + privacyStatus + '\'' +
                '}';
    }
}
