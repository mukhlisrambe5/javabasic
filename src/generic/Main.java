package generic;

public class Main {
    public static void main(String[] args) {
//        MyIntegerClass myInt = new MyIntegerClass(1);
//        MyDoubleClass myDouble = new MyDoubleClass(2.5);
//        MyCharacterClass myChar = new MyCharacterClass('A');
//        MyStringClass myString = new MyStringClass("Hello");

        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(2.5);
        MyGenericClass<Character> myChar = new MyGenericClass<>('A');
        MyGenericClass<String> myString = new MyGenericClass<>("Hello");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
//        Player player = new Player();
//        Enemy enemy = new Enemy();
//        Item item = new Item();
//        Tree tree = new Tree();
//
//        draw(player);
//        draw(enemy);
//        draw(item);
//        draw(tree);
//
//        public static <Thing> void draw(Thing x){
//            x.draw();
//        }
    }
//        Integer[] intArray = {1,2,3,4,5,6,7,8};
//        Double[] doubleArray = {5.5,4.4,3.3,2.2,1.1};
//        Character[] charArray = {'H','E','L','L','O'};
//        String[] stringArray = {"B", "Y", "E"};
//
//        displayArray(intArray);
//        displayArray(doubleArray);
//        displayArray(charArray);
//        displayArray(stringArray);
//    }
//
//
//
//    public static <T> void displayArray(T[] array){
//        for(T element : array){
//            System.out.print(element + " ");
//        }
//        System.out.println();
////        System.out.println(getFirst(array));
//    }

//    public static void displayArray(Integer[] array){
//        for(Integer x:array){
//            System.out.println(x+ " ");
//        }
//        System.out.println();
//    }
//
//    public static void displayArray(Double[] array){
//        for(Double x:array){
//            System.out.println(x+" ");
//        }
//        System.out.println();
//    }
//
//    public static void displayArray(Character[] array){
//        for(Character x:array){
//            System.out.println(x+" ");
//        }
//        System.out.println();
//    }
//
//    public static void displayArray(String[] array){
//        for(String x:array){
//            System.out.println(x+" ");
//        }
//        System.out.println();
//    }
}
