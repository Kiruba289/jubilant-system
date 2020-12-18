package com.minipro;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderInJava1 {

	public static void main(String[] args) {
		List<Book1> books = readBooksFromCSV("C:/Users/K. Kiruba/Desktop/lti training/practice.csv"); // let's print all the person read from CSV file
		for (Book1 b : books) {
			System.out.println(b);
		}
	}

	private static List<Book1> readBooksFromCSV(String fileName) {
		List<Book1> books = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		//System.out.println(fileName);
		//System.out.println(pathToFile);

		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {

			String line = br.readLine();
			//System.out.println(line);
			
			while (line != null) {
                
				String[] attributes = line.split(",");
				//System.out.println(attributes);
				Book1 book = createBook1(attributes);

				books.add(book);

				line = br.readLine();
				System.out.println(line);
			}

		} 
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		return books;
	}


private static Book1 createBook1 (String[] metadata) {
	String name = metadata[0]; 
	String price = metadata[1];
	String author = metadata[2]; // create and return book of this metadata return new Book(name, price, author); 
	return new Book1(name,price,author);
	}
}


class Book1 {
	private String name;
	private String price;
	private String author;

	public Book1(String name, String price, String author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + "]";
	}
}
