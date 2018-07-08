package com.robot.assemble.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.robot.assemble.dao.RobotAllPartsDAO;
import com.robot.assemble.model.RobotAllPartsDTO;

@Path("/allParts")
public class RobotAllPartsService {

	/**
	 * getAllPartsDetails: GET Rest API to fetch all the details of the robot part
	 * inventory.
	 */

	private static Logger LOGGER = Logger.getLogger("robotInventoryLog");

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<RobotAllPartsDTO> getAllPartsDetails() {

		List<RobotAllPartsDTO> listOfCountries = RobotAllPartsDAO.getAlPartsDetails();
		LOGGER.info("RobotAllPartsService containing the length of all parts=" + listOfCountries.size());
		return listOfCountries;
	}

}
