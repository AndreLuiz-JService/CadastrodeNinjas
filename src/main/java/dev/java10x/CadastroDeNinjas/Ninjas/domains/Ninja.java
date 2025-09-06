package dev.java10x.CadastroDeNinjas.Ninjas.domains;

import dev.java10x.CadastroDeNinjas.NinjaMission.Domains.NinjaMission;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "Ninja")
@Table(name = "ninjas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Setter(AccessLevel.NONE)
    private long id;
    private String name;
    private String email;
    private short age;

    @OneToMany(mappedBy = "ninja", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private Set<NinjaMission> ninjaMissions = new HashSet<>();
}
