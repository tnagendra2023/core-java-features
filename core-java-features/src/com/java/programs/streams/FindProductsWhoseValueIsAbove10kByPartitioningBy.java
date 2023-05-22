package com.java.programs.streams;

import com.java.dto.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Overall, partitioningBy is useful when you want to split a stream into two groups based on a predicate and collect the elements into separate lists for each group.
 * Filtering based on a condition: When you want to filter elements from a stream based on a condition and collect them separately.
 * For instance, separating a list of products into expensive and affordable products based on their prices.
 * */

public class FindProductsWhoseValueIsAbove10kByPartitioningBy {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(new Product(10000, "one plus buds pro"),
                new Product(20000, "air pod buds"),
                new Product(40000, "apple watch"),
                new Product(90000, "iphone 13 pro"),
                new Product(8000, "real me buds pro"),
                new Product(7000, "redmi a1 phone"),
                new Product(10000, "samsung phone"),
                new Product(2000, "one plus bluetooth earphones")
        );

        Map<Boolean, List<Product>> partitionedMap = productList.stream()
                .collect(Collectors.partitioningBy(transaction -> transaction.amount() > 10000));

        List<Product> highTransactionProducts = partitionedMap.get(true);
        List<Product> lowTransactionProducts = partitionedMap.get(false);

        System.out.println("Products whose values is above 10000 rupees;");
        highTransactionProducts.forEach(product -> System.out.println(product.productName()+"-"+product.amount()));
        System.out.println("Products whose values is less than or equal to 10000 rupees:");
        lowTransactionProducts.forEach(product -> System.out.println(product.productName()+"-"+product.amount()));
    }
}
