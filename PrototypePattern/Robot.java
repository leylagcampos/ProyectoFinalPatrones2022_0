package PrototypePattern;

import java.util.ArrayList;

public class Robot implements Prototype {

    private int ID;
    private ArrayList<String> functionalities;
    private String model;
    private String description;

    public Robot()
    {
       
    }

    public Robot(int ID, ArrayList<String> functionalities, String model, String description) {
        this.setID(ID);
        this.setModel(model);
        this.setDescription(description);
        this.setFunctionalities(functionalities);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<String> getFunctionalities() {
        return functionalities;
    }

    public void setFunctionalities(ArrayList<String> functionalities) {
        this.functionalities = functionalities;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    
    public Robot clonar() {
        Robot rb = new Robot();
        rb.setID(getID());
        rb.setModel(getModel());
        rb.setDescription(getDescription());
        rb.setFunctionalities(getFunctionalities());
        return rb;
    }
}
