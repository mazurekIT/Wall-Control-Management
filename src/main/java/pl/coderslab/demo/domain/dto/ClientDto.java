package pl.coderslab.demo.domain.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class ClientDto { //obiekt DTO czyli Data Transfer Object, wykorzystywany do mapowania formularzy html na obiekt javy
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
    private String firstName;
    @NotNull
    private String lastName;
    @Email
    private String email;
    @NotNull
    private String phone;
    @NotNull
    private String birthDate;

    private boolean kid;

    //---------------------------------------------------------------------------
    //---GETTERY i SETTERY
    //---------------------------------------------------------------------------


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isKid() {
        return kid;
    }

    public void setKid(boolean kid) {
        this.kid = kid;
    }
}