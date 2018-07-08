package com.robot.assemble.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.robot.assemble.model.*;

public class RobotInventoryDAO {
	private static Logger LOGGER = Logger.getLogger("robotInventoryLog");
	private static final Map<String, RobotInventory> robotMap = new HashMap<String, RobotInventory>();

	static {
		initrobotDetails();
	}

	private static void initrobotDetails() {
		List<String> litOfComp = new ArrayList<String>();
		String compatibleComponents = "Camera, Digital Torch, LED";
		litOfComp.add(compatibleComponents);
		RobotInventory robot1 = new RobotInventory("OSL007", "CaptainAmerica", "Marvel", "250", litOfComp);
		RobotInventory robot2 = new RobotInventory("OSL126", "IronMan", "Marvel", "300", litOfComp);
		RobotInventory robot3 = new RobotInventory("OSL143", "Thor", "Marvel", "400", litOfComp);

		robotMap.put(robot1.getSerialNumber(), robot1);
		robotMap.put(robot2.getSerialNumber(), robot2);
		robotMap.put(robot3.getSerialNumber(), robot3);
	}

	public static RobotInventory addRobotDetails(RobotInventory robot) {
		robotMap.put(robot.getSerialNumber(), robot);
		return robot;
	}

	public static RobotInventory updateRobotDetails(RobotInventory robot) {
		robotMap.put(robot.getSerialNumber(), robot);
		return robot;
	}

	public static void deleteRobotDetails(String robot) {
		robotMap.remove(robot);
	}

	public static List<RobotInventory> allRobotDetails() {
		Collection<RobotInventory> c = robotMap.values();
		List<RobotInventory> list = new ArrayList<RobotInventory>();
		list.addAll(c);
		LOGGER.info("RobotInventoryDAO for getting the list size of all robot inventory=" + list.size());
		return list;
	}

	List<RobotInventory> list;

}
