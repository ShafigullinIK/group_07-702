package feb_26;


import feb_19_Builder_2.ArrayHandler;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) {

        HashMap<Character, String> dict =
                new HashMap<>();
        dict.put('а', "a");
        dict.put('е', "e");
        dict.put('и', "i");
        dict.put('я', "ya");
        dict.put('ж', "zh");
//        System.out.println(dict.get('ж'));
//        System.out.println(dict.get('ы'));
//        System.out.println(
//                dict.getOrDefault(
//                        'ы',
//                        "нет такого в моём словаре"));

        String s = "утки летят на пляж";
        char[] chars = s.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            result += dict.getOrDefault(
                    chars[i],
                    chars[i] + ""
            );
        }
//        System.out.println(result);

        char c = 'а';
        System.out.println((char)(c - 32));

        // "уткi лeтyaт нa плyazh"
        // Перевести строку в массив char[]
        // Бежим по массиву char[] и заменяем те элементы,
        // которые присутствуют в нашем словаре.
        // Собрать строку из массива char[]
    }
}
