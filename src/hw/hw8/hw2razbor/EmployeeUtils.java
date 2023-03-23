package hw.hw8.hw2razbor;

public class EmployeeUtils {

//    поиск сотрудника в массиве по его имени

    public int findByName(String name, Employee[] arr){

        for (int i = 0; i < arr.length; i++) {

             if (name.equals((arr[i].getName()))){
                  return i;
             }
          }

         return -1;
    }

//    поиск сотрудника в массиве по вхождению указанной строки в его имени

    public int findBySubName(String subName, Employee[] arr){

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getName().contains(subName)){
                return i;
            }
        }

        return -1;
    }

//    подсчет зарплатного бюджета для всех сотрудников в массиве

    public int salarySum(Employee[] arr){

        int result = 0;

        for (int i = 0; i < arr.length; i++) {

           result += arr[i].getBaseSalary();
        }
        return result;
    }

//    поиск наименьшей зарплаты в массиве

    public int findMinSalary(Worker[] arr){

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i].getSalaryWorker()){
                min = arr[i].getSalaryWorker();

            }
        }
        return min;
    }

//    поиск наибольшей зарплаты в массиве

    public int findMaxSalary(Worker[] arr){

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i].getSalaryWorker()){
                max = arr[i].getSalaryWorker();

            }
        }
        return max;
    }

//    поиск наименьшего количества подчиненных в массиве менеджеров

    public int findMinNumberOfSubordinates(Manager[] arr){

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i].getNumberOfSubordinates()){
                min = arr[i].getNumberOfSubordinates();

            }
        }
        return min;
    }

//    поиск наибольшего количества подчиненных в массиве менеджеров

    public int findMaxNumberOfSubordinates(Manager[] arr){

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i].getNumberOfSubordinates()){
                max = arr[i].getNumberOfSubordinates();

            }
        }
        return max;
    }

//    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public int findMinAllowance(Manager[] arr){

        int min = Integer.MAX_VALUE;
        int allowance;

        for (int i = 0; i < arr.length; i++) {
            
            allowance = arr[i].getSalaryManager() - arr[i].getBaseSalary();

            if (min > allowance){
                min = allowance;

            }
        }
        return min;
    }


//    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public int findMaxAllowance(Manager[] arr){

        int max = Integer.MIN_VALUE;
        int allowance;

        for (int i = 0; i < arr.length; i++) {

            allowance = arr[i].getSalaryManager() - arr[i].getBaseSalary();

            if (max > allowance){
                max = allowance;

            }
        }
        return max;
    }








}
