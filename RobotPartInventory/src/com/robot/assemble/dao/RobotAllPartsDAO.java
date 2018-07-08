package com.robot.assemble.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.robot.assemble.constants.RobotPartsConstants;
import com.robot.assemble.model.RobotAllPartsDTO;

public class RobotAllPartsDAO {

	private static Logger LOGGER = Logger.getLogger("robotInventoryLog");
	private static final List<RobotAllPartsDTO> robotList = new ArrayList<RobotAllPartsDTO>();

	static {
		initAllParts();
	}

	private static void initAllParts() {		//This method is used as a alternative for fetching data from Databases
		List<String> litOfComp = new ArrayList<String>();
		List<String> litOfComp2 = new ArrayList<String>();
		List<String> litOfComp3 = new ArrayList<String>();
		List<String> litOfComp4 = new ArrayList<String>();
		List<String> litOfComp5 = new ArrayList<String>();
		List<String> litOfComp1 = new ArrayList<String>();
		
		litOfComp.add(RobotPartsConstants.Components1);
		litOfComp1.add(RobotPartsConstants.Components2);
		litOfComp2.add(RobotPartsConstants.Components3);
		litOfComp3.add(RobotPartsConstants.Components4);
		litOfComp4.add(RobotPartsConstants.Components5);
		litOfComp5.add(RobotPartsConstants.Components6);

		robotList.add(new RobotAllPartsDTO(litOfComp));
		robotList.add(new RobotAllPartsDTO(litOfComp1));
		robotList.add(new RobotAllPartsDTO(litOfComp2));
		robotList.add(new RobotAllPartsDTO(litOfComp3));
		robotList.add(new RobotAllPartsDTO(litOfComp4));
		robotList.add(new RobotAllPartsDTO(litOfComp5));

	}

	public static List<RobotAllPartsDTO> getAlPartsDetails() {
		List<RobotAllPartsDTO> list = new ArrayList<RobotAllPartsDTO>();
		try {
			list.addAll(robotList);
			LOGGER.info("RobotAllPartsDAO for getting the length of all parts=" + list.size());

		} catch (Exception e) {
			LOGGER.error("Error in getAlPartsDetails" + e.getMessage());
		}
		return list;
	}

	List<RobotAllPartsDTO> list;

}
