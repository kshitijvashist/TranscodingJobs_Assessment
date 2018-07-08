package com.robot.assemble.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "robotAllPartsDTO")
@XmlAccessorType(XmlAccessType.FIELD)
public class RobotAllPartsDTO {

	/**
	 * listOfALLComponents :All component parts that could be available for the
	 * robots, Superset of compatible components field from Robot Inventory.
	 * 
	 */

	private List<String> listOfALLComponents;

	// This default constructor is required if there are other constructors.
	public RobotAllPartsDTO() {

	}

	public RobotAllPartsDTO(List<String> listOfALLComponents) {

		this.listOfALLComponents = listOfALLComponents;
	}

	public List<String> getListOfALLComponents() {
		return listOfALLComponents;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listOfALLComponents == null) ? 0 : listOfALLComponents.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RobotAllPartsDTO other = (RobotAllPartsDTO) obj;
		if (listOfALLComponents == null) {
			if (other.listOfALLComponents != null)
				return false;
		} else if (!listOfALLComponents.equals(other.listOfALLComponents))
			return false;
		return true;
	}

	public void setListOfALLComponents(List<String> listOfALLComponents) {
		this.listOfALLComponents = listOfALLComponents;
	}

}
