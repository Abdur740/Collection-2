package collection;

import java.util.HashMap;
import java.util.logging.Logger;

public class Hashmap {
    public static void main(String[] args)
    {
        Logger log=Logger.getLogger("com-api-jar");
        HashMap<Integer,String> map=new HashMap<>();
        Logger logger=Logger.getLogger("com-api-jar");
        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(1,"Abdur");
        map1.put(2,"Jesinth");
        map1.put(3,"Prabhu");
        map1.put(4,"Sai");
        map1.put(6,"Jeeva");
        map1.put(7,"hari");
        logger.info(map1.get(7));
        String res = "Cloned hashmap"+map1.clone();
        log.info(res);
        logger.info(""+map1.isEmpty());
        log.info(""+map1.replace(4,"naresh"));
        log.info(map1.get(4));
        log.info(""+map1.getClass());
        log.info(""+map1.remove(2));
        logger.info(map1.get(2));
        map.clear();
        log.info("Size of the hashmap: "+map1.size());
    }
}
