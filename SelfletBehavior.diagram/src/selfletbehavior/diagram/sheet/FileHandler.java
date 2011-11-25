package selfletbehavior.diagram.sheet;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import java.io.*;
import java.util.*;


public class FileHandler {


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
	 * Write the string content into given file and refresh the file
	 * 
	 * @param file
	 *            the destination file
	 * @param content
	 *            string to write into the file
	 * */
	public static void writeFile(String filePath, String content) {

		try {

			FileOutputStream fos = new FileOutputStream(filePath);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeBytes(content);
			dos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	public static String readTextFile(File file) {
		StringBuilder contents = new StringBuilder();

		try {
			//use buffering, reading one line at a time
			//FileReader always assumes default encoding is OK!
			// BufferedReader input =  new BufferedReader(new FileReader(file));

			// use iso-1 decoding
			Charset charset = Charset.forName("UTF-8");
			BufferedReader input =  new BufferedReader(new InputStreamReader(new FileInputStream(file), charset.newDecoder()));
			try {
				String line = null; //not declared within while loop
				/*
				 * readLine is a bit quirky :
				 * it returns the content of a line MINUS the newline.
				 * it returns null only for the END of the stream.
				 * it returns an empty String if two newlines appear in a row.
				 */
				while (( line = input.readLine()) != null){
					contents.append(line);
					contents.append(System.getProperty("line.separator"));
				}
			}
			finally {
				input.close();
			}
		}
		catch (IOException ex){

		}

		return contents.toString();

	}


	public static void binaryCopyFile(String strSourceFile, String strDestinationFile){
		try
		{
			//create FileInputStream object for source file
			FileInputStream fin = new FileInputStream(strSourceFile);

			//create FileOutputStream object for destination file
			FileOutputStream fout = new FileOutputStream(strDestinationFile);

			byte[] b = new byte[1024];
			int noOfBytes = 0;

			System.out.println("Copying file using streams");

			//read bytes from source file and write to destination file
			while( (noOfBytes = fin.read(b)) != -1 )
			{
				fout.write(b, 0, noOfBytes);
			}

			System.out.println("File copied!");

			//close the streams
			fin.close();
			fout.close();			

		}
		catch(FileNotFoundException fnf)
		{
			System.out.println("Specified file not found :" + fnf);
		}
		catch(IOException ioe)
		{
			System.out.println("Error while copying file :" + ioe);
		}
	}

	public static void copyJarFile(JarFile jarFile, File destDir) throws IOException {
		String fileName = jarFile.getName();
		String fileNameLastPart = fileName.substring(fileName.lastIndexOf(File.separator));
		File destFile = new File(destDir, fileNameLastPart);

		JarOutputStream jos = new JarOutputStream(new FileOutputStream(destFile));
		Enumeration<JarEntry> entries = jarFile.entries();

		while (entries.hasMoreElements()) {
			JarEntry entry = entries.nextElement();
			InputStream is = jarFile.getInputStream(entry);

			//jos.putNextEntry(entry);
			//create a new entry to avoid ZipException: invalid entry compressed size
			jos.putNextEntry(new JarEntry(entry.getName()));
			byte[] buffer = new byte[4096];
			int bytesRead = 0;
			while ((bytesRead = is.read(buffer)) != -1) {
				jos.write(buffer, 0, bytesRead);
			}
			is.close();
			jos.flush();
			jos.closeEntry();
		}
		jos.close();
	}



	//=============================================================== copyFile
	// Uses BufferedReader for file input.
	public static void copyFile(File fromFile, File toFile) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(fromFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(toFile));

		//... Loop as long as there are input lines.
		String line = null;
		while ((line=reader.readLine()) != null) {
			writer.write(line);
			writer.newLine();   // Write system dependent end of line.
		}

		//... Close reader and writer.
		reader.close();  // Close to unlock.
		writer.close();  // Close to unlock and flush to disk.
	}


	//=============================================================== copyFile2
	// Uses Scanner for file input.
	public static void copyFile2(File fromFile, File toFile) throws IOException {
		Scanner freader = new Scanner(fromFile);
		BufferedWriter writer = new BufferedWriter(new FileWriter(toFile));

		//... Loop as long as there are input lines.
		String line = null;
		while (freader.hasNextLine()) {
			line = freader.nextLine();
			writer.write(line);
			writer.newLine();   // Write system dependent end of line.
		}

		//... Close reader and writer.
		freader.close();  // Close to unlock.
		writer.close();  // Close to unlock and flush to disk.
	}

}
