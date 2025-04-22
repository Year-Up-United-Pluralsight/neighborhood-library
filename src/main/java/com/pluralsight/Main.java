package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        Book[] library = getPopulatedLibrary();

    }

    private static Book[] getPopulatedLibrary() {

        Book[] library = new Book[20];

        library[0] = new Book(1, "ISBN 978-1-78862-355-1", "Frankenstein by Mary Shelley");
        library[1] = new Book(2, "ISBN 978-0-14-143951-8", "Pride and Prejudice by Jane Austen");
        library[2] = new Book(3, "ISBN 978-0-14-144114-6", "Jane Eyre by Charlotte Brontë");
        library[3] = new Book(4, "ISBN 978-0-14-143960-0", "Wuthering Heights by Emily Brontë");
        library[4] = new Book(5, "ISBN 978-0-14-143956-3", "Great Expectations by Charles Dickens");
        library[5] = new Book(6, "ISBN 978-0-14-143960-0", "A Tale of Two Cities by Charles Dickens");
        library[6] = new Book(7, "ISBN 978-0-14-143947-1", "Dracula by Bram Stoker");
        library[7] = new Book(8, "ISBN 978-0-452-28423-4", "1984 by George Orwell");
        library[8] = new Book(9, "ISBN 978-0-452-28424-1", "Animal Farm by George Orwell");
        library[9] = new Book(10, "ISBN 978-0-15-662870-9", "To the Lighthouse by Virginia Woolf");
        library[10] = new Book(11, "ISBN 978-0-15-662870-9", "Mrs. Dalloway by Virginia Woolf");
        library[11] = new Book(12, "ISBN 978-0-14-143957-0", "The Picture of Dorian Gray by Oscar Wilde");
        library[12] = new Book(13, "ISBN 978-0-06-085052-4", "Brave New World by Aldous Huxley");
        library[13] = new Book(14, "ISBN 978-0-14-042438-6", "The Canterbury Tales by Geoffrey Chaucer");
        library[14] = new Book(15, "ISBN 978-0-571-05686-6", "Lord of the Flies by William Golding");
        library[15] = new Book(16, "ISBN 978-0-19-953622-0", "Dr Jekyll and Mr Hyde by Robert Louis Stevenson");
        library[16] = new Book(17, "ISBN 978-0-14-132100-4", "Treasure Island by Robert Louis Stevenson");
        library[17] = new Book(18, "ISBN 978-0-19-964617-2", "The Secret Garden by Frances Hodgson Burnett");
        library[18] = new Book(19, "ISBN 978-0-14-043512-4", "Far from the Madding Crowd by Thomas Hardy");
        library[19] = new Book(20, "ISBN 978-0-14-043474-5", "The Tenant of Wildfell Hall by Anne Brontë");

        return library;
    }
}