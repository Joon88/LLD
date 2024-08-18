package me.sajid.proxyDP;

import me.sajid.proxyDP.DAO.EmployeeDAOProxy;
import me.sajid.proxyDP.DAO.IEmployeeDAO;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Sajid");

        IEmployeeDAO dao = new EmployeeDAOProxy();

        dao.create("ANY", e.getId(), e.getName());
        dao.delete("ANY", e.getId());

        dao.create("USER", e.getId(), e.getName());
        dao.get("USER", e.getId());
        dao.delete("ADMIN", e.getId());
    }
}
