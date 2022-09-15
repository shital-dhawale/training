package com.stream.api1_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//1. WAP to find the city with less area and highest population
//2. WAP to find the city with high pollution_index and high city area. 
//3. WAP to print the city detail on the basis of lowest pollution_index first 
//and so on.
//4. WAP to print city with lowest pollution index and lowest area of city.
//5. WAP to count how many cities in every state we are having. 
//6. WAP to print total area of each state.
public class TestMain {
	public static void main(String[] args) {
		State sate1 = new State(101, "Maharashtra");
		City city1 = new City(201, "Mumbai", sate1, 10.1f, 20961000, 603);
		State sate2 = new State(101, "Maharashtra");
		City city2 = new City(201, "Nagpur", sate2, 12.6f, 4653171, 393);
		State sate3 = new State(101, "Maharashtra");
		City city3 = new City(201, "Pune", sate3, 9.0f, 6987000, 7256);
		State sate4 = new State(101, "Maharashtra");
		City city4 = new City(201, "Nashik", sate4, 12.5f, 1486053, 15582);
		State sate5 = new State(101, "Maharashtra");
		City city5 = new City(201, "Ahmednagar", sate5, 5.1f, 379845, 39);
		
		List<City> list = new ArrayList<City>();
		list.add(city1);
		list.add(city2);
		list.add(city3);
		list.add(city4);
		list.add(city5);
		
		List<City> lessAreaCity = (List<City>) list.stream().sorted(new Comparator<City>() {

			@Override
			public int compare(City o1, City o2) {
				if(o1.getArea_of_city()>o2.getArea_of_city()) {
				return 1;
			}
				if(o1.getArea_of_city()<o2.getArea_of_city()) {
					return -1;
				}else {
					return 0;
				}
			}
			
		}).collect(Collectors.toList());
		System.out.println("City having less area : " +lessAreaCity.get(0));
		System.out.println();
		System.out.println("City having highest area : " +lessAreaCity.get(lessAreaCity.size()-1));
		
		List<City> highestPopulationCity = (List<City>) list.stream().sorted(new Comparator<City>() {

			@Override
			public int compare(City o1, City o2) {
				if(o1.getPopulation()<o2.getPopulation()) {
				return 1;
			}
				if(o1.getPopulation()>o2.getPopulation()) {
					return -1;
				}else {
					return 0;
				}
			}
			
		}).collect(Collectors.toList());
		System.out.println("City having highest population : " +highestPopulationCity.get(0));
		
		List<City> highPollutionIdexCity = (List<City>) list.stream().sorted(new Comparator<City>() {

			@Override
			public int compare(City o1, City o2) {
				if(o1.getPollutionIndex()<o2.getArea_of_city()) {
				return 1;
			}
				if(o1.getPollutionIndex()>o2.getPollutionIndex()) {
					return -1;
				}else {
					return 0;
				}
			}
			
		}).collect(Collectors.toList());
		System.out.println("City having high pollution index : " +highPollutionIdexCity.get(0));
		System.out.println();
		
		List<City> sortPollutionIndexAscending = (List<City>) list.stream().sorted(new Comparator<City>() {

			@Override
			public int compare(City o1, City o2) {
				if(o1.getPollutionIndex()>o2.getPollutionIndex()) {
				return 1;
			}
				if(o1.getPollutionIndex()<o2.getPollutionIndex()) {
					return -1;
				}else {
					return 0;
				}
			}
			
		}).collect(Collectors.toList());
		System.out.println("Cities sorted in ascending order for polltion index : " +sortPollutionIndexAscending);
		System.out.println();
		System.out.println("City having lowest pollution index : " +sortPollutionIndexAscending.get(0));
		
		
	}
}
