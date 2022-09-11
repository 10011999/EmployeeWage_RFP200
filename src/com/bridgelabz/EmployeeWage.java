package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        final int fullTime = 1;
        final int partTime = 2;
        System.out.println("Welcome Employees");
        int perHourWage = 20;
        int empWorkingDays = 20;
        int empWage = 0;
        int monthSalary = 0;
        for (int i = 1; i < empWorkingDays; i++) {
            int check = (int) Math.floor(Math.random() * 10) % 3;
            switch (check) {
                case 1:
                    System.out.println("Emp Present");
                    int Hrs = 8;
                    empWage = perHourWage * Hrs;
                    System.out.println("Salary Amount: " + empWage);
                    break;
                case 2:
                    System.out.println("Emp present in Part Time");
                    Hrs = 4;
                    empWage = perHourWage * Hrs;
                    System.out.println("Part Time Salary " + empWage);
                    break;
                default:
                    System.out.println("Emp Absent");
                    Hrs = 0;
                    perHourWage = perHourWage * Hrs;
                    System.out.println("Salary Amount: " + empWage);
                    break;
            }
            monthSalary = empWage + monthSalary;
        }
        System.out.println("month salary = " +monthSalary );
    }
}