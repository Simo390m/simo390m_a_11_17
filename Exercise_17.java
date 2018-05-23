package SorteOpgaver.ch11.aske1208_a_11_17;

import java.util.Map;

public class seventeen
{
    public boolean subMap(Map<String, String> map1, Map<String, String> map2)
    {
        int counter = 0;

        for (Map.Entry<String, String> m1 : map1.entrySet())
        {
            for (Map.Entry<String, String> m2 : map2.entrySet())
            {
                if (m1.getKey().equals(m2.getKey()))
                {
                    if (m1.getValue().equals(m2.getValue()))
                    {
                        counter ++;
                    }
                }
            }
        }
        if (counter == map1.size())
        {
            return true;
        }else{
            return false;
        }
    }
}
