package Main;

public class Programmer extends Employee
{
    Programmer(String Name, double Money)
    {
        name = Name;
        money = Money;
    }

    void Work()
    {
        System.out.println("writing code...");
    }

    double GetMoreNoney(double moreMoney)
    {
        ExceptionClass objOfExceptionClass = new ExceptionClass();
        if(objOfExceptionClass.ExceptionOfPremiumAndAddBuget() == false) {
            money = money + moreMoney;
            return money;
        }
        else
        {
            return 0;
        }
    }
}
