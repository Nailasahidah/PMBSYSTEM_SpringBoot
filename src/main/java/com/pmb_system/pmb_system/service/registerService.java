package com.pmb_system.pmb_system.service;

import com.pmb_system.pmb_system.DAO.registerDao;
import com.pmb_system.pmb_system.Exception.ResourceNotFound;
import com.pmb_system.pmb_system.register.register;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class registerService {
    private registerDao registerDao;

    public registerService(@Qualifier("jpaRegister") registerDao registerDao) {
        this.registerDao = registerDao;
    }

    public List<register> getAllRegisters() {
        return registerDao.selectAllRegisters();
    }

    public register getRegisters(Integer id) {
        return registerDao.selectRegisterById(id)
                .orElseThrow(()-> new ResourceNotFound(
                        "register with id[%s] not found".formatted(id)
                ));
    }

}
