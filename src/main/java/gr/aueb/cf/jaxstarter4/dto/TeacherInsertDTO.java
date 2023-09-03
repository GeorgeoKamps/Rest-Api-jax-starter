package gr.aueb.cf.jaxstarter4.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class TeacherInsertDTO {

    //@NotNull(message = "Please fill the id")
   //private long id;

    @Size(min = 6, max = 6, message = "Ssn must be 6 digit long")
    private String ssn;

    @NotBlank(message = "please fill the firstname")
    private String firstname;

    @NotBlank(message = "please fill the lastname")
    private String lastname;


    //public long getId() {
        //return id;
   // }
    //public void setId(long id) {
    //    this.id = id;
    //}

    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
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
}
