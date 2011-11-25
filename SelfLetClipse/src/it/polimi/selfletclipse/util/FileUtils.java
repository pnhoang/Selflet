package it.polimi.selfletclipse.util;

import it.polimi.selfletclipse.model.Goal;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * @author Nicola
 */
public class FileUtils {

    private static final Logger LOG = Logger.getLogger(FileUtils.class);

    /**
     * @param rsc
     *            the resource from which create the document objects
     * */
    public static Document loadDocumentFromXmlFile(IResource resource) {

	DocumentBuilder docBuilder = null;
	Document doc = null;

	DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
		.newInstance();
	docBuilderFactory.setIgnoringElementContentWhitespace(true);

	try {
	    docBuilder = docBuilderFactory.newDocumentBuilder();
	} catch (ParserConfigurationException e) {
	    e.printStackTrace();
	}

	File f = new File(resource.getLocation().toString());

	try {
	    doc = docBuilder.parse(f);
	} catch (SAXException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
	return doc;
    }

    /**
     * Load the document from the specified file and then returns a service object
     * extracted form the given resource.
     * 
     * @return null if the file does not represents a valid service xml file, the
     *         service otherwise
     * */
    public static Goal loadGoalFromFile(IResource resource) {

	Document doc = loadDocumentFromXmlFile(resource);

	return XmlUtil.parseGoal(doc);
    }

    /**
     * Write a new file containing the data and set its contents to the given
     * InputStream
     * 
     * @param file
     *            the destination file
     * @param g
     *            the InputStream that will be written in the file
     * @return true if there is a problem
     * 
     * */
    public static boolean createFileFromInputStream(IFile file, InputStream g) {
	if (file == null || g == null)
	    return true;

	/* If the file does not exists create it */
	try {
	    if (!file.exists())
		file.create(null, false, null);
	} catch (CoreException e) {
	    e.printStackTrace();
	    return true;
	}

	/* Copy the template file into the previous created file */
	try {
	    file.setContents(g, IFile.FORCE, null);
	    file.refreshLocal(IResource.DEPTH_ZERO, null);

	} catch (CoreException e) {
	    e.printStackTrace();
	    return true;
	}
	return false;
    }

    /**
     * Write the string content into given file and refresh the file
     * 
     * @param file
     *            the destination file
     * @param content
     *            string to write into the file
     * */
    public static void writeFile(IFile file, String content) {

	if (file == null || content == null)
	    return;

	try {

	    FileOutputStream fos = new FileOutputStream(file.getLocationURI()
		    .getPath());
	    DataOutputStream dos = new DataOutputStream(fos);
	    dos.writeBytes(content);
	    dos.close();

	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}

	// Refresh file
	try {
	    file.refreshLocal(IResource.DEPTH_ZERO, null);
	} catch (CoreException e) {
	    e.printStackTrace();
	}
    }

    /**
     * Write a file in the given project.
     * 
     * @param prj
     *            the project in which the project will be written
     * @param path
     *            the file path inside the project
     * 
     * @return the IFile created, or the pre-existing file. null if some problem
     *         arises
     * */
    public static IFile createFileInProject(IProject prj, String path) {

	if (prj == null || path == null)
	    return null;

	IFile file = prj.getFile(path);

	if (file == null)
	    return null;

	try {
	    file.create(null, false, new NullProgressMonitor());
	} catch (CoreException e) {
	    LOG.debug("The file " + file.getName()
		    + "already exists! It will be overwritten");
	}

	return file;
    }
}
