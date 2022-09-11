package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        final int fullTime = 1;
        final int partTime = 2;
        System.out.println("Welcome Employees");
        int perHourWage = 20;
        int empWorkingDays = 2;
        int empHrs = 0;
        int empWage = 0;
        int maxHrsMonth = 100;
        int totalWorkingDay = 0;
        int totalEmpHrs = 0;
        while (totalEmpHrs <= maxHrsMonth && totalWorkingDay < empWorkingDays){
            totalWorkingDay++;
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
            totalEmpHrs = empHrs + totalEmpHrs;
            System.out.println("Day : " +totalWorkingDay+"Hrs: " +empHrs );
        }
        int totalEmpWage = totalEmpHrs * perHourWage;
        System.out.println("month salary = " +totalEmpWage );
    }
}