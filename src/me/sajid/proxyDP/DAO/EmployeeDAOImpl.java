package me.sajid.proxyDP.DAO;

import me.sajid.proxyDP.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDAOImpl implements IEmployeeDAO{
    private final Map<Integer, Employee> employeeList;

    public EmployeeDAOImpl() {
        employeeList = new HashMap<>();
    }

    @Override
    public Employee get(String userType, int id) {
        System.out.println("Employee: " + employeeList.get(id).toString());
        return employeeList.get(id);
    }

    @Override
    public void create(String userType, int id, String name) {
        employeeList.put(id, new Employee(id, name));
        System.out.println("Id: " + id + " created");
    }

    @Override
    public void delete(String userType, int id) {
        employeeList.remove(id);
        System.out.println("Id: " + id + " removed");
    }
}
