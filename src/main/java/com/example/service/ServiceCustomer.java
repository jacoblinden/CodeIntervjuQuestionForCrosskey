package com.example.service;

import com.example.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceCustomer {
        private final DAO dao;
        @Autowired
        public ServiceCustomer(@Qualifier("Dao") DAO dao) {
            this.dao = dao;
        }

        public int setCustomerData(String data) {
            return dao.setCustomerData(data);
        }

        public String getCustomerData() {
            return dao.getCustomerData();
        }
    }
