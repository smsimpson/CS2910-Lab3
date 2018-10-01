/**
 Change the Measurer Interface from Chapter 9 (provided below)
 to a generic interface. Provide a static method
 T max(T[] values, Measurer<T> meas).
 */
public interface Measurer<T> {
    /**
     Computes the measure of an object.
     @param anObject the object to be measured
     @return the measure
     */
    double measure(T anObject);


    //add max to your generic interface
    static <T> T max(T[] values, Measurer<T> meas) {
        T temp = values[0];
        for (T t : values) {
            if (meas.measure(temp) < meas.measure(t)) {
                temp = t;
            }
        }
        return temp;
    }
}
