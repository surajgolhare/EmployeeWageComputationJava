class PartTimeEmpWage{
        public static void main(String[] args){
                int Is_Full_Time = 1;
                int Is_Part_Time = 2;
                int Wage_Per_Hour = 20;

                double empCheck = Math.floor(Math.random() * 10 ) %3;
                int dailyWage = 0;
                int dailyWageParttime = 0;
                System.out.println("Welcome Wage Employee");
                if (empCheck == Is_Full_Time)
                        dailyWage = Wage_Per_Hour * 8 ;
                else if (empCheck == Is_Part_Time)
                        dailyWageParttime = Wage_Per_Hour * 4 ;
                else
                        System.out.println("Employee is Absent");

                System.out.println("Employee Daily FullWage=" + dailyWage );
                System.out.println("Employee Daily PartTimeWage=" + dailyWageParttime  );
        }
}



