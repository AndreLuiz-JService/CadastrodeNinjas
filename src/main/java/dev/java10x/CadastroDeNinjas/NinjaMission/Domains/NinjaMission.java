package dev.java10x.CadastroDeNinjas.NinjaMission.Domains;

import dev.java10x.CadastroDeNinjas.Mission.domains.Mission;
import dev.java10x.CadastroDeNinjas.Ninjas.domains.Ninja;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name = "NinjaMissoes")
@Table(name = "ninja_missoes")
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class NinjaMission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private LocalDateTime joined_at;
    private LocalDateTime finished_at;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ninja_id", nullable = false)
    private Ninja ninja;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id", nullable = false)
    private Mission mission;
}
