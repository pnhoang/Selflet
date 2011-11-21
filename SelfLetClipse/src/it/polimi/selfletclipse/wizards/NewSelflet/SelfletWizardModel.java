package it.polimi.selfletclipse.wizards.NewSelflet;

import java.util.Observable;

public class SelfletWizardModel extends Observable {

    private String projectName;
    private String authorName;
    private String description;

    private String REDsAddress;
    private String REDsPort;
    private String limePort;
    private boolean activeSelfLet;
    private boolean pageComplete;

    public SelfletWizardModel() {
	// default values
	projectName = "";
	authorName = "";
	description = "";
	REDsAddress = "127.0.0.1";
	REDsPort = "8000";
	limePort = "16912";
	activeSelfLet = true;
	pageComplete = false;
    }

    public String getProjectName() {
	return projectName;
    }

    void setProjectName(String projectName) {
	this.projectName = projectName;
	updateNextButton();
	changeAndNotifyObservers();
    }

    public String getAuthorName() {
	return authorName;
    }

    void setAuthorName(String authorName) {
	this.authorName = authorName;
	changeAndNotifyObservers();
    }

    public String getDescription() {
	return description;
    }

    void setDescription(String description) {
	this.description = description;
	changeAndNotifyObservers();
    }

    public String getREDsAddress() {
	return REDsAddress;
    }

    void setREDsAddress(String dsAddress) {
	this.REDsAddress = dsAddress;
	updateNextButton();
	changeAndNotifyObservers();
    }

    public String getREDsPort() {
	return REDsPort;
    }

    void setREDsPort(String port) {
	this.REDsPort = port;
	updateNextButton();

	changeAndNotifyObservers();
    }

    public String getLimePort() {
	return limePort;
    }

    void setLimePort(String limePort) {
	this.limePort = limePort;
	updateNextButton();
	changeAndNotifyObservers();
    }

    void setActiveSelfLet(boolean activeSelflet) {
	this.activeSelfLet = activeSelflet;
	changeAndNotifyObservers();
    }

    public boolean isActiveSelflet() {
	return activeSelfLet;
    }

    public boolean isPageComplete() {
	return pageComplete;
    }

    private void updateNextButton() {
	// TODO Verificare:
	// 1.un progetto con lo stesso nome non deve esistere
	// 2.formati dell'indirizzo e delle porte devono essere validi

	if (projectName.length() > 0 && REDsAddress.length() > 0
		&& REDsPort.length() > 0 && limePort.length() > 0) {
	    pageComplete = true;
	} else {
	    pageComplete = false;
	}
    }

    void changeAndNotifyObservers() {
	setChanged();
	notifyObservers(this);
    }

}
