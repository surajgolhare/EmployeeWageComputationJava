 class EmpWageFor100Hrand20Days{
        public static void main(String[] args){
                int Is_Full_Time = 1;
                int Is_Part_Time = 2;
                int Wage_Per_Hr = 20;

                int empHrs = 0;
                int totalWage = 0;
                int totalWorkingHr = 0;
                int totalWorkingDay = 0;
                while( totalWorkingHr <= 100 && totalWorkingDay <=20)
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
                        ++totalWorkingDay;
                        totalWorkingHr= totalWorkingHr + empHrs;
                }
                totalWage = totalWorkingHr * Wage_Per_Hr;
                System.out.println("Total Wage: "+totalWage );
        }
}
