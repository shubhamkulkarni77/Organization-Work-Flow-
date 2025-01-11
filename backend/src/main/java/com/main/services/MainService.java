package com.main.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.MainDao;
import com.main.entities.Country;
import com.main.entities.Employee;

@Service
public class MainService {
	@Autowired
	MainDao dao;

	public String addCountry(Country c) {

		String msg = dao.addCountry(c);

		if (Objects.isNull(msg)) {
			msg = "Country is Not addedd";
		}

		return msg;
	}

	public String updateCountry(Country c, int id) {
		String msg = dao.updateCountry(c, id);
		if (Objects.isNull(msg)) {
			msg = "Country is not Updated";
		}
		return msg;
	}

	public String deleteCountry(int id) {

		String msg = dao.deleteCountry(id);
		if (Objects.isNull(msg)) {
			msg = "Country is not Deleted";
		}
		return msg;

	}

	public List<Country> getAllCountry() {

		List<Country> list = dao.getAllCountry();

		return list;
	}

	public Country getParticularCountryById(int id) {
		Country con = dao.getParticularCountryById(id);
		return con;
	}

	public String addEmployee(Employee emp) {
		String msg = dao.addEmployee(emp);
		if (Objects.isNull(msg)) {
			msg = "Employee Addedd Successfully";

		}
		return msg;

	}

	public Map login(Employee emp) {

		Employee obj = dao.login(emp);
		Map map = new HashMap();
		if (Objects.isNull(obj)) {
			map.put("msg", "Invalid User");
			map.put("user", obj);
		} else {
			map.put("msg", "Valid User");
			map.put("user", obj);
		}

		return map;
	}

	public List<Employee> getAllEmployee() {

		List<Employee> list = dao.getAllEmployee();

		return list;

	}

	public Employee getParticularById(int id) {
		Employee emp = dao.getParticularById(id);
		return emp;
	}

	public List<Employee> salaryRange(double startSal, double endSal) {

		List<Employee> list = dao.salaryRange(startSal, endSal);

		return list;
	}

	public String updateEmp(Employee emp, int id) {

		return dao.updateEmp(emp, id);

	}

	public String deleteEmp(int id) {

		return dao.deleteEmp(id);

	}

}
