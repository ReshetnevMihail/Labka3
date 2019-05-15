package Tests;

import Main.Company;
import Main.Employee;
import org.junit.Assert;

public class CompanyTest
{
    @org.junit.Test
    public void inpCompany() {
        Company obj = new Company();
        String actualNameOfCompany = obj.GetNameOfCompany();
        String actualTasks = obj.GetTasks();
        Assert.assertNull(actualNameOfCompany);
        Assert.assertNull(actualTasks);
    }

    @org.junit.Test
    public void addEmploee()
    {
        Employee obj = new Employee();
        String actualEmpName = obj.GetEmpName();
        Assert.assertNull(actualEmpName);
    }


}