package Main;

public class Employee
{
    String name;
    double money;

    public Employee()
    {
       money = 0;
    }

    Employee(double Many,String Name){
        money = Many;
        name = Name;
    }

    void AddMoney()
    {
        Company obj = new Company();
        obj.addBuget();

    }

    public String GetEmpName()
    {
        return name;
    }

    public double GetEmpMoney()
    {
      return money;
    }

    public void SetEmpName(String Name)
    {
        name = Name;
    }

    public void SetEmpMoney(double Money)
    {
        money = Money;
    }





}
