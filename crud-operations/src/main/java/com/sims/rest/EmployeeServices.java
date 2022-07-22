package com.sims.rest;
//
import com.sims.beans.Employee;
import com.sims.dao.EmployeeDAO;

import java.util.*;
 
import javax.ws.rs.*;
import javax.ws.rs.core.*;


@Path("/employees")

public class EmployeeServices {
	private EmployeeDAO dao = EmployeeDAO.getInstance();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> list() {
		return dao.getEmployees();
	}
}

// http://locahost/crud-operations/rest/employees