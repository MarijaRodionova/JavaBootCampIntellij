
import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class FirstActivity {

            public String employeeBob;
            public String employeeTim;
            public String employeeRob;

       public FirstActivity(String employeeBob, String employeeTim, String employeeRob) {
                this.employeeBob = employeeBob;
                this.employeeTim = employeeTim;
                this.employeeRob = employeeRob;

            }

            public static void main (String[]args){
                FirstActivity emp = new FirstActivity("500", "550", "660");
                Integer[] arr = {500, 600, 550};
                Arrays.sort(arr, Collections.reverseOrder());
                System.out.println("Salaries of Employees Bob, Tim and Rob " + Arrays.toString(arr));

            }

        }







