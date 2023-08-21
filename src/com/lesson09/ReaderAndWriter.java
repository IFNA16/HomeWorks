/*
0. Создать текстовый файл в корне диска С с именем test.txt, напечатать внутри несколько строк текста. Скопировать код и убедиться, что он правильно работает.

import java.io.*;
import java.util.Scanner;

public class Demo {
   public static String read(String path) throws IOException {
//открываем файл по пути
       BufferedReader reader = new BufferedReader(new FileReader(path));
       StringBuilder stringBuilder = new StringBuilder();

       String currentString;
//построчно считываем файл
       while ((currentString = reader.readLine()) != null){
           stringBuilder.append(currentString);
           stringBuilder.append("\n");

       }
//закрываем файл
       reader.close();
//возвращаем вычитанный текст в строке
       return stringBuilder.toString();
   }

   public static void main(String[] args) throws IOException {
       System.out.println(read("C:\\test.txt"));
   }
}

1.	Спровоцировать возникновение FileNotFoundEcxeption
2.	Удалить throws IOException и заменить его на try/catch/finally. Закоммитить.
3.	Отрефакторить код с использование try-with-recourses. Еще раз закоммитить.

Написать свой собственный код (в отдельном файле), который будет приводить к возникновению следующих исключений:
● ClassCastException
● NullPointerException
● NumberFormatException (подсказка – преобразование строки в число)
● ArrayIndexOutOfBoundsException

Подумать и написать в комментарии, какие из этих исключений нужно обрабатывать в try/catch блоке.

Закоммитьте в репозиторий.

Отрефакторите код так, чтобы избежать возникновения исключений, если это возможно.Закоммитьте.

 */

package com.lesson09;


public class ReaderAndWriter {


}
