package ru.skillfactory.Ex29.io;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import ru.skillfactory.Ex29.model.CompleteInfo;

import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class XmlWriter {
    protected XmlWriter(){}

    public static void completeInfoToXml(CompleteInfo completeInfo) {
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(CompleteInfo.class);

            Marshaller marshaller = jaxbContext.createMarshaller();
        String path = "";
        try {
            path = String.valueOf(Files.createDirectory(Paths.get("xmlReqs")));
            }catch(IOException e) {
            e.printStackTrace();
        }
           File file = new File(path+"/infoReq"+new Date().getTime()+".xml");
            marshaller.marshal(completeInfo, file);
        }catch(JAXBException e) {
            e.printStackTrace();
        }
    }
}
//
