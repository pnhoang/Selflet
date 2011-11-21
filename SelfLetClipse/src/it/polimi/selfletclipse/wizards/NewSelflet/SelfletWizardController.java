package it.polimi.selfletclipse.wizards.NewSelflet;

/**
 * @author Nicola
 */
public class SelfletWizardController {

    private SelfletWizardModel model;

    public SelfletWizardController(SelfletWizardModel model) {
	this.model = model;
    }

    public void setLimePort(String port) {
	model.setLimePort(port);
    }

    public void setREDsAddress(String address) {
	model.setREDsAddress(address);
    }

    public void setREDsPort(String port) {
	model.setREDsPort(port);
    }

    public void setAuthorName(String author) {
	model.setAuthorName(author);
    }

    public void setProjectName(String name) {
	model.setProjectName(name);
    }

    public void refreshObservers() {
	model.changeAndNotifyObservers();
    }

    public void setActiveSelflet(boolean activeSelflet) {
	model.setActiveSelfLet(activeSelflet);
    }

    public void setDescription(String description) {
	model.setDescription(description);
    }
}
