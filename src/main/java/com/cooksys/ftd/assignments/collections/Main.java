package com.cooksys.ftd.assignments.collections;

import com.cooksys.ftd.assignments.collections.model.Manager;
import com.cooksys.ftd.assignments.collections.model.OrgChart;
import com.cooksys.ftd.assignments.collections.model.Worker;

public class Main {

    /**
     * TODO [OPTIONAL]: Students may use this main method to manually test their code. They can instantiate Employees
     *  and an OrgChart here and test that the various methods they've implemented work as expected. This class and
     *  method are purely for scratch work, and will not be graded.
     */
    public static void main(String[] args) {

        Manager CEO = new Manager("Frank");
        Manager CTO = new Manager("Kate", CEO);
        Manager seniorDeveloper = new Manager("Jake", CTO);
        Manager seniorPM = new Manager("Jack", CTO);
        Worker developer = new Worker("Dave", seniorDeveloper);
        Worker PM = new Worker("Phill", seniorPM);
        Worker entryDeveloper = new Worker("Jake", seniorDeveloper);
        Worker entryPM = new Worker("Kristen", seniorPM);
        Worker aa = new Worker("Jay", CTO);

        OrgChart orgChart = new OrgChart();

        orgChart.addEmployee(aa);
        orgChart.addEmployee(entryDeveloper);
        orgChart.addEmployee(entryPM);
        orgChart.addEmployee(PM);
        orgChart.addEmployee(developer);

//        orgChart.addEmployee(CEO);

        System.out.println(orgChart.getAllEmployees());
        System.out.println(orgChart.getAllEmployees().size());
        System.out.println(orgChart.getAllManagers());
        System.out.println(orgChart.getAllManagers().size());

//        System.out.println(entryDeveloper.getChainOfCommand());
//        System.out.println(seniorDeveloper.getChainOfCommand());

//        System.out.println(entryDeveloper.getChainOfCommand());
//        System.out.println(orgChart.getAllEmployees());
//        System.out.println(orgChart.getAllManagers());

//        orgChart.addEmployee(CTO);
//        orgChart.addEmployee(seniorDeveloper);
//        orgChart.addEmployee(seniorPM);
//        orgChart.addEmployee(developer);
//        orgChart.addEmployee(PM);
//        orgChart.addEmployee(aa);
//        System.out.println(orgChart.hasEmployee(CEO));

//        System.out.println(aa.getManager());
//        System.out.println(seniorDeveloper.getChainOfCommand());
//        System.out.println(aa.getChainOfCommand());
//        System.out.println(CEO.getManager());
//        System.out.println(CEO.getChainOfCommand());
    }

}
