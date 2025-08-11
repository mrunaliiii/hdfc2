import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
//import java.util.stream.DoubleStream;

import static java.util.Locale.filter;

public class FunctionalInterfaceDemo {

    public static <integer> void main(String[] args){


//        NamePrinter printer = ( name) -> System.out.println(name);
//        printer.printName("Mrunali");
//        Consumer<String> printerr = (String s) -> System.out.println(s);
//        printerr.accept("Hello");
//
//        Predicate<Integer> isEven = (n) -> n%2==0;
//        System.out.println(isEven.test(4));
//        System.out.println(isEven.test(7));
//
//        Function<Integer, String> concatInt = (Integer n)-> "Number" +n;
//        System.out.println(concatInt.apply(120));
//
//        Supplier<Double> getRandomGeneratedValue = ()-> Math.random();
//        System.out.println(getRandomGeneratedValue.get());
//
//        //EVEN NUMBERS
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//
//        List<Integer> evenNumbers = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .collect(Collectors.toList());
//
//        System.out.println("Even Numbers: "+evenNumbers);

//EMPLOYEE 8 AUG
        List<Employee> employees = Arrays.asList(
                new Employee("Mrunali","Developer",6000000),
                new Employee("Kanan", "Designer", 65000),
                new Employee("Arpita", "Developer", 80000)
        );
//Remove Duplicates from List
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,1,5,6);
//        List<Integer> unique = list.stream()
//                .distinct()
//        .collect(Collectors.toList());
//
//        System.out.println("Duplicates Removed: "+unique);
//
////Sort by salary
//        List<Employee> sorted = employees.stream()
//                .sorted(Comparator.comparing(Employee::getSalary))
//                .collect(Collectors.toList());
//
//        System.out.println("Employees sorted by salary:");
//        sorted.forEach(e -> System.out.println(e.getName() + ": " + e.getSalary()));


//        //ITERator
//        Iterator<Employee> itr = employees.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        //LINKEDLIST
//        LinkedList<String> tasks = new LinkedList<>();
//        tasks.add("Write report");
//        tasks.add("Email client");
//        tasks.addFirst("Attend meeting");
//        System.out.println(tasks);

//        //HASHSETS
//        HashSet<String> countries = new HashSet<>();
//        countries.add("INDIA");
//        countries.add("INDIA");
//        countries.add("USA");
//
//        System.out.println(countries);
//

        // QUEUES
        //priority queue

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(1);
//        pq.add(2);
//        pq.add(5);
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }
//
//        System.out.println(pq);

//        //ARRAYDEQUEUE
//        ArrayDeque<String> ad = new ArrayDeque<>();
//        ad.add("first");
//        ad.add("second");
//        ad.addFirst("zero");
//        System.out.println(ad);

//        HASHMAP
        HashMap<Integer, String>  hm= new HashMap<>();
        hm.put(101,"Mrunali");
        hm.put(102,"Arpita");
        hm.put(103,"Kanan");
        hm.put(104,"Priyal");
        System.out.println("--------HASHMAP--------");
        System.out.println(hm);
        System.out.println(hm.get(102));

    }
    static void getEmployees(List<Employee> employees){
        List<String> developers = employees.stream()
                .filter(e -> "Developer".equals(e.getRole()))
                .map(Employee::getName)
                .collect(Collectors.toList());


        System.out.println(developers);
    }


}


