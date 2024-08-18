package me.sajid.proxyDP.DAO;

import me.sajid.proxyDP.Employee;

public class EmployeeDAOProxy implements IEmployeeDAO{
    private IEmployeeDAO employeeDao;

    public EmployeeDAOProxy() {
        employeeDao = new EmployeeDAOImpl();
    }

    @Override
    public Employee get(String userType, int id) {
        return employeeDao.get(userType, id);
    }

    @Override
    public void create(String userType, int id, String name) {
        if(userType.equals("USER") || userType.equals("ADMIN")) {
            employeeDao.create(userType, id, name);
        } else
            System.out.println("ERROR:: Permission issue");
    }

    @Override
    public void delete(String userType, int id) {
        if(userType.equals("ADMIN")) {
            employeeDao.delete(userType, id);
        } else
            System.out.println("ERROR:: Permission issue");
    }
}
