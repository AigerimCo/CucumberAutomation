package beginningPractice;

import java.util.*
        ;

public class SetPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(234);
        numbers.add(234);
        numbers.add(234);
        numbers.add(235);
        numbers.add(236);
        numbers.add(237);

        System.out.println(numbers);
        // сохраняет уникальные значения но не гарантирует порядок
        HashSet<Integer> numbersSet = new HashSet<>();
        numbersSet.add(234);
        numbersSet.add(234);
        numbersSet.add(234);
        numbersSet.add(235);
        numbersSet.add(124);
        numbersSet.add(236);
        numbersSet.add(237);
        numbersSet.add(7);

        System.out.println("HashSet -> " + numbersSet);
        //что бы вывести каждый элемент по отдельности используем forEach(), так как нету метода get()
        for (Integer number : numbersSet) {
            System.out.println(number);
        }

        System.out.println("----------------------------------");

        //Нет порядке как ранее говорилось
        HashSet<String> sass = new HashSet<>();
        sass.add("hello");
        sass.add("hello");
        sass.add("helgafglo");
        sass.add("agsfgfa");
        sass.add("helloafgfadg2");
        sass.add("dsga");
        sass.add("heagsdll3");
        sass.add("helhdshdslo4");
        sass.add("gas");
        sass.add("gsaggfa");
        System.out.println("HashSet ->       " + sass);


        // все сеты сохраняют у себя только уникальные элементы,
        // LinkedHashSet он сохраняет еще и очередность как мы добавили с помощью add()
        // что бы вывести каждый элемент по отдельности используем forEach()
        LinkedHashSet<String> texts = new LinkedHashSet<>();
        texts.add("hello");
        texts.add("hello");
        texts.add("helgafglo");
        texts.add("agsfgfa");
        texts.add("helloafgfadg2");
        texts.add("dsga");
        texts.add("heagsdll3");
        texts.add("helhdshdslo4");
        texts.add("gas");
        texts.add("gsaggfa");
        System.out.println("LinkedHashSet -> " + texts);

        for (String text : texts) {
            System.out.println(text);
        }
        System.out.println("----------------------------------");


        // все сеты сохраняют у себя только уникальные элементы,
        // TreeSet имеет автоматический sort,  он by default naturalOrder а можно еще сделать reverseOrder -> new TreeSet<>(Comparator.reverseOrder());
        // что бы вывести каждый элемент по отдельности используем forEach()

        TreeSet<Integer> nums = new TreeSet<>(Comparator.reverseOrder());
        nums.add(1);
        nums.add(1);
        nums.add(24235);
        nums.add(54351);
        nums.add(431);
        nums.add(341);
        nums.add(154);
        nums.add(132);

        System.out.println("TreeSet -> " + nums);


        TreeSet<String> strs = new TreeSet<>();
        strs.add("e");
        strs.add("e");
        strs.add("t");
        strs.add("y");
        strs.add("a");
        strs.add("g");
        strs.add("h");
        System.out.println("TreeSet -> " + strs);

        for (String str : strs) {
            System.out.println(str);
        }

        System.out.println("----------------------------------");

    }
}
