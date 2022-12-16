public class Converter {

    public String to3(int i){         // Метод для перевода числа в троичную систему счисления
        String str = "";
         while (i>0){        // Цикл - оператор, который позволяет многократно выполнять действия
           str += i%3;
           i = i/3;
         }
         return reverse(str);
    }

    public String reverse(String str){    // Метод для переворота строки
        String rev = "";
        int j = str.length() -1 ;
//        while(j >=0){                     Реализация через while
//            rev += str.charAt(j);
//            j--;
//        }
        for (int i = str.length() - 1; i >= 0 ; i--) {
           rev += str.charAt(i);
        }
        return rev;
    }
}
