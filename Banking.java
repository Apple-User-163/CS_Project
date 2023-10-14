import java.util.*;
public class Banking {
    double rate, MV, P, CI;
    int n, t;
    byte ch_1, ch_2, ch_3, ch_4, ch_5, ch_6, ch_7, ch_8, ch_9;
    String error = "ERROR 404 Not Found.";
    String error_ch = "ERROR 400 Bad Request";

    Scanner inpt = new Scanner(System.in);

    public void UI() {
        System.out.println(" Please choose your required service:");
        System.out.println("1. Fixed Deposit");
        System.out.println("2. Recurring Deposit");
        System.out.println("3. Loan Services");
        ch_1 = inpt.nextByte();
        System.out.println("Please choose your preferred package by entering the appropriate package number");
        if (ch_1 == 1) // FD
        {
            System.out.println("Package 1. monthly deposit of ₹70,001 to ₹1,00,000; a rate of 6% and a time period of 1 year to 3 years");
            System.out.println("Package 2. monthly deposit of ₹40,001 to ₹70,000; a rate of 8% and a time period of of 1 year to 5 years");
            System.out.println("Package 3. monthly deposit of ₹10,001 to ₹40,000; a rate of 10% and a time period of 1 year to 10 years");
            System.out.println("Package 4. monthly deposit of ₹100 to ₹10,000; a rate of 12% and a time period of 1 year to 10 years");
            ch_2 = inpt.nextByte();
            if (ch_2 > 4 || ch_2 < 1) {
                System.out.println(error_ch);
                System.exit(0);
            }
            System.out.println("Please enter the amount to be deposited");
            P = inpt.nextDouble();
            System.out.println("Please enter the time period (in years)");
            t = inpt.nextInt();
        } else if (ch_1 == 2) //RD
        {
            System.out.println("Package 1. monthly deposit of ₹70,001 to ₹1,00,000; a rate of 6% and a time period of 1 to 24 months");
            System.out.println("Package 2. monthly deposit of ₹40,001 to ₹70,000; a rate of 8% and a time period of 6 to 30 months");
            System.out.println("Package 3. monthly deposit of ₹10,001 to ₹40,000; a rate of 10% and a time period of 6 to 36 months");
            System.out.println("Package 4. monthly deposit of ₹100 to ₹10,000; a rate of 12% and a time period of 1 to 120 months");
            ch_3 = inpt.nextByte();
            if (ch_3 > 4 || ch_3 < 1) {
                System.out.println(error_ch);
                System.exit(0);
            }
            System.out.println("Enter the monthly deposit");
            P = inpt.nextDouble();
            System.out.println("Enter the Time Period (in months)");
            n = inpt.nextInt();
        } else if (ch_1 == 3) //LOAN
        {
            System.out.println("Please choose your preferred loan type:");
            System.out.println("1. Personal Loan");
            System.out.println("2. Vehicle Loan");
            System.out.println("3. Student Loan (domestic)");
            System.out.println("4. Student Loan (international)");
            System.out.println("5. Home Loan");
            ch_4 = inpt.nextByte();
            if (ch_4 > 5 || ch_4 < 1) {
                System.out.println(error_ch);
                System.exit(0);
            }
        } else {
            System.out.println(error);
        }
    }

    public void p_loan() {
        System.out.println("Please choose your preferred loan package:");
        System.out.println("Package 1. Minimum amount - ₹10,000; Maximum amount - ₹1,00,000; rate of interest - 12% per annum (compounded annualy)");
        System.out.println("Package 2. Minimum amount - ₹1,00,001; Maximum amount - ₹1,50,000; rate of interest - 14% per annum (compounded annualy)");
        System.out.println("Package 3. Minimum amount - ₹1,50,001; Maximum amount - ₹30,00,000; rate of interest - 16% per annum (compounded annualy)");
        ch_5 = inpt.nextByte();
        System.out.println("Enter the principal");
        P = inpt.nextDouble();
        System.out.println("Please enter the time in years");
        t = inpt.nextInt();
        if (ch_5 == 1 && P <= 100000 && P >= 10000) {
            rate = 12.00;
            MV = P * Math.pow((1 + (rate / 100.0)), t);
            String a = String.format("%.3f", MV);
            MV = Double.parseDouble(a);
            CI = MV - P;
            System.out.println("Interest: " + CI);
            System.out.println("Total amount: " + MV);
        } else if (ch_5 == 2 && P <= 150000 && P >= 10001) {
            rate = 14.00;
            MV = P * Math.pow((1 + (rate / 100.0)), t);
            String a = String.format("%.3f", MV);
            MV = Double.parseDouble(a);
            CI = MV - P;
            System.out.println("Interest: " + CI);
            System.out.println("Total amount: " + MV);
        } else if (ch_5 == 3 && P <= 3000000 && P >= 150001) {
            rate = 15.00;
            MV = P * Math.pow((1 + (rate / 100.0)), t);
            String a = String.format("%.3f", MV);
            MV = Double.parseDouble(a);
            CI = MV - P;
            System.out.println("Interest: " + CI);
            System.out.println("Total amount: " + MV);
        } else {
            System.out.println(error);
            System.exit(0);
        }
    }

    public void v_loan() {
        if (ch_4 == 2) {
            System.out.println("Please choose your preferred loan package:");
            System.out.println("Package 1. Minimum amount - ₹50,000; Maximum amount - ₹10,00,000; rate of interest - 12% per annum (compounded annualy)");
            System.out.println("Package 2. Minimum amount - ₹10,00,001; Maximum amount - ₹40,00,000; rate of interest - 14% per annum (compounded annualy)");
            System.out.println("Package 3. Minimum amount - ₹40,00,001; Maximum amount - ₹80,00,000; rate of interest - 16% per annum (compounded annualy)");
            ch_6 = inpt.nextByte();
            System.out.println("Please enter the principal");
            P = inpt.nextDouble();
            System.out.println("Please enter the time in years");
            t = inpt.nextInt();
            if (ch_6 == 1 && P <= 1000000 && P >= 50000) {
                rate = 12.00;
                MV = P * Math.pow((1 + (rate / 100.0)), t);
                String a = String.format("%.3f", MV);
                MV = Double.parseDouble(a);
                CI = MV - P;
                System.out.println("Interest: " + CI);
                System.out.println("Total amount: " + MV);
            } else if (ch_6 == 2 && P <= 4000000 && P >= 1000001) {
                rate = 14.00;
                MV = P * Math.pow((1 + (rate / 100.0)), t);
                String a = String.format("%.3f", MV);
                MV = Double.parseDouble(a);
                CI = MV - P;
                System.out.println("Interest: " + CI);
                System.out.println("Total amount: " + MV);
            } else if (ch_6 == 3 && P <= 8000000 && P >= 4000001) {
                rate = 16;
                MV = P * Math.pow((1 + (rate / 100.0)), t);
                String a = String.format("%.3f", MV);
                MV = Double.parseDouble(a);
                CI = MV - P;
                System.out.println("Interest: " + CI);
                System.out.println("Total amount: " + MV);
            } else {
                System.out.println(error);
                System.exit(0);
            }
        }
    }

    public void s_loan1() {
        if (ch_4 == 3) {
            System.out.println("Please choose your preferred loan package:");
            System.out.println("Package 1. Minimum amount - ₹1,00,000; Maximum amount - ₹20,00,000; rate of interest - 5% per annum (compounded annualy)");
            System.out.println("Package 2. Minimum amount - ₹20,00,001; Maximum amount - ₹50,00,000; rate of interest - 7% per annum (compounded annualy)");
            ch_7 = inpt.nextByte();
            System.out.println("Enter the principal");
            P = inpt.nextDouble();
            System.out.println("Please enter the time in years");
            t = inpt.nextInt();
            if (ch_7 == 1 && P <= 2000000 && P >= 100000) {
                rate = 5;
                MV = P * Math.pow((1 + (rate / 100.0)), t);
                String a = String.format("%.3f", MV);
                MV = Double.parseDouble(a);
                CI = MV - P;
                System.out.println("Interest: " + CI);
                System.out.println("Total amount: " + MV);
            } else if (ch_7 == 2 && P <= 5000000 && P >= 2000001) {
                rate = 7;
                MV = P * Math.pow((1 + (rate / 100.0)), t);
                String a = String.format("%.3f", MV);
                MV = Double.parseDouble(a);
                CI = MV - P;
                System.out.println("Interest: " + CI);
                System.out.println("Total amount: " + MV);
            } else {
                System.out.println(error);
                System.exit(0);
            }
        }
    }

    public void s_loan2() {
        if (ch_4 == 4) {
            System.out.println("Please choose your preferred loan package:");
            System.out.println("Package 1. Minimum amount - ₹5,00,000; Maximum amount - ₹25,00,000; rate of interest - 11% per annum (compounded annualy)");
            System.out.println("Package 2. Minimum amount - ₹25,00,001; Maximum amount - ₹40,00,000; rate of interest - 14% per annum (compounded annualy)");
            ch_8 = inpt.nextByte();
            System.out.println("Enter the principal");
            P = inpt.nextDouble();
            System.out.println("Please enter the time in years");
            t = inpt.nextInt();
            if (ch_8 == 1 && P <= 2500000 && P >= 500000) {
                rate = 11;
                MV = P * Math.pow((1 + (rate / 100.0)), t);
                String a = String.format("%.3f", MV);
                MV = Double.parseDouble(a);
                CI = MV - P;
                System.out.println("Interest: " + CI);
                System.out.println("Total amount: " + MV);
            } else if (ch_8 == 2 && P <= 4000000 && P >= 2500001) {
                rate = 14;
                MV = P * Math.pow((1 + (rate / 100.0)), t);
                String a = String.format("%.3f", MV);
                MV = Double.parseDouble(a);
                CI = MV - P;
                System.out.println("Interest: " + CI);
                System.out.println("Total amount: " + MV);
            } else {
                System.out.println(error);
                System.exit(0);
            }
        }
    }

    public void h_loan() {
        if (ch_4 == 5) {
            System.out.println("Please choose your preferred loan package:");
            System.out.println("Package 1. Minimum amount - ₹2,00,000; Maximum amount - ₹50,00,000; rate of interest - 10% per annum (compounded annualy)");
            System.out.println("Package 2. Minimum amount - ₹50,00,001; Maximum amount - ₹1,50,00,000; rate of interest - 14% per annum (compounded annualy)");
            System.out.println("Package 3. Minimum amount - ₹1,50,00,001; Maximum amount - ₹4,00,00,000; rate of interest - 18% per annum (compounded annualy)");
            ch_9 = inpt.nextByte();
            System.out.println("Enter the principal");
            P = inpt.nextDouble();
            System.out.println("Please enter the time in years");
            t = inpt.nextInt();
            if (ch_6 == 1 && P <= 5000000 && P >= 200000) {
                rate = 10;
                MV = P * Math.pow((1 + (rate / 100.0)), t);
                String a = String.format("%.3f", MV);
                MV = Double.parseDouble(a);
                CI = MV - P;
                System.out.println("Interest: " + CI);
                System.out.println("Total amount: " + MV);
            } else if (ch_6 == 2 && P <= 15000000 && P >= 5000001) {
                rate = 14;
                MV = P * Math.pow((1 + (rate / 100.0)), t);
                String a = String.format("%.3f", MV);
                MV = Double.parseDouble(a);
                CI = MV - P;
                System.out.println("Interest: " + CI);
                System.out.println("Total amount: " + MV);
            } else if (ch_6 == 3 && P <= 40000000 && P >= 15000001) {
                rate = 18;
                MV = P * Math.pow((1 + (rate / 100.0)), t);
                String a = String.format("%.3f", MV);
                MV = Double.parseDouble(a);
                CI = MV - P;
                System.out.println("Interest: " + CI);
                System.out.println("Total amount: " + MV);
            } else {
                System.out.println(error);
                System.exit(0);
            }

        }
    }

    public void rd() {
        if (ch_3 == 1 && P >= 70001 && P <= 100000 && n >= 1 && n <= 24) {
            rate = 6;
            double rdi = (P * (n * (n + 1)) * rate) / (2400);
            MV = (P * n) + rdi;
            System.out.println("Your accumulated interest will be = ₹" + rdi);
            System.out.println("Your maturity value will be = ₹" + MV);
        } else if (ch_3 == 2 && P >= 40001 && P <= 70000 && n >= 6 && n <= 30) {
            rate = 8;
            double rdi = (P * (n * (n + 1)) * rate) / (2400);
            MV = (P * n) + rdi;
            System.out.println("Your accumulated interest will be = ₹" + rdi);
            System.out.println("Your maturity value will be = ₹" + MV);
        } else if (ch_3 == 3 && P >= 10001 && P <= 40000 && n >= 6 && n <= 36) {
            rate = 10;
            double rdi = (P * (n * (n + 1)) * rate) / (2400);
            MV = (P * n) + rdi;
            System.out.println("Your accumulated interest will be = ₹" + rdi);
            System.out.println("Your maturity value will be = ₹" + MV);
        } else if (ch_3 == 4 && P >= 100 && P <= 10000 && n >= 1 && n <= 120) {
            rate = 12;
            double rdi = (P * (n * (n + 1)) * rate) / (2400);
            MV = (P * n) + rdi;
            System.out.println("Your accumulated interest will be = ₹" + rdi);
            System.out.println("Your maturity value will be = ₹" + MV);
        } else {
            System.out.println(error);
            System.exit(0);
        }
    }

    public void fd() {
        if (ch_2 == 1 && P >= 70001 && P <= 100000 && t >= 1 && t <= 3) {
            rate = 8;
            double fdi = (P * rate * t) / 100.00;
            MV = P + fdi;
            System.out.println("Your accumulated interest will be = ₹" + fdi);
            System.out.println("Your maturity value will be = ₹" + MV);
        } else if (ch_2 == 2 && P >= 40001 && P <= 70000 && t >= 1 && t <= 5) {
            rate = 10;
            double fdi = (P * rate * t) / 100;
            MV = P + fdi;
            System.out.println("Your accumulated interest will be = ₹" + fdi);
            System.out.println("Your maturity value will be = ₹" + MV);
        } else if (ch_2 == 3 && P >= 10001 && P <= 40000 && t >= 1 && t <= 10) {
            rate = 12;
            double fdi = (P * rate * t) / 100;
            MV = P + fdi;
            System.out.println("Your accumulated interest will be = ₹" + fdi);
            System.out.println("Your maturity value will be = ₹" + MV);
        } else if (ch_2 == 4 && P >= 100 && P <= 10000 && t >= 1 && t <= 10) {
            rate = 15;
            double fdi = (P * rate * t) / 100;
            MV = P + fdi;
            System.out.println("Your accumulated interest will be = ₹" + fdi);
            System.out.println("Your maturity value will be = ₹" + MV);
        } else {
            System.out.println(error);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Banking Obj = new Banking();
        Obj.UI();

        if (Obj.ch_1 == 1) {
            Obj.fd();
        }
        else if (Obj.ch_1 == 2) {
            Obj.rd();
        }
        else if (Obj.ch_1 == 3) {
            if (Obj.ch_4 == 1) {
                Obj.p_loan();
            } else if (Obj.ch_4 == 2) {
                Obj.v_loan();
            } else if (Obj.ch_4 == 3) {
                Obj.s_loan1();
            } else if (Obj.ch_4 == 4) {
                Obj.s_loan2();
            } else if (Obj.ch_4 == 5) {
                Obj.h_loan();
            }
        }
    }
}
