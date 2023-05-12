package com.pmb_system.pmb_system.listData;

import com.pmb_system.pmb_system.DAO.registerDao;
import com.pmb_system.pmb_system.register.register;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("list")
public class registerListDataAccessService implements registerDao {

    private static List<register> registers;

    static {
        registers = new ArrayList<>();
        register naila = new register(
                1,
                "Naila Sahidah",
                "085243687432",
                "happy"
        );
        registers.add(naila);

        register fatimah = new register(
                2,
                "Fatimah Azzahra",
                "089654234764",
                "sweet"
        );
        registers.add(fatimah);
    }


    @Override
    public List<register> selectAllRegisters() {
        return registers;
    }

    @Override
    public Optional<register> selectRegisterById(Integer id) {
        return registers.stream()
                .filter(register -> register.getId().equals(id))
                .findFirst();
    }

    @Override
    public void insertRegister(register register) {
        registers.add(register);
    }

    @Override
    public boolean existPersonWithno_wa(String no_wa) {
        return registers.stream()
                .allMatch(register -> register.getNo_wa().equals(no_wa));
    }
}
