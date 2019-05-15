 import java.lang.*;

public class Revers {

    public String revers_str(String str)
    {
        StringBuffer buff = new StringBuffer(str);
        buff.reverse();
        return buff.toString();
    }
}