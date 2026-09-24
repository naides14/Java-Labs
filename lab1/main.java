import java.util.Scanner;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        main program = new main();
        int res_1_3 = program.charToNum('5');
        System.out.println(res_1_3);
        boolean res1_4 = program.isPositive(-5);
        System.out.println(res1_4);
        boolean res1_6 = program.isUpperCase('K');
        System.out.println(res1_6);
        boolean res1_8 = program.isDivisor(2, 33);
        System.out.println(res1_8);
        int res1_10=program.lastNumSum(0,0);

        System.out.println(res1_10);
        int res2_1 = program.abs(0);
        System.out.println(res2_1);
        String res2_4 = program.makeDecision(0,0);
        System.out.println(res2_4);
        int res2_5 = program.max3(0,0,0);
        System.out.println(res2_5);
        int res2_7 = program.sum2(0,0);
        System.out.println(res2_7);
        String res2_9 = program.day(0);
        System.out.println(res2_9);

        program.reverseListNums(5);
        program.chet(9);
        boolean res_3_6 = program.equalNum(0);
        System.out.println(res_3_6);
        program.leftTriangle(0);
        program.rightTriangle(0);

        int[] trasharr = {0};
        int res4_1=program.findLast(trasharr,0);
        System.out.println(res4_1);
        int res4_2=program.findFirst(trasharr,0);
        System.out.println(res4_2);
        int[] res4_4=program.add(trasharr,0,0);
        System.out.println(Arrays.toString(res4_4));
        int[] res4_7=program.reverseBack(trasharr);
        System.out.println(Arrays.toString(res4_7));
        int[] res4_10=program.deleteNegative(trasharr);
        System.out.println(Arrays.toString(res4_10));
    }

    //ЗАДАНИЕ 1--------------------------
    public int charToNum(char x) { //задача 1 (3 в лабораторной)
        return Character.getNumericValue(x);
    } //задача 1 (3 в лабораторной

    public boolean isPositive(int x) { //задача 2 (4 в лабораторной)

        Scanner scanner = new Scanner(System.in);
        int x1;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        if (x1 > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isUpperCase(char x) { //задача 3 (6 в лабораторной)
        if (Character.isUpperCase(x)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDivisor(int a, int b) { //задача 4 (8 в лабораторной)
        Scanner scanner = new Scanner(System.in);
        int a1;
        int b1;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                a1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }

        while (true) {
            System.out.println("Введите второе целое число:");
            if (scanner.hasNextInt()) {
                b1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        if ((a1 % b1) == 0 || (b1 % a1) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static int forlastNumSum(int a, int b) {
        return ((a % 10) + (b % 10));
    } //для след метода
    public int lastNumSum(int a, int b) { //задача 5 (10 в лабораторной)
        Scanner scanner = new Scanner(System.in);
        int a1;
        int b1;


        while (true) {
            System.out.println("Введите начальное число:");
            if (scanner.hasNextInt()) {
                a1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }

        System.out.println("Начальное число: "+ a1);
        for (int i = 0; i < 4; i++) {
            while (true) {
                System.out.println("Введите следующее число:");
                if (scanner.hasNextInt()) {
                    b1 = scanner.nextInt();
                    break;
                }
                System.out.println("Введено не целое число!");
                scanner.next();
            }

            b1 = forlastNumSum(a1, b1);
            System.out.println(b1);
            a1 = b1;
        }
        return a1;
    }
    //ЗАДАНИЕ 2---------------------------------------------------------------------
    public int abs (int x) { //задача 1
        Scanner scanner = new Scanner(System.in);
        int x1;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        if (x1<0) {
            return -x1;
        }
        else {
            return x1;
        }
    }
    public String makeDecision (int x, int y) { //задача 2 (4 в лаб)
        Scanner scanner = new Scanner(System.in);
        int x1;
        int y1;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        while (true) {
            System.out.println("Введите второе целое число:");
            if (scanner.hasNextInt()) {
                y1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }

        if (x1 > y1) {
            return (x1 +">"+ y1);
        }
        else if (x1 < y1) {
            return (x1 +"<"+ y1);
        }
        else {
            return (x1 +"=="+ y1);
        }
    }
    public int max3 (int x, int y, int z) { //задача 3 (5 в лаб)
        Scanner scanner = new Scanner(System.in);
        int x1;
        int y1;
        int z1;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        while (true) {
            System.out.println("Введите второе целое число:");
            if (scanner.hasNextInt()) {
                y1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        while (true) {
            System.out.println("Введите третье целое число:");
            if (scanner.hasNextInt()) {
                z1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        if (x1 > y1) {
            y1 = x1;
        }
        else {
            x1 = y1;
        }
        if (z1 > x1){
            return z1;
        }
        else {
            return x1;
        }
    }
    public int sum2 (int x, int y) { //задача 4 (7 в лаб)
        Scanner scanner = new Scanner(System.in);
        int x1;
        int y1;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        while (true) {
            System.out.println("Введите второе целое число:");
            if (scanner.hasNextInt()) {
                y1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        if ((x1 + y1)<10 || (x1 + y1)>19) {
            return (x1 + y1);
        }
        else {
            return 20;
        }
    }
    public String day (int x) { //задача 5 (9 в лаб)
        Scanner scanner = new Scanner(System.in);
        int x1;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        switch (x1) {
            case (1):
                return "понедельник";
            case (2):
                return "вторник";
            case (3):
                return "среда";
            case (4):
                return "четверг";
            case (5):
                return "пятница";
            case (6):
                return "суббота";
            case (7):
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }
    //ЗАДАНИЕ 3----------------------------------------------
    public String reverseListNums (int x) { //задача 1 (2 в лаб)
        for (int i=x; i>-1; i--) {
            System.out.print(i+" ");
        }
        return null;
    }
    public String chet (int x) { //задача 2 (3 в лаб)
        System.out.println("");
        for (int i=0; i<=x; i+=2) {
            System.out.print(i+" ");
        }
        return null;
    }
    public boolean equalNum(int x) { //задача 3 (6 в лаб)
        Scanner scanner = new Scanner(System.in);
        int x1;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        int first = x1 / 10;
        int last = x1 % 10;
        while (first > 1) {

            int last_of_first = first % 10;
            if (last_of_first != last) {
                return false;
            }
            else {
                first=first/10;
            }
        }
        return true;
    }
    public void leftTriangle(int x) { //задача 4 (8 в лаб)
        Scanner scanner = new Scanner(System.in);
        int x1;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        int rownum=0;
        for (int i = 0; i< x1; i++) {
            rownum+=1;
            System.out.println("*".repeat(rownum));
        }
    }
    public void rightTriangle(int x) { //задача 5 (9 в лаб)
        Scanner scanner = new Scanner(System.in);
        int x1;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        int rownum=0;
        int spacenum= x1 -1;
        for (int i = 0; i< x1; i++) {
            rownum+=1;
            System.out.println(" ".repeat(spacenum)+"*".repeat(rownum));
            spacenum-=1;
        }
    }
    //ЗАДАНИЕ 4---------------------------------------------------------
    public int findFirst (int[] arr, int x) {
        Scanner scanner = new Scanner(System.in);
        int x1;
        int[] arrayy = {14,5,2008,16,11};
        arr=arrayy;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        for (int i = 0; i<arr.length;i++) {
            if (arr[i]== x1) {
                return i;
            }

        }
        return -1;
    }

    public int findLast (int[] arr, int x) { //задача 2
        Scanner scanner = new Scanner(System.in);
        int x1;
        int[] arrayy = {14,14,5,2008,16,2008,11,11,11,11};
        arr=arrayy;

        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        int lastseen=-1;
        for (int i = 0; i<arr.length;i++) {
            if (arr[i]== x1) {
                lastseen = i;
            }
        }
        return lastseen;
    }
    public int[]add (int[] arr, int x, int pos) {

        Scanner scanner = new Scanner(System.in);
        int x1;
        int pos1;
        int[] arrayy = {0,1,2,3,4,5,6,7,8,9,10};
        arr=arrayy;
        System.out.println("Длина массива: "+arrayy.length);
        while (true) {
            System.out.println("Введите целое число:");
            if (scanner.hasNextInt()) {
                x1 = scanner.nextInt();
                break;
            }
            System.out.println("Введено не целое число!");
            scanner.next();
        }
        while (true) {
            System.out.println("Введите целое число (позицию для вставки в массив):");
            if (scanner.hasNextInt()) {
                pos1 = scanner.nextInt();
                if (pos1 <0 || pos1 >arrayy.length+1) {
                    System.out.println("Введено не целое число, либо число меньше/больше длины массива!");
                    scanner.next();
                }
                else {
                    break;
                }
            }
        }

        int[] newarr =  new int[arr.length+1];
        for (int i = 0; i < newarr.length; i++) {

            if (i < pos1) {
                newarr[i] = arr[i];
            }
            else if (i == pos1) {
                newarr[i] = x1;
            }
            else {
                newarr[i] = arr[i - 1];
            }
        }
        return newarr;
    }
    public int[] reverseBack (int[] arr) {
        int[] arrayy = {0,1,2,3,4,5,6,7,8,9,10};
        arr=arrayy;
        int[] newarr =  new int[arr.length];
        int newindex=0;
        for (int i = arr.length-1; i > -1; i--) {
            newarr[newindex]=arr[i];
            newindex+=1;
        }
        return newarr;
    }
    public int[] deleteNegative (int[] arr) {

        int[] arrayy = {-1,-2,3,14,5,-514,885,-4};
        arr=arrayy;
        int[] newarr = new int[arr.length];
        for (int j = 0; j < newarr.length; j++) {
            if (arr[j] >= 0) {
                newarr[j] = arr[j];
            }
        }

        int truelen=0;
        for (int i=0; i<newarr.length; i++) {
            if (newarr[i] != 0) {
                truelen += 1;
            }
        }

        int[] finalarr = new int[truelen];
        int finalind=0;
        for (int k=0;k<newarr.length;k++) {
            if (newarr[k]>0) {
                finalarr[finalind]=newarr[k];
                finalind+=1;
            }
        }
        return finalarr;
    }


}


