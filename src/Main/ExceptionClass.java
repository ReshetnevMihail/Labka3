package Main;

public class ExceptionClass extends Company
{
    boolean ExceptionOfPremiumAndAddBuget()
    {
        Company objofCompany = new Company();
        double allMoney = 0;
        int i,j;
        for(i=0;i<100;i++)
        {
            for(j=i+1;j<100;j++) {
                allMoney = obj[i].GetEmpMoney()+obj[j].GetEmpMoney();
            }
        }
        boolean a = (allMoney > objofCompany.GetBuget());
        try{
            if(allMoney > objofCompany.GetBuget()) throw new Exception("Сумма зарплат сотрудников больше чем бюджет компании!!!");
        }
        catch(Exception b){

            System.out.println(b.getMessage());
        }
        return a;
    }



    void ErrorMessage()
    {
        System.out.print("Ошибка!!!");
    }

}
