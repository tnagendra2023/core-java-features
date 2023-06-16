package com.java;

import java.util.*;
import java.util.stream.Collectors;

//add,remove,disaply,size
public class MyCustomArrayList {

    public void display(String message){
        System.out.println("Hello String");
    }

    public void display(Object message){
        System.out.println("Hello Object");
    }


    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("CDE", "ABC", "EMK", "KTY", "YZA", "YZN");

        //ABC->CDE->EMK->KTY->YZA->

        int[] intArray={1,2,5,6,3,2};
        Optional<Integer> first = Arrays.stream(intArray)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(first.get());

    }

}

    class Author{
        String firstName;
        String lastName;
        int age;

        public Author(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Author author = (Author) o;
            return age == author.age && Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName, age);
        }

        public static void main(String[] args) {
            List<Author> authorList=new ArrayList<>();
            for(int i=0;i<20;i++){
                authorList.add(new Author("naGendra"+i,"Babu"+i,50+i));
            }

            List<String> strings = authorList.stream()
                    .filter(author -> author.age >= 50)
                    .map(author -> author.getLastName().toUpperCase())
                    .sorted()
                    .limit(15)
                    .collect(Collectors.toList());
            System.out.println(strings);

            Set<String> uniqueNumbers = new HashSet<>();
            Random random = new Random();
            String uniqueNumber;

            do {
                uniqueNumber = String.format("%010d", random.nextInt(1_000_000_000));
            } while (!uniqueNumbers.add(uniqueNumber));
            System.out.println(uniqueNumbers);
        }
    }
