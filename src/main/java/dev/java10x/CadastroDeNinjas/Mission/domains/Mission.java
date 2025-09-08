package dev.java10x.CadastroDeNinjas.Mission.domains;

import dev.java10x.CadastroDeNinjas.Mission.enums.MissionRanking;
import dev.java10x.CadastroDeNinjas.Mission.enums.MissionState;
import dev.java10x.CadastroDeNinjas.NinjaMission.Domains.NinjaMission;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Mission")
@Table(name = "missions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor()
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Setter(AccessLevel.NONE)
    private Long id;

    private String name;

    private String description;

    @Enumerated(EnumType.STRING)
    private MissionRanking ranking;

    @Enumerated(EnumType.STRING)
    private MissionState state;

    private LocalDateTime start_at;
    private LocalDateTime end_at;

    @OneToMany(mappedBy = "mission", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private Set<NinjaMission> ninjaMissions = new HashSet<>();
}
