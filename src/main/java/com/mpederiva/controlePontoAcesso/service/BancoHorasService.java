package com.mpederiva.controlepontoacesso.service;

import com.mpederiva.controlepontoacesso.model.BancoHoras;
import com.mpederiva.controlepontoacesso.model.Calendario;
import com.mpederiva.controlepontoacesso.repository.BancoHorasRepository;
import com.mpederiva.controlepontoacesso.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

    BancoHorasRepository bancoHorasRepository;

    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository) {
        this.bancoHorasRepository = bancoHorasRepository;
    }

    public BancoHoras sabeBancoHoras(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }

    public List<BancoHoras> findAll() {
        return bancoHorasRepository.findAll();
    }

    public Optional<BancoHoras> getById(Long idBancoHoras) {
        return bancoHorasRepository.findById(idBancoHoras);
    }

    public BancoHoras updateBancoHoras(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }

    public void deleteBancoHoras(Long idBancoHoras) {
        bancoHorasRepository.deleteById(idBancoHoras);
    }
}
