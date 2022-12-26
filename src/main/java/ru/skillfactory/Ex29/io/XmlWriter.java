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
import java.util.logging.Level;
import java.util.logging.Logger;

public class XmlWriter {
    private static final Logger logger = Logger.getLogger(XmlWriter.class.getName());
    protected XmlWriter(){}

    public static void completeInfoToXml(CompleteInfo completeInfo) {
        try{
            logger.log(Level.INFO,"JAXB to XML Marshalling Start!!!");
            JAXBContext jaxbContext = JAXBContext.newInstance(CompleteInfo.class);

            Marshaller marshaller = jaxbContext.createMarshaller();
        String path = "xmlReqs";
        try {
            path = String.valueOf(Files.createDirectory(Paths.get("xmlReqs")));
            logger.log(Level.INFO,"creating directory");
            }catch(IOException e) {
            logger.log(Level.SEVERE,"Cannot create folder : " +path +", most likely it exists", e);
            e.printStackTrace();
        }
           File file = new File(path+"/infoReq"+new Date().getTime()+".xml");
          try {
              marshaller.marshal(completeInfo, file);
          }catch(Exception e) {e.printStackTrace();}
        }catch(JAXBException e) {
            logger.log(Level.SEVERE,"JAXB to XML failed");
            e.printStackTrace();
        }
    }
}
//
