INTRODUCTIONS
=============

Welcome to the Selflet wiki!

Selflet is a framework for autonomous computing developed at Politecnico di Milano. Selflet has been previously implemented in Eclipse Plugin Development Tools with the use of ArgoUML by Nicola Calcavecchia: [SelfletClipse](http://selfletclipse.sourceforge.net/ "SelfletClipse"). This implementation focuses on the use of Eclipse Graphical Modeling Framework to make graphical diagrams, integrates the current version of SelfletClipse but removes all the dependencies from ArgoUML. 

SelfletClipse is a plugin that supports 3 wizards for the creation of Selflet project:

- Selflet 
- Selflet Behavior
- Selflet Goal (Service)

In this implementation, we will re-use the 2 wizards: Selflet and Selflet Behavior. Selflet Goal wizard is instead substituted by Selflet Service which is a GMF integrated wizard for creation of Service diagram and Service model.


A Service diagram contains behaviors implementations of a Service, each Behavior can be Elementary Behavior or Complex Behavior. 

A Behavior is represented as several states with the connections between states. 

Elementary Behavior has one Initial State, this state connects to an Invocation State where it can call an Ability, each Invocation State has an Action file that may be written in Java as a block of function in which the parameters could be replaced by the callers of the Service, the Invocation State then connects to the Final State. In this implementation, when an Action is added into the Invocation State, user has the chance to insert the Ability file which is a .jar package, the plugin will then copy this Ability file into the project folder and automatically create the Action file for this State. The generated template for the Action file is also provided in order to guide the developer to write implementation code for this Invocation State.

Complex Behavior has one Initial State, this state can connect to as many Intermediate States as possible, on each connection link, there is a Condition that defines how a state transfer from one state to another, each Intermediate State has also an Action file, that may be written in Java as a Block of function as in Invocation State; several Final States can be present in Complex Behavior. In this implementation, as with the Elementary Behavior's states, when an Action is added into the Service State, user also has the chance to insert the Ability file which is also a .jar package, the plugin will also copy the Ability file into the project folder and automatically create the Action file for this State, the generated template for this Action file though is different from the Action State for Service State. It contains a sample block of code that has reference to the Service name and parameters to the external variables.

This is an example of a Selflet service with 1 Elementary Behavior implementation and 1 Complex Behavior implementation. The diagram and diagram model are available in the source code folder called runtime_workspace


![A Selflet service with 1 Elementary Behavior implementation and 1 Complex Behavior implementation](http://dl.dropbox.com/u/13281717/service_diagram_v0.1.5.png)


INSTRUCTIONS:
=============

- From Eclispe, choose New Project, select Selflet category, then Selflet
- Specify the parameters in the wizard for the creation of the Selflet: the Selflet name, the project description, the Active selflet, REDs address, Lime port
- Click Next and specify the Goal(Service) name, add at least one parameter and select it for the Output, other parameters are added as Input if necessary
- Click Finish and the project is created into the current workspace with the following folder structure: abilities, actions, behaviors, conditions, goals (services), rules, and the selflet.xml
- Right click on the behaviors folder and add a new File, choose the Selflet Service in the Selflet category
- Enter the name for the diagram and the name for the model data
- The diagram will be presented with a default service with the name as the same as the model name
- Now we can be able to add Elementary Behavior and Complex Behavior into the diagram, add States into the Behavior and connections between States, add Action inside the State and select the Ability .jar file for the current Action.
- That's it. Happy making diagrams of Selflet!