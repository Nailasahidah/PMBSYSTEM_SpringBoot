package com.pmb_system.pmb_system.registRepo;

import com.pmb_system.pmb_system.register.register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface registerRepository
        extends JpaRepository<register, Integer> {

    boolean existsRegisterByno_wa(String no_wa);
}
