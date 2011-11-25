package it.polimi.selfletclipse.model;

import it.polimi.selfletclipse.WorkspaceManager;
import it.polimi.selfletclipse.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;

public class SelfLetProject {

	private String name;
	private String author;
	private String REDsAddress;
	private String REDsPort;
	private String limePort;
	private String description;
	private boolean createDirectories;
	private boolean activeSelflet;

	private Goal mainService;
	private ArrayList<Goal> services;

	private Map<String, ArrayList<IResource>> resourcesMap;
	private IProject projectResource;

	public SelfLetProject(String name, IProject projectResource) {
		this.name = name;
		this.projectResource = projectResource;
		author = "";
		REDsAddress = "";
		REDsPort = "";
		limePort = "";
		description = "";
		resourcesMap = new HashMap<String, ArrayList<IResource>>();
		services = new ArrayList<Goal>();
	}

	public Map<String, ArrayList<IResource>> getResources() {
		return resourcesMap;
	}

	/**
	 * @param type
	 *            the type of resources
	 * @param resources
	 *            the resources of the specsified type
	 * */
	public void setFolderResources(String type, ArrayList<IResource> resources) {
		resourcesMap.put(type, resources);
	}

	/**
	 * Returns the resources vector given a specific type. The type is defined
	 * in the WorkspaceManager class.
	 * 
	 * @param type
	 *            the type of the resource as taken from the WorkspaceManager
	 *            static int constants.
	 * @return a vector containing the resources. An empty array in case the
	 *         index is not valid or no resources were found.
	 * */
	public ArrayList<IResource> getResourcesByType(int type) {
		if (type < 0 || type > (WorkspaceManager.folderNames.length - 1))
			return new ArrayList<IResource>();

		ArrayList<IResource> v = resourcesMap
				.get(WorkspaceManager.folderNames[type]);
		return (v != null) ? v : new ArrayList<IResource>();

	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setREDsAddress(String rEDsAddress) {
		REDsAddress = rEDsAddress;
	}

	public void setREDsPort(String rEDsPort) {
		REDsPort = rEDsPort;
	}

	public void setLimePort(String limePort) {
		this.limePort = limePort;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCreateDirectories(boolean createDirectories) {
		this.createDirectories = createDirectories;
	}

	public void setActiveSelflet(boolean activeSelflet) {
		this.activeSelflet = activeSelflet;
	}

	public void setMainGoal(Goal mainService) {
		this.mainService = mainService;
	}

	public String getAuthor() {
		return author;
	}

	public String getREDsAddress() {
		return REDsAddress;
	}

	public String getREDsPort() {
		return REDsPort;
	}

	public String getLimePort() {
		return limePort;
	}

	public String getDescription() {
		return description;
	}

	public boolean isCreateDirectories() {
		return createDirectories;
	}

	public boolean isActiveSelflet() {
		return activeSelflet;
	}

	public Goal getMainGoal() {
		return mainService;
	}

	public String getName() {
		return name;
	}

	public void setProjectResource(IProject projectResource) {
		this.projectResource = projectResource;
	}

	public IProject getProjectResource() {
		return projectResource;
	}

	public Goal getGoal(String serviceName) throws NotFoundException {
		for (Goal service : services) {
			if (service.getName().equals(serviceName))
				return service;
		}

		throw new NotFoundException();
	}

	public ArrayList<Goal> getGoals() {
		return (ArrayList<Goal>) services.clone();
	}

	public ArrayList<IResource> getGoalResources() {
		String services = WorkspaceManager.folderNames[WorkspaceManager.GOAL];

		return resourcesMap.get(services);
	}

	public void addGoal(Goal service) {
		for (Goal g : services) {
			if (g.equals(service))
				services.remove(g);
		}

		services.add(service);
	}

	/**
	 * The equals just consider the selflet name
	 * */
	public boolean equals(SelfLetProject otherProject) {
		if (name.equals(otherProject.name))
			return true;
		return false;
	}

	public boolean equals(Object obj) {
		if (obj instanceof SelfLetProject)
			return equals((SelfLetProject) obj);
		return false;
	}

}
