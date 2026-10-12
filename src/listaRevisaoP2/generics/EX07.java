package listaRevisaoP2.generics;

import java.util.HashMap;
import java.util.Map;

public class EX07 {

    static void main() {
        Map<String, Integer> nLetras = new HashMap<>();
        nLetras.put("Cavalo", 6);
        nLetras.put("Esturjão", 8);
        nLetras.put("Serpentes", 9);

        printMap(nLetras);
    }

    static <K, V> void printMap(Map<K, V> mapa) {
        Object[] keys = mapa.keySet().toArray();
        Object[] values = new Object[keys.length];

        for (int i = 0; i < keys.length; i++) values[i] = mapa.get(keys[i]);

        for (int i = 0; i < mapa.size(); i++)
            System.out.println("[ " + keys[i] + " | " + values[i] + " ]");
    }

}
