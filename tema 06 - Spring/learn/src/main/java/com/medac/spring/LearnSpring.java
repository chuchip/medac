package com.medac.spring;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class LearnSpring {
	@Autowired
	MiBean miBean;

	public static void main(String[] args) {
		SpringApplication.run(LearnSpring.class, args);
//		LearnSpring learnSpring= new LearnSpring();
//		learnSpring.ejecutame();
	}

	@PostConstruct
	void ejecutame()
	{
		System.out.println(miBean.saluda("Jesús"));
	}
}

@Component
class MiBean
{
	String saludo="Hola ... ";
	public MiBean()
	{
		System.out.println("Iniciando clase MiBean");
	}

	public String saluda(String nombre)
	{
		return saludo+ nombre;
	}

	@PostConstruct
	void ejecuta_despues_de_construir()
	{
		System.out.println("Ejecutado despues de construir");
	}
}



