package src;

public class Main {

    public static void main(String[] args) {
        Collection firstCollection = new Collection(new Integer[]{10, 11, 12,13,14,15, 5,4, 54, 185, 945, 645, 64,6 ,84, 68, 4,684, 68, 4, 48, 684, 7165});
        Collection secondCollection = new Collection(new Integer[]{10, 11, 12,13,14,15, 5,4, 54, 185, 945, 645, 64,6 ,84, 68, 4,684, 68, 4, 48, 684, 7165});
        Collection ThirdCollection = new Collection(new Integer[]{10, 11, 12,13,14,15, 5,4, 54, 185, 945, 645, 64,6 ,84, 68, 4,684, 68, 4, 48, 684, 7165});
        Collection FourthCollection = new Collection(new Integer[]{10, 11, 12,13,14,15, 5,4, 54, 185, 945, 645, 64,6 ,84, 68, 4,684, 68, 4, 48, 684, 7165});
        Collection FifthCollection = new Collection(new Integer[]{10, 11, 12,13,14,15, 5,4, 54, 185, 945, 645, 64,6 ,84, 68, 4,684, 68, 4, 48, 684, 7165});

        Iterator iterator = new Collection.FirstIteratorImplementator(ThirdCollection.getIntegers()) {

            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                printEveritThirdElementIfInEven(getIntegers());
                return getIntegers();
            }
        };
        System.out.println("First");
        Collection.FirstIteratorImplementator firstImplementator = new Collection.FirstIteratorImplementator(firstCollection.getIntegers());
        firstImplementator.next();
        firstImplementator.hasNext();

        System.out.println("\nSecond");
        Collection.SecondIteratorImplementator secondImplementator = new Collection.SecondIteratorImplementator(secondCollection.getIntegers());
        secondImplementator.next();

        System.out.println("\nThird ");
        iterator.next();

        System.out.println("\nFourth ");
        IteratorForEveryFifthElement everyFifthElementIterator = new IteratorForEveryFifthElement(FourthCollection.getIntegers());
        everyFifthElementIterator.iterateEveryFifthElement(FourthCollection.getIntegers());

        System.out.println("\nFifth ");
        IteratorForEveryFifthElement.InsideIterator.changeNumberIfItOdd(FifthCollection.getIntegers());
    }

    private static void printEveritThirdElementIfInEven(Integer[] ints) {
        for (int i = 0; i < ints.length; i += 3) {
            if (ints[i] % 2 != 0) {
                System.out.println(ints[i]);
            }
        }
    }
}
