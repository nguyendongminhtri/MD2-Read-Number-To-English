package com.company;

import java.util.Scanner;

public class SuDungToanTu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int number;
        System.out.println("Nhập vào số cần đọc: ");
        number = scanner.nextInt();
        System.out.println("check = "+(number - number%100));
        int units = number%10;
        String readUnits;
        int dozens = (number%100 - units)/10;
        String readDozens = "";
        String readNumber = "";
        int hundred = number - number%100;
        String readHundred = "";
        switch (units){
            case 1:
               readUnits = "One";
               break;
            case 2:
                readUnits = "Two";
                break;
            case 3:
                readUnits = "Three";
                break;
            case 4:
                readUnits = "Four";
                break;
            case 5:
                readUnits = "Five";
                break;
            case 6:
                readUnits = "Six";
                break;
            case 7:
                readUnits = "Seven";
                break;
            case 8:
                readUnits = "Eight";
                break;
            case 9:
                readUnits = "Nine";
                break;
            default:
                readUnits = "";
        }
        switch (number){
            case 10:
                readNumber = "Ten";
                break;
            case 11:
                readNumber = "Eleven";
                break;
            case 12:
                readNumber = "Twelve";
                break;
            case 13:
                readNumber = "Thirteen";
                break;
            case 15:
                readNumber = "Fifteen";
                break;
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
                readNumber = "teen";
                break;
            default:
                readNumber = "";
        }
        switch (dozens){
            case 2:
                readDozens = "Twenty";
                break;
            case 3:
                readDozens = "Thirty";
                break;
            case 4:
                readDozens = "Forty";
                break;
            case 5:
                readDozens = "Fifty";
                break;
            case 6:
                readDozens = "Sixty";
                break;
            case 7:
                readDozens = "Seventy";
                break;
            case 8:
                readDozens = "Eighty";
                break;
            case 9:
                readDozens = "Ninety";
                break;
//            default:
//                readDozens = "";
        }
        switch (hundred){
            case 100:
                readHundred = "One Hundred";
                break;
            case 200:
                readHundred = "Two Hundred";
                break;
            case 300:
                readHundred = "Three Hundred";
                break;
            case 400:
                readHundred = "Four Hundred";
                break;
            case 500:
                readHundred = "Five Hundred";
                break;
            case 600:
                readHundred = "Six Hundred";
                break;
            case 700:
                readHundred = "Seven Hundred";
                break;
            case 800:
                readHundred = "Eight Hundred";
                break;
            case 900:
                readHundred = "Nine Hundred";
                break;
            default:
                readHundred = "";
        }
        System.out.println("Read number: "+readHundred+ " "+readDozens+"-"+ readUnits+ " "+readNumber);
    }
}
