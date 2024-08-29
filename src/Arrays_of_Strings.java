public class Arrays_of_Strings {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "World";
        strings[2] = "!";
      //  System.out.println(strings[0]);
      //  System.out.println(strings[1]);
      //  System.out.println(strings[2]);


        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println("------");
        for (String string : strings){
            System.out.println(string);
        }
        int[] numbers1 = {1,2,3};
        int sum =0;
        for (int x : numbers1){
            sum = sum + x;
        }
        System.out.println("----");
        System.out.println("Сумма чисел в массиве: " + sum);

        int value = 0;
        String s = null;
        System.out.println(s);

    }
}
