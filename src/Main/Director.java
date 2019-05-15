package Main;

import java.util.Scanner;

public class Director extends Employee
{

    void CompanyManagement(int i)
    {
        Company objofcompany = new Company();
        if (i == 1) {
            int j;
            Scanner in = new Scanner(System.in);
            System.out.print("Введите номер сотрудника: ");
            j = in.nextInt();
            objofcompany.addEmploee(j);
        }
        else
        {
            objofcompany.addBuget();
        }
    }

    double premium()
    {
        ExceptionClass objOfExceptionClass = new ExceptionClass();
        if(objOfExceptionClass.ExceptionOfPremiumAndAddBuget() == false) {
            money = money + 200;
            return money;
        }
        else
        {
            return  0;
        }
    }
}
