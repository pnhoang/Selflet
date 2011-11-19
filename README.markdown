Welcome to the Selflet wiki!

Selflet is a framework for autonomous computing developed at Politecnico di Milano. Selflet has been previously implemented in Eclipse Plugin Development Tools with the use of ErgoUML. This implementation focuses on the use of Eclipse Graphical Modeling Framework to make graphical diagrams. A diagram contains implementation Behaviors of a Service, each Behavior can be Elementary Behavior or Complex Behavior. 

A Behavior is represented as several states with the connections between states. Elementary Behavior has one Initial State, this state connects to an Invocation State where it can call an Ability, each Invocation State has an Action file that may be written in Java as a block of function in which the parameters could be replaced by the callers of the Service, the Invocation State then connects to the Final State. Complex Behavior has one Initial State, this state can connect to as many Intermediate States as possible, on each connection link, there is a Condition that defines how a state transfer from one state to another, each Intermediate State has also an Action file, that may be written in Java as a Block of function as in Invocation State; several Final States can be present in Complex Behavior.

This is an example of a Selflet service with 1 Elementary Behavior implementation and 2 Complex Behavior implementations:

![A Selflet service with 1 Elementary Behavior implementation and 2 Complex Behavior implementations](http://dl.dropbox.com/u/13281717/Selflet%20service%20diagram%20screenshot.png)

INSTRUCTIONS:

- From Eclispe, choose New Project, select an empty Project
- Add a new File and choose New SelfletBehavior Diagram
- Enter the name for the diagram and the name for the model data
- You should be able to add new Service to the diagram and save changes!
- Happy making diagrams of Selflet!