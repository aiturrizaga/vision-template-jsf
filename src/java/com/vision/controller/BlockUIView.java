package com.vision.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.context.FacesContext;

@ManagedBean
public class BlockUIView {

    private String firstname;
    private String lastname;
    private List<Car> cars;

    @PostConstruct
    public void init() {
        cars = new ArrayList<Car>();
        cars.add(new Car("Y25YIH5", "Fiat", 2014, "Black", 10000, true));
        cars.add(new Car("JHF261G", "BMW", 2013, "Blue", 50000, true));
        cars.add(new Car("HSFY23H", "Ford", 2012, "Black", 35000, false));
        cars.add(new Car("GMDK353", "Volvo", 2014, "White", 40000, true));
        cars.add(new Car("345GKM5", "Jaguar", 2011, "Gray", 48000, false));
        cars.add(new Car("JETER36", "Volkswagen", 2012, "Black", 10000, true));
        cars.add(new Car("3754HWH", "BMW", 2014, "Blue", 33000, true));
        cars.add(new Car("YRTJD45", "Mercedes", 2011, "Red", 44000, false));
        cars.add(new Car("FDGSH34", "Audi", 2010, "Yellow", 20000, false));
        cars.add(new Car("GD534G", "Honda", 2012, "Black", 17000, false));
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void save() throws Exception {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You've registered"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
