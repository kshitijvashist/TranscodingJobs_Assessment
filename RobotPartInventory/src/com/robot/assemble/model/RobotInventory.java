package com.robot.assemble.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "robotInventory")
@XmlAccessorType(XmlAccessType.FIELD)
public class RobotInventory {
	/**
	 * serialNumber : Unique Number Assigned to the robot inventory details. name :
	 * Name of the entry robot. manufacturer: Manufacture details for the Robot
	 * inventory. weight: Individual weight of the robots in KiloGram.
	 * listOfComponents: List of compatible Components of the robot.
	 */

	private String serialNumber;
	private String name;
	private String manufacturer;
	private String weight;
	private List<String> listOfComponents;

	public RobotInventory() {

	}

	public RobotInventory(String serialNumber, String name, String manufacturer, String weight,
			List<String> listOfComponents) {
		this.serialNumber = serialNumber;
		this.name = name;
		this.manufacturer = manufacturer;
		this.weight = weight;
		this.listOfComponents = listOfComponents;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listOfComponents == null) ? 0 : listOfComponents.hashCode());
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
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
		RobotInventory other = (RobotInventory) obj;
		if (listOfComponents == null) {
			if (other.listOfComponents != null)
				return false;
		} else if (!listOfComponents.equals(other.listOfComponents))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public List<String> getListOfComponents() {
		return listOfComponents;
	}

	public void setListOfComponents(List<String> listOfComponents) {
		this.listOfComponents = listOfComponents;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

}
