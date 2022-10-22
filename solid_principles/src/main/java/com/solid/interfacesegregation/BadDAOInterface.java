package com.solid.interfacesegregation;

//This dao interface defined to support data access using file system
// or database system. So we have added openConnection and openFile for it
// this bad because we have accomodate all operation in single interface.
public interface BadDAOInterface {
    public void openConnection();
    public void createRecord();
    public void openFile();
    public void deleteRecord();
}
