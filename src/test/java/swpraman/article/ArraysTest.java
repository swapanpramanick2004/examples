package swpraman.article;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArraysTest {

        @Test
        public void arrayInitializationExample() {
                int[] num = new int[]{2, 4, 1, 7, 6};
                String[] names = new String[]{"John", "James", "Mary"};
                Assert.assertEquals(5, num.length);
                Assert.assertEquals(1, num[2]);
                Assert.assertEquals(3, names.length);
                Assert.assertEquals("James", names[1]);
        }

        @Test
        public void arrayFillsExample() {
                boolean[] flags = new boolean[100];
                Arrays.fill(flags, false);
                Assert.assertEquals(false, flags[49]);
                Assert.assertEquals(false, flags[0]);
                Assert.assertEquals(false, flags[24]);
        }

        @Test(expected=ArrayIndexOutOfBoundsException.class)
        public void invalidIndexExample() {
                int[] num = new int[]{2, 4, 1, 7, 6};
                num[10] = 10; // throws ArrayIndexOutOfBoundsException
        }

        public void arraySumExample() {
                int[] num = new int[]{2, 4, 1, 7, 6};
                int sum = 0;
                for  (int i = 0; i < num.length; i++) {
                        sum += num[i];
                }
                Assert.assertEquals(20, sum);

        }

        public void arraySumForEachExample() {
                int[] num = new int[]{2, 4, 1, 7, 6};
                int sum = 0;
                for  (int ele : num) {
                        sum += ele;
                }
                Assert.assertEquals(20, sum);

        }

        public void arrayMaxExample() {
                int[] num = new int[]{2, 4, 1, 7, 6};
                int max = num[0];
                int i = 1;
                while ( i < num.length) {
                        max = (num[i] > max) ? num[i] : max;
                        i++;
                }
                Assert.assertEquals(7, max);

        }

        @Test
        public void arraySquareWithSideEffectExample() {
                int[] num = new int[] {2, 3, 5};
                square(num);
                Assert.assertEquals(4, num[0]);
        }

        @Test
        public void arraySquareWithoutSideEffectExample() {
                int[] num = new int[] {2, 3, 5};
                int[] squares = square2(num);
                Assert.assertEquals(4, squares[0]);
                Assert.assertEquals(2, num[0]);
        }

        void square(int[] values) {
                for (int i = 0; i < values.length; i++) {
                        values[i] *= values[i];
                }
        }

        int[] square2(int[] values) {
                int[] squares = new int[values.length];
                for (int i = 0; i < values.length; i++) {
                        squares[i] = values[i] * values[i];
                }
                return squares;
        }


}
