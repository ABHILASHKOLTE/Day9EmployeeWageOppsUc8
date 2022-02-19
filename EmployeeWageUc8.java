package com.day9employeewageUC8;
public class EmployeeWageUc8 {

    public static final int IS_PART_TIME = 1, IS_FULL_TIME = 2;

    public static void main(String[] args) {
        computeEmpWage("Apple", 30,2,10);
        computeEmpWage("Sony", 25,4,20);
        computeEmpWage("Jio", 15,8,20);
        computeEmpWage("Tesla", 12,6,20);
        computeEmpWage("Blue Origin", 10,9,20);
    }

    public static int computeEmpWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0, dailyWage = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_PART_TIME:	empHrs = 4;		break;
                case IS_FULL_TIME:	empHrs = 8;		break;
                default:			empHrs = 0;
            }
            totalEmpHrs += empHrs;
            dailyWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Day no.: " + totalWorkingDays + ", Emp Hrs: " +empHrs + ", Daily Wage: " +dailyWage );
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Employee wage is :" + totalEmpWage + "\n");
        return totalEmpWage;
    }
}

