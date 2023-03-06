package com.mandark.assignment.EmployeeListing;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

/**
 * Hello world!
 *
 */
public class EmployeeListing 
{
    public static void main( String[] args ) throws CsvValidationException, IOException
    {
        CSVReader reader=new CSVReader(new FileReader("src\\main\\resources\\EmployeeDatainCSV\\employees.csv"));
        CSVWriter writer1=new CSVWriter(new FileWriter("src\\main\\resources\\EmployeeDatainCSV\\managers.csv"));
        CSVWriter writer2=new CSVWriter(new FileWriter("src\\main\\resources\\EmployeeDatainCSV\\single_name_employees.csv"));
        StringBuilder sb=new StringBuilder();
        String[] employee;
        while((employee=reader.readNext()) !=null) {
        	if(employee[1].equals("Manager") && employee[2].equals("R&D")) {
        		writer1.writeNext(employee);
        	}
        	String[] name=employee[0].split(" ");
        	if(name.length==1)
        		writer2.writeNext(employee);
        }
        writer1.flush();
        writer2.flush();
        System.out.println("The employee data is succesfully written into their respective files");
    }
}
