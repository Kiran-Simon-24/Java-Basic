package subprogram;

public class EmployeeSalary {

    public static void main (String[] args){
            employee[] employees = new employee[2];
            employees[0] = new Manager();
            employees[1] = new Developer();

            for(employee e : employees){
                System.out.println("Salary: " + e.calculateSalary());
            }
        }
    }
    class employee{
        protected double baseSalary = 50000;
        public double calculateSalary(){
            return baseSalary;
        }
    }
    class Manager extends employee {
        private double bonus = 10000;
        public double calculateSalary(){
            return baseSalary + bonus;
        }
    }
    class Developer extends employee {
        private double overtimePay = 6000;
        public double calculateSalary(){
            return baseSalary + overtimePay;
        }
    }





