package com.bawono.tutorial.springdata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bawono.tutorial.springdata.model.Pemain;
import com.bawono.tutorial.springdata.repository.PemainRepository;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataApplication.class, args);
		PemainRepository pemainrepository = context.getBean(PemainRepository.class);
		@SuppressWarnings("serial")
		List<Pemain> daftarPemain = pemainrepository.findAll(new ArrayList<Long>(0) {
			{
				add(3L);
				add(5L);
			}
		});
		System.out.println("Daftar Pemain");
		for (Pemain dataPemain : daftarPemain) {
			System.out.println(dataPemain.toString());
		}
	}
}
