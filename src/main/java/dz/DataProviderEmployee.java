package dz;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEmployee {

    @DataProvider(name = "employeeData")
    public Object[][] getData() {
        Object[][] userCreds = new Object[][]{
                {new Employee("Alex", "QA",9)},
                {new Employee("Vicki", "economist",8)},
                {new Employee("Kira", "teacher",7)}
        };
        return userCreds;
    }

    @Test(description = "Print employee data", dataProvider = "employeeData")
    public void printEmployee(Employee employee){
        System.out.println(employee);
    }

}
