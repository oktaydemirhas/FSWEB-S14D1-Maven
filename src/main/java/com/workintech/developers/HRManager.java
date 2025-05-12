package com.workintech.developers;

import java.util.ArrayList;
import java.util.List;

public class HRManager extends Employee{

    private List<JuniorDeveloper> juniorDevelopers;
    private List<MidDeveloper> midDevelopers;
    private List<SeniorDeveloper> seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new ArrayList<>();
        this.midDevelopers = new ArrayList<>();
        this.seniorDevelopers = new ArrayList<>();
    }

    public List<JuniorDeveloper> getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public List<MidDeveloper> getMidDevelopers() {
        return midDevelopers;
    }

    public List<SeniorDeveloper> getSeniorDevelopers() {
        return seniorDevelopers;
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        if (juniorDeveloper == null) {
            System.out.println("JuniorDeveloper boş olamaz.");
            return;
        }
        boolean found = false;
        for(JuniorDeveloper dev : this.juniorDevelopers) {
            if(dev.getId() == juniorDeveloper.getId()) {
                found = true;
                System.out.println(juniorDeveloper.getId() + "id'li dev zaten var.");
                break;
            }
        }
        if (!found) {
            this.juniorDevelopers.add(juniorDeveloper);
            System.out.println("JuniorDeveloper " + juniorDeveloper.getName() + " eklendi.");
        }
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        if (midDeveloper == null) {
            System.out.println("MidDeveloper boş olamaz.");
            return;
        }
        boolean found = false;
        for(MidDeveloper dev : this.midDevelopers) {
            if(dev.getId() == midDeveloper.getId()) {
                found = true;
                System.out.println(midDeveloper.getId() + "id'li dev zaten var.");
                break;
            }
        }
        if (!found) {
            this.midDevelopers.add(midDeveloper);
             System.out.println("MidDeveloper " + midDeveloper.getName() + " eklendi.");
       }
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        if (seniorDeveloper == null) {
            System.out.println("SeniorDeveloper boş olamaz.");
            return;
        }
        boolean found = false;
        for(SeniorDeveloper dev : this.seniorDevelopers) {
            if(dev.getId() == seniorDeveloper.getId()) {
                found = true;
                System.out.println(seniorDeveloper.getId() + "id'li dev zaten var.");
                break;
            }
        }
        if (!found) {
            this.seniorDevelopers.add(seniorDeveloper);
            System.out.println("SeniorDeveloper " + seniorDeveloper.getName() + " eklendi.");
        }
    }

    @Override
    public void work() {
        System.out.println("HR Managerrrr");
        setSalary(getSalary() * 1.05);
    }
}
