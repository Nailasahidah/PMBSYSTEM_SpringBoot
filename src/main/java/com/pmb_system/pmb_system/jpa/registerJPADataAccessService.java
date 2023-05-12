package com.pmb_system.pmb_system.jpa;

import com.pmb_system.pmb_system.DAO.registerDao;
import com.pmb_system.pmb_system.registRepo.registerRepository;
import com.pmb_system.pmb_system.register.register;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("jpaRegister")
public class registerJPADataAccessService implements registerDao {
    public registerJPADataAccessService(registerRepository registerRepository) {
        this.registerRepository = registerRepository;
    }

    private final registerRepository registerRepository;

    @Override
    public List<register> selectAllRegisters() {
        return registerRepository.findAll();
    }

    @Override
    public Optional<register> selectRegisterById(Integer id) {
        return registerRepository.findById(id);
    }

    @Override
    public void insertRegister(register register) {
        registerRepository.save(register);
    }

    @Override
    public boolean existPersonWithno_wa(String no_wa) {
        return registerRepository.existsRegisterByno_wa(no_wa);
    }

}
