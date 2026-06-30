package collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    //Map<K,V>
    //String es la clave e Integer es el valor 
    public Map <String, Integer> construirHashMap(){
        Map<String, Integer> map = new HashMap<>();
        //con put agergo la clave y el valor
        //metodo put si ya esxiste la llave actualiza su valor
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("A", 50);
        //.value().toArray()= imprime valor y posicion
        System.out.println(map.size());
        System.out.println(map.values().toArray());
        //imprimir uno por uno
        for(int i = 0; i < map.size();i ++){
            //valores que se trasfromaron a un array  e impirmimos array en las posicion 
            System.out.println(map.values().toArray()[i]);
        }
        //for para llaves keys
        //transformamos a un set e imprimimos el valor de set

        for(String key : map.keySet()){
            System.out.println(key);

        }
        //T = entry<k , v> es de tipo set 
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            System.out.println(entry);
        }

        return map;
        
        
    }
    public LinkedHashMap<String, Integer> coLinkeeLinkedHashMap(){
        LinkedHashMap<String, Integer>  lMap = new LinkedHashMap<>();
        lMap.put("A", 2);
        lMap.put("B", 3);
        lMap.put("A", 5);
        lMap.put("C", 50);
        lMap.put("D", 5);
        lMap.put("F", 3);
        lMap.put("G", 8);
        lMap.put("H", 85);
        lMap.put("I", 5);
        System.out.println(lMap);
        System.out.println(lMap.entrySet());
        return lMap;
    }
    public Map<String , Integer> cTreeMap(){
        Map<String, Integer>  lMap = new TreeMap<>();
        lMap.put("A", 2);
        lMap.put("B", 3);
        lMap.put("A", 5);
        lMap.put("C", 50);
        lMap.put("D", 5);
        lMap.put("F", 3);
        lMap.put("G", 8);
        lMap.put("H", 85);
        lMap.put("I", 5);
        System.out.println(lMap);
        System.out.println(lMap.entrySet());
        return lMap;
    }// pactica de laboratorio maniana 
    
}
