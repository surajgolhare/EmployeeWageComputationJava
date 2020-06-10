 class CalDailyEmpWage
{
        public static void main(String[] args){
                int Is_Full_Time = 1;
                int Wage_Per_Hr = 20;
                int Full_Day_Hr = 8;
                double empCheck = Math.floor(Math.random() * 10 ) %2;
                int dailyWage = 0;

                if (empCheck == Is_Full_Time)
                {
                        System.out.println("Employee is Present.");
                        dailyWage = Wage_Per_Hr * Full_Day_Hr;
                }
                else
                {
                        System.out.println("Employee is Absent.");

                }
                System.out.println("Employee Daily Wage=" + dailyWage );
        }
}
