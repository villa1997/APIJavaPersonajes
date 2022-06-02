package com.dragonballz.DragonBallZ.Repository;

import com.dragonballz.DragonBallZ.Models.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonajeRepositorio extends JpaRepository<Personaje, Long> {
}
