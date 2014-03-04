import java.util.ArrayList;
import java.util.List;

public class CollectionUtils {
    public static int max(int... ns) {
        int max = Integer.MIN_VALUE;
        for(int n : ns) {
            if(max < n) {
                max = n;
            }
        }
        return max;
    }

    public static int min(int... ns) {
        int min = Integer.MAX_VALUE;
        for(int n : ns) {
            if(n < min) {
                min = n;
            }
        }
        return min;
    }

    public static long max(long... ns) {
        long max = Long.MIN_VALUE;
        for(long n : ns) {
            if(max < n) {
                max = n;
            }
        }
        return max;
    }

    public static long min(long... ns) {
        long min = Long.MAX_VALUE;
        for(long n : ns) {
            if(n < min) {
                min = n;
            }
        }
        return min;
    }

    public static double max(double... ns) {
        double max = Double.MIN_VALUE;
        for(double n : ns) {
            if(max < n) {
                max = n;
            }
        }
        return max;
    }

    public static double min(double... ns) {
        double min = Long.MAX_VALUE;
        for(double n : ns) {
            if(n < min) {
                min = n;
            }
        }
        return min;
    }

    public static int[] reverse(int[] ns) {
        int[] result = new int[ns.length];
        for(int i=0; i<ns.length; i++) {
            result[i] = ns[ns.length - i - 1];
        }
        return result;
    }

    public static long[] reverse(long[] ns) {
        long[] result = new long[ns.length];
        for(int i=0; i<ns.length; i++) {
            result[i] = ns[ns.length - i - 1];
        }
        return result;
    }

    public static double[] reverse(double[] ns) {
        double[] result = new double[ns.length];
        for(int i=0; i<ns.length; i++) {
            result[i] = ns[ns.length - i - 1];
        }
        return result;
    }

    public static int[] merge(int[]... ars) {
        int total = 0;
        for(int[] ar : ars) {
            total += ar.length;
        }
        int[] result = new int[total];
        int idx = 0;
        for(int[] ar : ars) {
            System.arraycopy(ar, 0, result, idx, ar.length);
            idx += ar.length;
        }
        return result;
    }

    public static long[] merge(long[]... ars) {
        int total = 0;
        for(long[] ar : ars) {
            total += ar.length;
        }
        long[] result = new long[total];
        int idx = 0;
        for(long[] ar : ars) {
            System.arraycopy(ar, 0, result, idx, ar.length);
            idx += ar.length;
        }
        return result;
    }

    public static double[] merge(double[]... ars) {
        int total = 0;
        for(double[] ar : ars) {
            total += ar.length;
        }
        double[] result = new double[total];
        int idx = 0;
        for(double[] ar : ars) {
            System.arraycopy(ar, 0, result, idx, ar.length);
            idx += ar.length;
        }
        return result;
    }

    public static long sum(int... ns) {
        long sum = 0;
        for(int n : ns) {
            sum += n;
        }
        return sum;
    }

    public static long sum(long... ns) {
        long sum = 0;
        for(long n : ns) {
            sum += n;
        }
        return sum;
    }

    public static double sum(double... ns) {
        double sum = 0;
        for(double n : ns) {
            sum += n;
        }
        return sum;
    }

    public static int[] subArray(int[] ns, int start, int end) {
        if(start < 0 || end < 0 || ns.length < start || ns.length < end || end < start) {
            throw new IllegalArgumentException();
        }
        int[] result = new int[end - start];
        System.arraycopy(ns, start, result, 0, end - start);
        return result;
    }

    public static long[] subArray(long[] ns, int start, int end) {
        if(start < 0 || end < 0 || ns.length < start || ns.length < end || end < start) {
            throw new IllegalArgumentException();
        }
        long[] result = new long[end - start];
        System.arraycopy(ns, start, result, 0, end - start);
        return result;
    }

    public static double[] subArray(double[] ns, int start, int end) {
        if(start < 0 || end < 0 || ns.length < start || ns.length < end || end < start) {
            throw new IllegalArgumentException();
        }
        double[] result = new double[end - start];
        System.arraycopy(ns, start, result, 0, end - start);
        return result;
    }

    public static int[][] split(int[] ns, int index) {
        if(index < 0 || ns.length < index) {
            throw new IllegalArgumentException();
        }
        return new int[][]{subArray(ns, 0, index), subArray(ns, index, ns.length)};
    }

    public static long[][] split(long[] ns, int index) {
        if(index < 0 || ns.length < index) {
            throw new IllegalArgumentException();
        }
        return new long[][]{subArray(ns, 0, index), subArray(ns, index, ns.length)};
    }

    public static double[][] split(double[] ns, int index) {
        if(index < 0 || ns.length < index) {
            throw new IllegalArgumentException();
        }
        return new double[][]{subArray(ns, 0, index), subArray(ns, index, ns.length)};
    }

    public int[] intListToArray(List<Integer> list) {
        int[] ns = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            ns[i] = list.get(i);
        }
        return ns;
    }

    public long[] longListToArray(List<Long> list) {
        long[] ns = new long[list.size()];
        for(int i=0; i<list.size(); i++) {
            ns[i] = list.get(i);
        }
        return ns;
    }

    public double[] doubleListToArray(List<Double> list) {
        double[] ns = new double[list.size()];
        for(int i=0; i<list.size(); i++) {
            ns[i] = list.get(i);
        }
        return ns;
    }

    public List<Integer> intArrayToList(int[] ns) {
        List<Integer> list = new ArrayList<Integer>(ns.length);
        for(int n : ns) {
            list.add(n);
        }
        return list;
    }

    public List<Long> intArrayToList(long[] ns) {
        List<Long> list = new ArrayList<Long>(ns.length);
        for(long n : ns) {
            list.add(n);
        }
        return list;
    }

    public List<Double> intArrayToList(double[] ns) {
        List<Double> list = new ArrayList<Double>(ns.length);
        for(double n : ns) {
            list.add(n);
        }
        return list;
    }
}
