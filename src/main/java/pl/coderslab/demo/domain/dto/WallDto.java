package pl.coderslab.demo.domain.dto;

import javax.validation.constraints.NotNull;

public class WallDto {
    @NotNull
    private String name;
    @NotNull
    private String address;
    private String description;
    @NotNull
    private String openHours;



    //---------------------------------------------------------------------------
    //---GETTERY i SETTERY
    //---------------------------------------------------------------------------


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }
}
