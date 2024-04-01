package com.learn.springsecurity.entites;


import jakarta.persistence.*;

@Entity
@Table(name =   "tb_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private  Long roleId;

    @Column(unique = true)
    private String name;

    public enum  Values{
        BASIC(2L),
        ADMIN(1L);
        Long roleId;

        Values(Long roleId) {
            this.roleId = roleId;
        }

        public Long getRoleId() {
            return roleId;
        }
    }
}
