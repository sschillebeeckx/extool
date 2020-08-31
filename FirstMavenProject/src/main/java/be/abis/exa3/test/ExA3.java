package be.abis.exa3.test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

import be.abis.exa3.model.Address;
import be.abis.exa3.model.Company;
import be.abis.exa3.model.Person;

public class ExA3 {

	public static void main(String[] args) {

       Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","Belgi�","BE");
       Company c = new Company("ABIS",a);
       
       Person p1 = new Person(1,"Sandy","Schillebeeckx",LocalDate.of(1978, 4, 10),c);
       Person p2 = new Person(2,"John","Doe",LocalDate.of(1967, 8, 10));
       
       try ( BufferedWriter bw = Files.newBufferedWriter(Paths.get("personinfo.txt"));){
    	   bw.write(p1.toString() + "\n");
    	   bw.write(p2.toString() + "\n"); 
    	   System.out.println("persons written to file");
       } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       

	}

}
