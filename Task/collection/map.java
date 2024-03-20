import java.util.Map;
import java.util.HashMap;


public class map
{
    public static void main(String[] args)
    {
        Map<String,Integer> key = new HashMap<>();
        key.put("Mohan",21);
        key.put("raj",22);

        System.out.println(key);
        System.out.println(key.get("raj"));
    }
}