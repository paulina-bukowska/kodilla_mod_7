package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor() {
        //Given
        BookDirectoryWithSignature bookDirectory = new BookDirectoryWithSignature();

        //When
        List<BookWithSignature> books = bookDirectory.getBookList();

        //Then
        int numberOfBooksPublicatedAfter2007 = 0;
        for (BookWithSignature book : books) {
            if (book.getYearOfPublication() > 2007) {
                numberOfBooksPublicatedAfter2007++;
            }
        }
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }

    @Test
    public void testGetListUsingIntStream() {
        //Given
        BookDirectoryWithSignature bookDirectory = new BookDirectoryWithSignature();

        //When
        List<BookWithSignature> books = bookDirectory.getBookList();

        //Then
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .count();

/*      lub
        //Then
        int numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .map(n -> 1)
                .sum();
*/

        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }
}
