package com.pmb_system.pmb_system.registController;

import com.pmb_system.pmb_system.register.register;
import com.pmb_system.pmb_system.service.registerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/registers")
public class registerController<registerRegisterRequest> {
    private final registerService registerService;

    public registerController(registerService registerService) {
        this.registerService = registerService;
    }

    @GetMapping
    public List<register> getRegisters() {
        return registerService.getAllRegisters();
    }

    @GetMapping("{registerId}")
    public register getRegister(
            @PathVariable("registerId") Integer registerId) {
        return registerService.getRegisters(registerId);
    }

//    @PostMapping
//    public void registerRegister(
//            @RequestBody registerRegisterRequest request) {
//        registerService.addRegister(request);
//    }
}
