package com.org.vg.pcf.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.org.vg.pcf.domain.Fund;


@Service
public class FundServiceImpl implements FundService {



    @Override
    public List<Fund> getFunds() {
        //return injectedFundRepository.findAll();
    	Fund f1 = new Fund("1873");
    	f1.setFundName("Index Fund");
    	Fund f2 = new Fund("9544");
    	f2.setFundName("Active Managed Fund");
    	Fund f3 = new Fund("5473");
    	f3.setFundName("Bond Index Fund");
    	List<Fund> funds = new ArrayList<>();
    	funds.add(f1);
    	funds.add(f2);
    	funds.add(f3);
    	return funds;
    }

}
