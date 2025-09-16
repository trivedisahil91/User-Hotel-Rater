package com.lcwd.hotel.entites;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="hotel")
//@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Hotel {


    @Id
    private String id;
    private String name;
    private String location;
    private String about;


}
