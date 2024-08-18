package me.sajid.proxyDP.DAO;

import me.sajid.proxyDP.Employee;

public interface IEmployeeDAO {
    public Employee get(String userType, int id);
    public void create(String userType, int id, String name);
    public void delete(String userType, int id);
}
