import java.util.Scanner;

public class NumberToLetters {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str100="";
        String str10 ="";
        String str = "";
        //số có 3 chữ số là 100a+10b+c
        int a = Math.floorDiv(num,100);
        int b = Math.floorDiv(num - a * 100,10);
        int c = num - a * 100 - b * 10;
        switch (c) {
            case 0:
                str = "không";
                break;
            case 1:
                str = "mốt";
                break;
            case 2:
                str = "hai";
                break;
            case 3:
                str = "ba";
                break;
            case 4:
                str = "bốn";
                break;
            case 5:
                str = "lăm";
                break;
            case 6:
                str = "sáu";
                break;
            case 7:
                str = "bảy";
                break;
            case 8:
                str = "tám";
                break;
            case 9:
                str = "chín";
                break;
        }
        switch (b) {
            case 0:
                str10 = "linh";
                break;
            case 1:
                str10 = "mười";
                break;
            case 2:
                str10 = "hai mươi";
                break;
            case 3:
                str10 = "ba mươi";
                break;
            case 4:
                str10 = "bốn mươi";
                break;
            case 5:
                str10 = "năm mươi";
                break;
            case 6:
                str10 = "sáu mươi";
                break;
            case 7:
                str10 = "bảy mươi";
                break;
            case 8:
                str10 = "tám mươi";
                break;
            case 9:
                str10 = "chín mươi";
                break;
        }
        switch (a) {
            case 0:
                str100 = "không trăm";
                break;
            case 1:
                str100 = "một trăm";
                break;
            case 2:
                str100 = "hai trăm";
                break;
            case 3:
                str100 = "ba trăm";
                break;
            case 4:
                str100 = "bốn trăm";
                break;
            case 5:
                str100 = "năm trăm";
                break;
            case 6:
                str100 = "sáu trăm";
                break;
            case 7:
                str100 = "bảy trăm";
                break;
            case 8:
                str100 = "tám trăm";
                break;
            case 9:
                str100 = "chín trăm";
                break;
        }
        System.out.println(str100 + " " + str10 + " " + str);
//        if (num < 13 && num >= 0) {
//            switch (num) {
//                case 0:
//
//                case 1:
//                    str = "one";
//                    break;
//                case 2:
//                    str = "two";
//                    break;
//                case 3:
//                    str = "three";
//                    break;
//                case 4:
//                    str = "four";
//                    break;
//                case 5:
//                    str = "five";
//                    break;
//                case 6:
//                    str = "six";
//                    break;
//                case 7:
//                    str = "seven";
//                    break;
//                case 8:
//                    str = "eight";
//                    break;
//                case 9:
//                    str = "nine";
//                    break;
//                case 10:
//                    str = "ten";
//                    break;
//                case 11:
//                    str = "eleven";
//                    break;
//                case 12:
//                    str = "twelve";
//                    break;
//                default:
//                    str = "out of ability";
//                    break;
//
//            }
//        } else if (num >= 13 && num <= 20) {
//            switch (num-10) {
//        }
//
//    }
    }
}
