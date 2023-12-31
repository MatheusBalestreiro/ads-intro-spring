package br.com.matheusbales.rentacar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CustomerDTO extends RepresentationModel {
    private int id;
    private String firstName;
    private String lastName;
    private String city;

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
