package info.sjd.service;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import info.sjd.entity.UserList;

public class ObjectConverter {

	public synchronized static void convertToXml(UserList users) {
		try {
			String path = System.getProperty("user.dir") + System.getProperty("file.separator") + "out-file.xml";

			File file = new File(path);
			JAXBContext jaxbContext = JAXBContext.newInstance(UserList.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(users, file);
			jaxbMarshaller.marshal(users, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
