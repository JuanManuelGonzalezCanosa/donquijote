package com.libreria.donquijote.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , nullable = false)
    private Integer id;

    @Column(name = "name" , nullable = false)
    private String name;

    @Column(name = "last_name" , nullable = false)
    private String lastName;

    @Column(name = "dni" , nullable = false)
    private long dni;

    @Column(name = "active")
    private boolean active = true;

}
