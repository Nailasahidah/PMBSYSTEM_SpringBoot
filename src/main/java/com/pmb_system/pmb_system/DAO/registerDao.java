package com.pmb_system.pmb_system.DAO;

import com.pmb_system.pmb_system.register.register;

import java.util.List;
import java.util.Optional;

public interface registerDao {
    List<register> selectAllRegisters();

    Optional<register> selectRegisterById(Integer id);
    void insertRegister(register register);
    boolean existPersonWithno_wa(String no_wa);
}
