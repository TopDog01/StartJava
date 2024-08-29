public class Arrays {
    public static void main(String[] args) {
        int number = 10; //примитивный тип данных         [10]
    //    char character = 'a'; // примитивный тип данных
    //    String s = "Hello, World!"; // ссылочный тип данных
    //    String s1 = new String("Hello");// ссылочный тип данных
        int[] numbers = new int[5];                  //numbers -> [массив]   ссылочный тип данных
      for (int i = 0; i < numbers.length; i++){
          numbers[i] = i * 347;
          System.out.println(numbers[i]);  //выводим значения массива через цикл for-each

      }

    }
}
