package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import models.Contacto;

public class Sets {

    public Set<String> construirHashSet(){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("A");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");
        return hashSet;
        
    }
    public Set<String> construirLinkedHashSet(){
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("D");
        linkedHashSet.add("A");
        linkedHashSet.add("1Ggggggeegeg");
        linkedHashSet.add("2G2gggggeegeg");
        linkedHashSet.add("3Gggggeegeg");
        linkedHashSet.add("4Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("6Ggggggeegeg");
        linkedHashSet.add("G7gggggeegeg");
        return linkedHashSet;

    }
    public Set<String> construirTeeSet(){
        Set<String> construirTreeSet = new TreeSet<>();
        construirTreeSet.add("A");
        construirTreeSet.add("B");
        construirTreeSet.add("C");
        construirTreeSet.add("D");
        construirTreeSet.add("A");
        construirTreeSet.add("1Ggggggeegeg");
        construirTreeSet.add("2G2gggggeegeg");
        construirTreeSet.add("3Gggggeegeg");
        construirTreeSet.add("4Ggggggeegeg");
        construirTreeSet.add("5Ggggggeegeg");
        construirTreeSet.add("5Ggggggeegeg");
        construirTreeSet.add("6Ggggggeegeg");
        construirTreeSet.add("G7gggggeegeg");
        return construirTreeSet;

    }
    public Set<Contacto> construirTeeSetConComparador(){
        //mando como parametro una funcion:
        //es una funcion con argumento y ya asume el tipo de dato 
        //funcion flecha:
        Set<Contacto> tCSet = new TreeSet<>((c1,c2) -> {
            return c1.getNombre().compareTo(c2.getNombre());
         });

        tCSet.add(new Contacto("Juan", "Perez", "123456789"));
        tCSet.add(new Contacto("Ana", "Gomez", "987654321"));
        tCSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        tCSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        tCSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado, no se agregará
        tCSet.add(new Contacto("Juan", "Lopez", "123456789"));
        return tCSet; 
    }
    public Set<Contacto> construirHashSetContacto(){
        Set<Contacto> hCSet = new HashSet<>();
        Contacto c1 = new Contacto("Juan", "Perez", "123456789");
        Contacto c2 = new Contacto("Ana", "Gomez", "987654321");
        Contacto c3 = new Contacto("Pedro", "Lopez", "456789123");
        Contacto c4 = new Contacto("Maria", "Rodriguez", "789123456");
        Contacto c5 = new Contacto("Juan", "Perez", "123456789"); // Duplicado, no se agregará
        Contacto c6 = new Contacto("Juan", "Lopez", "123456789");
        System.out.println("Contacto 1" + c1.hashCode());
        System.out.println("Contacto 1" + c2.hashCode() );
        
        hCSet.add(c1);
        hCSet.add(c2);
        hCSet.add(c3);
        hCSet.add(c4);
        hCSet.add(c5);
        hCSet.add(c6);


        return hCSet;


    }



    
    
}
