package pl.coderslab.demo.domain.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class LevelDto { //obiekt DTO czyli Data Transfer Object, wykorzystywany do mapowania formularzy html na obiekt javy
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
    private String name;

    //---------------------------------------------------------------------------
    //---GETTERY i SETTERY
    //---------------------------------------------------------------------------


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}