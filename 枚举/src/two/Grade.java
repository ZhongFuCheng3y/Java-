package two;

/**
 * Created by asd on 2016/11/15.
 */
public enum Grade {

    A("100-90"), B("100-90"), C("100-90"), D("100-90"), E("100-90");

    private String value = "";

    private Grade(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
