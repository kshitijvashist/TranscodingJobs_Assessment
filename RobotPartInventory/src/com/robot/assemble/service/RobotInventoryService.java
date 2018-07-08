package com.robot.assemble.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.robot.assemble.dao.RobotInventoryDAO;
import com.robot.assemble.model.RobotInventory;

import java.util.List;

@Path("/assemble")
public class RobotInventoryService {
	/**
	 * getAllRobotsDetails: GET Rest API to fetch all the details of the robot part
	 * inventory. updateRobotDetails: PUT Rest API to edit the record on the basis
	 * of the serial numbers. deleteRobotDetails: DELETE Rest API to delete the
	 * record on the basis of the serial numbers. addRobot : POST Rest Api to add
	 * the new details for Robot Inventory.
	 */

	private static Logger LOGGER = Logger.getLogger("robotInventoryLog");

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<RobotInventory> getAllRobotsDetails() {

		List<RobotInventory> listOfCountries = RobotInventoryDAO.allRobotDetails();
		LOGGER.info("RobotInventoryService containing the length of all Robots entires=" + listOfCountries.size());

		return listOfCountries;
	}

	@PUT
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public RobotInventory updateRobotDetails(RobotInventory robot) {
		LOGGER.info("RobotInventoryService edititng the particular record with serial number=" + robot);

		return RobotInventoryDAO.updateRobotDetails(robot);
	}

	@DELETE
	@Path("/{serialNumber}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void deleteRobotDetails(@PathParam("serialNumber") String serialNumber) {
		LOGGER.info("RobotInventoryService deleting the particular record with serial number=" + serialNumber);

		RobotInventoryDAO.deleteRobotDetails(serialNumber);
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public RobotInventory addRobot(RobotInventory robot) {
		LOGGER.info("RobotInventoryService cretaing the Robots entires=" + robot);

		return RobotInventoryDAO.addRobotDetails(robot);
	}

}
