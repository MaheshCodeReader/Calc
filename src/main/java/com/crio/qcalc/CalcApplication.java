package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello world!");
		StandardCalculator calculator = new StandardCalculator();
		calculator.add(Integer.MAX_VALUE,1);
		System.out.println(calculator.getResult());

	}

}
