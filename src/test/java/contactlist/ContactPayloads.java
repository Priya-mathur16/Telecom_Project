package contactlist;

public class ContactPayloads {

    public static String getNewUserPayload(String email) {
        return "{ \"firstName\":\"Kiran\", \"lastName\":\"Virupakshe\", \"email\":\"" + email + "\", \"password\":\"myPassword\" }";
    }

    public static String getUpdateUserPayload() {
        return "{ \"firstName\":\"Updated\", \"lastName\":\"Username\", \"email\":\"updated_user@gmail.com\", \"password\":\"myNewPassword\" }";
    }

    public static String getLoginPayload(String testEmail, String testpassword) {
        return "{ \"email\":\""+testEmail+"\", \"password\":\""+testpassword+"\" }";
    }

    public static String getAddContactPayload() {
        return "{ \"firstName\":\"John\", \"lastName\":\"Doe\", \"birthdate\":\"1970-01-01\", \"email\":\"jdoe@fake.com\", \"phone\":\"8005555555\", \"street1\":\"1 Main St.\", \"street2\":\"Apartment A\", \"city\":\"Anytown\", \"stateProvince\":\"KS\", \"postalCode\":\"12345\", \"country\":\"USA\" }";
    }

    public static String getUpdateFullContactPayload() {
        return "{\n" +
               "  \"firstName\": \"Amillen\",\n" +
               "  \"lastName\": \"Smith\",\n" +
               "  \"email\": \"amillen.smith@gmail.com\",\n" +
               "  \"phoneNumber\": \"9876543210\"\n" +
               "}";
    }

    public static String getUpdatePartialContactPayload() {
        return "{\n" +
               "  \"firstName\": \"Snow\"\n" +
               "}";
    }

}