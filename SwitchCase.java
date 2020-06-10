class SwitchCase{
        public static void main(String[] args){
                int Is_Full_Time = 1;
                int Is_Part_Time = 2;
                int Wage_Per_Hr = 20;
                int empCheck = (int)Math.floor(Math.random() * 10 ) %3;                  // Variables
                int dailyWage = 0;
                int empHrs = 0;
                int empHrs1 = 0;
                int empHrs2 = 0;
                switch (empCheck){
                        case 0:
                                empHrs = 0;
                                break;
                        case 1:
                                empHrs1 = 4;
                                break;
                        case 2:
                                empHrs2 = 8;
                                break;
                }

                dailyWage = Wage_Per_Hr * empHrs;
                System.out.println("Employee Daily Wage=" + dailyWage );
                dailyWage = Wage_Per_Hr * empHrs1;
                System.out.println("Employee Daily Wage For PartTime=" + dailyWage );
                dailyWage = Wage_Per_Hr * empHrs2;
                System.out.println("Employee Daily Wage For FullTime=" + dailyWage );
        }
}

