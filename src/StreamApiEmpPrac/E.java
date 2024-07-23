package StreamApiEmpPrac;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class E {
    public static void main(String[] args) {
       List<Employee> data= Arrays.asList(
                new Employee(1,"om",23),
                new Employee(2,"mike",24),
                new Employee(3,"harry",24)
        );
        Map<Boolean, List<Employee>> collect = data.stream().collect(Collectors.groupingBy(emp -> emp.getAge() > 23));
        System.out.println(collect);


      /* List<Employee> newData=data.stream().filter(emp->emp.getAge()>23).collect(Collectors.toList());
       for(Employee e:newData){
           System.out.println(e.getId());
           System.out.println(e.getName());
           System.out.println(e.getAge());
       }*/

    }
}

