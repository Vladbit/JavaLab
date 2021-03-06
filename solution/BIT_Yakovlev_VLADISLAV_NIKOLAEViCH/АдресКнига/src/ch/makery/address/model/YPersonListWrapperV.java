package ch.makery.address.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Helper class to wrap a list of persons. This is used for saving the
 * list of persons to XML.
 * 
 * @author Marco Jakob
 */
@XmlRootElement(name = "persons")
public class YPersonListWrapperV {

	private List<YPersonV> persons;

	@XmlElement(name = "person")
	public List<YPersonV> getPersons() {
		return persons;
	}

	public void setPersons(List<YPersonV> persons) {
		this.persons = persons;
	}
}
