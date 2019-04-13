import java.util.*;
import java.util.stream.Collectors;

public class t2 {
    t1 tt = new t1();

//    public static Student getTestByAge(List<Student> tests, Integer age){
//        tests.stream().filter(xx -> )
//    }

    public static <T> T getType(T t) {
        return t;
    }

    static Student doCall(FunctionalInterface functionalInterface) {

        Object x = functionalInterface.call();

        if (x instanceof List) {
            return new Student("List", 123);
        } else if (x instanceof String) {
            return new Student("String", 1231);
        }
        return new Student("unknown", 112);
    }

    public <T> T getheba(T t11)
    {
        return t11;
    }
    public static String getString() {
        return "anyString";
    }

    public static Integer getInteger() {
        return 1;
    }

    public static List getList() {
        return new ArrayList();
    }


    public static void main(String args[]) {


        Object o="heba";
        System.out.println(o.toString());

//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("inter url");
//            String url = scanner.next();
//
//            Student test = doCall(() -> {
//                if (url.equalsIgnoreCase("string")) {
//                    return getString();
//                }
//                if (url.equalsIgnoreCase("list")) {
//                    return getList();
//                }
//                if (url.equalsIgnoreCase("integer")) {
//                    return getInteger();
//                }
//                return null;
//            });
//
//            System.out.println(test.getName());
//        }

        List<Student> students = Arrays.asList(new Student("hamza", 24), new Student("heba", 20), new Student("fatima", 15));

//        List<Student> studentHaveH = new ArrayList<>();
//
//        List<Student> studentHaveH2 = students.stream()
//                .filter(student -> {
//                    if (student.getAge() > 5) {
//                        if (student.getName().contains("h") || student.getName().contains("H")) {
//                            return true;
//                        }
//                    }
//                    return false;
//                }).collect(Collectors.toList());
//
//        for (Student student : students) {
//            if (student.getName().contains("h") || student.getName().contains("H")) {
//                studentHaveH.add(student);
//            }
//        }
//
//        List<Object> objects = new ArrayList<>();
//        objects.add("hamza");
//
//        for (Object o : objects) {
//            if (o instanceof String) {
//                if (((String) o).contains("h")) {
//                    System.out.println();
//                }
//            }
//
//        }


        //Student test1 = doCall(() -> { return "x";});

        // create anonymous inner class object
//        new Thread(new Runnable() {
//            //            @Override
//            public void run() {
//                System.out.println("New thread created");
//            }
//        }).start();

//        new Thread(()->
//        {System.out.println("New thread created");}).start();
//    }
//    @FunctionalInterface
//    interface Square
//    {
//        int calculate(int x);
//    }
    }
}
