package pl.coderslab.demo.domain.dto;

import pl.coderslab.demo.domain.Client;
import pl.coderslab.demo.domain.Level;
import pl.coderslab.demo.domain.User;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class SectionDto { //obiekt DTO czyli Data Transfer Object, wykorzystywany do mapowania formularzy html na obiekt javy
    //  some DTO from browser
    //
    //            v
    //
    //Spring @Controller method
    //
    //            v
    //
    //  Spring @Service method
    // mozliwa walidacja w DTO
    @NotNull
    private String dayOfWeek;
    @NotNull
    private String hourStart;
    @NotNull
    private int maxPerson;

    private Level level;

    private User instructor;

    private List<Client> clients=new ArrayList<>();

    //---------------------------------------------------------------------------
    //---GETTERY i SETTERY
    //---------------------------------------------------------------------------

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getHourStart() {
        return hourStart;
    }

    public void setHourStart(String hourStart) {
        this.hourStart = hourStart;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public User getInstructor() {
        return instructor;
    }

    public void setInstructor(User instructor) {
        this.instructor = instructor;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}