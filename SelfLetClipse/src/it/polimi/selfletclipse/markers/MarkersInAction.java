package it.polimi.selfletclipse.markers;

import it.polimi.selfletclipse.util.StringUtils;

import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

public class MarkersInAction {

    private IResource resource;
    private IFile file;

    public MarkersInAction(IResource resource) {
	this.resource = resource;
    }

    public void getMarkers() {
	file = resource.getProject().getFile("actions/" + resource.getName());

	if (file == null)
	    return;

	InputStream is = null;
	try {
	    is = file.getContents();
	} catch (CoreException e) {
	    e.printStackTrace();
	}

	String content = StringUtils
		.inputStreamToString(is);

	/* Use regular expression?? */

	Pattern p = Pattern.compile(".*needGoal.*");
	Matcher m = p.matcher(content);
	System.out.println(m.matches());

	// int length = content.length();
	// content.indexOf(" ");
	// int from = 0;
	// int to = 0;
	// while (from < length) {
	// to = content.indexOf(" ", from);
	// String s = content.substring(from, to);
	// System.out.println(s);
	// from = to;
	//
	// }

	// for (int i = 0; i < length; i++) {
	// String sub = content.substring(i);
	// int l1 = ".needGoal(".length();
	// l1 = l1 > sub.length() ? sub.length() : l1;
	// String s = sub.substring(0, l1);
	// if (sub.startsWith(".need")) {
	//
	// int k = 0;
	// while (sub.charAt(k) != '\"' && sub.charAt(k + 1) != ')'
	// && k < length) {
	// k++;
	// }
	// String name = sub.substring(0, k);
	// System.out.println(name);
	//
	// }
	// }

    }
}
