package global;

public class Global {

    private static String data = "";

    public static void setData(String value) {
        data = value == null ? "" : value;
    }

    public static String getData() {
        return data;
    }

}
