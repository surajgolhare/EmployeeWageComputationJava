class EmployeeWage{
        public static void main(String[] args){
                int Is_Full_Time = 1;
                int Is_Part_Time = 2;
                int Wage_Per_Hr = 20;

                int dailyWage = 0;
                int empHrs = 0;
                int totalWage = 0;

                for (int i = 0 ; i< 20; i++)
                {
                        int empCheck = (int)Math.floor(Math.random() * 10 ) %3;
                        switch (empCheck){
                                case 0:
                                        empHrs = 0;
                                        break;
                                case 1:
                                        empHrs = 4;
                                        break;
                                case 2:
                                        empHrs = 8;
                                        break;
                        }

                        dailyWage = Wage_Per_Hr * empHrs;
                        totalWage = totalWage + dailyWage ;
                }
                System.out.println("Month Wage=" + totalWage );
        }
}
