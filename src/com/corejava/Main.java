package com.corejava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Currency Converter");
        System.out.println("The currency conversion rates are up to date until Oct 31st 2021");
        System.out.println("Currency converter is just made for study purposes and shall not be used for real life situations and conversions");

        System.out.println();

        while (true) {
            System.out.println("Choose the Currency you want to convert or 0 to exit");
            System.out.println("\t1. Us Dollar USD");
            System.out.println("\t2. Euro EUR");
            System.out.println("\t3. British Pound GBP");
            System.out.println("\t4. Australian Dollar AUD");
            System.out.println("\t5. Canadian Dollar CAD");
            System.out.println("\t6. Japanese Yen JPY");
            System.out.println("\t7. Chinese Yuan CNY");
            System.out.println("\t8. HongKong Dollar HKD");
            System.out.println("\t9. CFA Franc XOF");
            System.out.println("\t10. Bitcoin XBT");
            System.out.println("\t0. Exit");
            System.out.print("> ");
            int currencyChoice = scanner.nextInt();


            if (currencyChoice == 1) {
                System.out.print("Enter the amount of US dollars you want to convert: > ");
                double usd = scanner.nextDouble();
                double eur = usd * 0.86040011;
                double gbp = usd * 0.72323568;
                double aud = usd * 1.3316234;
                double cad = usd * 1.2352943;
                double jpy = usd * 113.9953;
                double cny = usd * 6.3793942;
                double hkd = usd * 7.7757337;
                double xof = usd * 564.36789;
                double xbt = usd * 0.0000159271;
                System.out.println(usd + " US Dollars = " + eur + " Euros.");
                System.out.println(usd + " US Dollars = " + gbp + " British Pounds.");
                System.out.println(usd + " US Dollars = " + aud + " Australian Dollars.");
                System.out.println(usd + " US Dollars = " + cad + " Canadian Dollars.");
                System.out.println(usd + " US Dollars = " + jpy + " Japanese Yen.");
                System.out.println(usd + " US Dollars = " + cny + " Chinese Yen.");
                System.out.println(usd + " US Dollars = " + hkd + " Hong Kong Dollars.");
                System.out.println(usd + " US Dollars = " + xof + " Franc CFA.");
                System.out.println(usd + " US Dollars = " + xbt + " Bitcoins.");
                System.out.println();
            } else if (currencyChoice == 2) {
                System.out.print("Enter the amount of Euros you want to convert: > ");
                double eur = scanner.nextDouble();
                double usd = eur * 1.1622027;
                double gbp = eur * 0.84064678;
                double aud = eur * 1.5463176;
                double cad = eur * 1.4357535;
                double jpy = eur * 132.42257;
                double cny = eur * 7.4143484;
                double hkd = eur * 9.0378502;
                double xof = eur * 655.957;
                double xbt = eur * 0.000018503323113;
                System.out.println(eur + " Euros = " + usd + " US Dollars.");
                System.out.println(eur + " Euros = " + gbp + " British Pounds.");
                System.out.println(eur + " Euros = " + aud + " Australian Dollars.");
                System.out.println(eur + " Euros = " + cad + " Canadian Dollars.");
                System.out.println(eur + " Euros = " + jpy + " Japanese Yen.");
                System.out.println(eur + " Euros = " + cny + " Chinese Yen.");
                System.out.println(eur + " Euros = " + hkd + " Hong Kong Dollars.");
                System.out.println(eur + " Euros = " + xof + " Franc CFA.");
                System.out.println(eur + " Euros = " + xbt + " Bitcoins.");
                System.out.println();
            } else if (currencyChoice == 3) {
                System.out.print("Enter the amount of British Pounds you want to convert: > ");
                double gbp = scanner.nextDouble();
                double eur = gbp * 1.1896802;
                double usd = gbp * 1.3824536;
                double aud = gbp * 1.8391645;
                double cad = gbp * 1.7077657;
                double jpy = gbp * 157.48011;
                double cny = gbp * 8.8173158;
                double hkd = gbp * 10.745378;
                double xof = gbp * 780.20574;
                double xbt = gbp * 0.000022018853014;
                System.out.println(gbp + " Euros = " + usd + " US Dollars.");
                System.out.println(gbp + " Euros = " + eur + " Euros.");
                System.out.println(gbp + " Euros = " + aud + " Australian Dollars.");
                System.out.println(gbp + " Euros = " + cad + " Canadian Dollars.");
                System.out.println(gbp + " Euros = " + jpy + " Japanese Yen.");
                System.out.println(gbp + " Euros = " + cny + " Chinese Yuan.");
                System.out.println(gbp + " Euros = " + hkd + " Hong Kong Dollars.");
                System.out.println(gbp + " Euros = " + xof + " Franc CFA.");
                System.out.println(gbp + " Euros = " + xbt + " Bitcoins.");
                System.out.println();

            } else if (currencyChoice == 4) {
                System.out.print("Enter the amount of Australian Dollars you want to convert: > ");
                double aud = scanner.nextDouble();
                double eur = aud * 0.64653824;
                double usd = aud * 0.75133347;
                double gbp = aud * 0.54386314;
                double cad = aud * 0.92877091;
                double jpy = aud * 85.59324;
                double cny = aud * 4.7930075;
                double hkd = aud * 5.8413368;
                double xof = aud * 424.08415;
                double xbt = aud * 0.000011957797726;
                System.out.println(aud + " Australian Dollars = " + usd + " US Dollars.");
                System.out.println(aud + " Australian Dollars = " + eur + " Euros.");
                System.out.println(aud + " Australian Dollars = " + gbp + " British Pounds.");
                System.out.println(aud + " Australian Dollars = " + cad + " Canadian Dollars.");
                System.out.println(aud + " Australian Dollars = " + jpy + " Japanese Yen.");
                System.out.println(aud + " Australian Dollars = " + cny + " Chinese Yuan.");
                System.out.println(aud + " Australian Dollars = " + hkd + " Hong Kong Dollars.");
                System.out.println(aud + " Australian Dollars = " + xof + " Franc CFA.");
                System.out.println(aud + " Australian Dollars = " + xbt + " Bitcoins.");
                System.out.println();
            } else if (currencyChoice == 5) {
                System.out.print("Enter the amount of Canadian Dollars you want to convert: > ");
                double cad = scanner.nextDouble();
                double eur = cad * 0.69633449;
                double usd = cad * 0.80893922;
                double gbp = cad * 0.58583494;
                double aud = cad * 1.0767179;
                double jpy = cad * 92.202718;
                double cny = cad * 5.1615088;
                double hkd = cad * 6.2906897;
                double xof = cad * 456.89589;
                double xbt = cad * 0.000012865946116;
                System.out.println(cad + " Canadian Dollars = " + usd + " US Dollars.");
                System.out.println(cad + " Canadian Dollars = " + eur + " Euros.");
                System.out.println(cad + " Canadian Dollars = " + gbp + " British Pounds.");
                System.out.println(cad + " Canadian Dollars = " + aud + " Australian Dollars.");
                System.out.println(cad + " Canadian Dollars = " + jpy + " Japanese Yen.");
                System.out.println(cad + " Canadian Dollars = " + cny + " Chinese Yuan.");
                System.out.println(cad + " Canadian Dollars = " + hkd + " Hong Kong Dollars.");
                System.out.println(cad + " Canadian Dollars = " + xof + " Franc CFA.");
                System.out.println(cad + " Canadian Dollars = " + xbt + " Bitcoins.");
                System.out.println();
            } else if (currencyChoice == 6) {
                System.out.print("Enter the amount of Japanese Yen you want to convert: > ");
                double jpy = scanner.nextDouble();
                double usd = jpy * 0.0087721313;
                double eur = jpy * 0.0075499522;
                double gbp = jpy * 0.0063539141;
                double aud = jpy * 0.011676754;
                double cad = jpy * 0.010843643;
                double cny = jpy * 0.055975245;
                double hkd = jpy * 0.068215471;
                double xof = jpy * 4.9536244;
                double xbt = jpy * 0.000000139530788;

                System.out.println(jpy + " US Dollars = " + eur + " Euros.");
                System.out.println(jpy + " US Dollars = " + usd + " US Dollars.");
                System.out.println(jpy + " US Dollars = " + gbp + " British Pounds.");
                System.out.println(jpy + " US Dollars = " + aud + " Australian Dollars.");
                System.out.println(jpy + " US Dollars = " + cad + " Canadian Dollars.");
                System.out.println(jpy + " US Dollars = " + cny + " Chinese Yuan.");
                System.out.println(jpy + " US Dollars = " + hkd + " Hong Kong Dollars.");
                System.out.println(jpy + " US Dollars = " + xof + " Franc CFA.");
                System.out.println(jpy + " US Dollars = " + xbt + " Bitcoins.");
                System.out.println();
            } else if (currencyChoice == 7) {
                System.out.print("Enter the amount of Chinese Yuan you want to convert: > ");
                double cny = scanner.nextDouble();
                double usd = cny * 0.15672083;
                double eur = cny * 0.13487944;
                double gbp = cny * 0.11357321;
                double aud = cny * 0.20857089;
                double cad = cny * 0.19372528;
                double jpy = cny * 17.878875;
                double hkd = cny * 1.2182838;
                double xof = cny * 88.478945;
                double xbt = cny * 0.000002497567185;

                System.out.println(cny + " Chinese Yuan = " + usd + " US Dollars.");
                System.out.println(cny + " Chinese Yuan = " + eur + " Euros.");
                System.out.println(cny + " Chinese Yuan = " + gbp + " British Pounds.");
                System.out.println(cny + " Chinese Yuan = " + aud + " Australian Dollars.");
                System.out.println(cny + " Chinese Yuan = " + cad + " Canadian Dollars.");
                System.out.println(cny + " Chinese Yuan = " + jpy + " Japanese Yen.");
                System.out.println(cny + " Chinese Yuan = " + hkd + " Hong Kong Dollars.");
                System.out.println(cny + " Chinese Yuan = " + xof + " Franc CFA.");
                System.out.println(cny + " Chinese Yuan = " + xbt + " Bitcoins.");
                System.out.println();

            } else if (currencyChoice == 8) {
                System.out.print("Enter the amount of HongKong Dollar you want to convert: > ");
                double hkd = scanner.nextDouble();
                double usd = hkd * 0.12860945;
                double eur = hkd * 0.11075006;
                double gbp = hkd * 0.093240148;
                double aud = hkd * 0.17121976;
                double cad = hkd * 0.15900492;
                double jpy = hkd * 14.676978;
                double cny = hkd * 0.82064793;
                double xof = hkd * 72.648004;
                double xbt = hkd * 0.00000205192153;

                System.out.println(hkd + " HongKong Dollar = " + usd + " US Dollars.");
                System.out.println(hkd + " HongKong Dollar = " + eur + " Euros.");
                System.out.println(hkd + " HongKong Dollar = " + gbp + " British Pounds.");
                System.out.println(hkd + " HongKong Dollar = " + aud + " Australian Dollars.");
                System.out.println(hkd + " HongKong Dollar = " + cad + " Canadian Dollars.");
                System.out.println(hkd + " HongKong Dollar = " + jpy + " Japanese Yen.");
                System.out.println(hkd + " HongKong Dollar = " + cny + " Chinese Yuan.");
                System.out.println(hkd + " HongKong Dollar = " + xof + " Franc CFA.");
                System.out.println(hkd + " HongKong Dollar = " + xbt + " Bitcoins.");
                System.out.println();
            } else if (currencyChoice == 9) {
                System.out.print("Enter the amount of CFA Franc you want to convert: > ");
                double xof = scanner.nextDouble();
                double usd = xof * 0.0017705482;
                double eur = xof * 0.0015244902;
                double gbp = xof * 0.0012832353;
                double aud = xof * 0.0023562009;
                double cad = xof * 0.0021884704;
                double jpy = xof * 0.2021362;
                double cny = xof * 0.011300169;
                double hkd = xof * 0.013766911;
                double xbt = xof * 0.000000028289241;

                System.out.println(xof + " CFA Franc = " + usd + " US Dollars.");
                System.out.println(xof + " CFA Franc = " + eur + " Euros.");
                System.out.println(xof + " CFA Franc = " + gbp + " British Pounds.");
                System.out.println(xof + " CFA Franc = " + aud + " Australian Dollars.");
                System.out.println(xof + " CFA Franc = " + cad + " Canadian Dollars.");
                System.out.println(xof + " CFA Franc = " + jpy + " Japanese Yen.");
                System.out.println(xof + " CFA Franc = " + cny + " Chinese Yuan.");
                System.out.println(xof + " CFA Franc = " + hkd + " HongKong Dollars.");
                System.out.println(xof + " CFA Franc = " + xbt + " Bitcoins.");
                System.out.println();
            } else if (currencyChoice == 10) {
                System.out.print("Enter the amount of Bitcoins you want to convert: > ");
                double xbt = scanner.nextDouble();
                double usd = xbt * 62551.996;
                double eur = xbt * 53839.661;
                double gbp = xbt * 45310.00;
                double aud = xbt * 83104.159;
                double cad = xbt * 77214.156;
                double jpy = xbt * 7133404.6;
                double cny = xbt * 398988.43;
                double hkd = xbt * 486154.25;
                double xof = xbt * 35340588;

                System.out.println(xbt + " Bitcoins = " + usd + " US Dollars.");
                System.out.println(xbt + " Bitcoins = " + eur + " Euros.");
                System.out.println(xbt + " Bitcoins = " + gbp + " British Pounds.");
                System.out.println(xbt + " Bitcoins = " + aud + " Australian Dollars.");
                System.out.println(xbt + " Bitcoins = " + cad + " Canadian Dollars.");
                System.out.println(xbt + " Bitcoins = " + jpy + " Japanese Yen.");
                System.out.println(xbt + " Bitcoins = " + cny + " Chinese Yuan.");
                System.out.println(xbt + " Bitcoins = " + hkd + " HongKong Dollars.");
                System.out.println(xbt + " Bitcoins = " + xof + " Franc CFA.");
                System.out.println();
            } else if (currencyChoice == 0) {
                System.out.println("Bye");
                break;
            } else {
                System.out.println("Please type the suggested number. Thanks");
            }
        }
    }
}
